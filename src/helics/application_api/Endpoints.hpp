/*
Copyright (c) 2017-2019,
Battelle Memorial Institute; Lawrence Livermore National Security, LLC; Alliance for Sustainable Energy, LLC.  See
the top-level NOTICE for additional details. All rights reserved.
SPDX-License-Identifier: BSD-3-Clause
*/
#pragma once

#include "MessageFederate.hpp"
#include <type_traits>

namespace helics
{
/** class to manage an endpoint */
class Endpoint
{
  private:
    MessageFederate *fed = nullptr;  //!< the MessageFederate to interact with
    interface_handle handle;  //!< the id as generated by the Federate
    int referenceIndex = -1;  //!< an index used for callback lookup
    void *dataReference = nullptr;  //!< pointer to a piece of containing data
    std::string targetDest;  //!< a predefined target destination
    std::string actualName;  //!< the name of the endpoint
    bool disableAssign = false;  //!< disable assignment for the object
  public:
    /** default constructor*/
    Endpoint () = default;
    /**/
    // constructor used by messageFederateManager
    Endpoint (MessageFederate *mfed, const std::string &name, interface_handle id, void *data)
        : fed (mfed), handle (id), dataReference (data), actualName (name)
    {
    }

    Endpoint (MessageFederate *mFed, const std::string &name, const std::string &type = std::string ())
        : Endpoint (mFed->registerEndpoint (name, type))
    {
    }

    template <class FedPtr>
    Endpoint (FedPtr &mFed, const std::string &name, const std::string &type = std::string ())
        : Endpoint (mFed->registerEndpoint (name, type))
    {
        static_assert (std::is_base_of<MessageFederate, std::remove_reference_t<decltype (*mFed)>>::value,
                       "first argument must be a pointer to a MessageFederate");
    }
    /**constructor to build an endpoint object
    @param locality visibility of the endpoint either global or local
    @param mFed  the MessageFederate to use
    @param name the name of the endpoint
    @param type a named type associated with the endpoint
    */
    Endpoint (interface_visibility locality,
              MessageFederate *mFed,
              const std::string &name,
              const std::string &type = std::string ());
    /**constructor to build an endpoint object
    @param locality visibility of the endpoint either global or local
    @param mFed  the MessageFederate to use
    @param name the name of the endpoint
    @param type a named type associated with the endpoint
    */
    template <class FedPtr>
    Endpoint (interface_visibility locality,
              FedPtr &mFed,
              const std::string &name,
              const std::string &type = std::string ())
        : Endpoint (locality, std::addressof (*mFed), name, type)
    {
        static_assert (std::is_base_of<MessageFederate, std::remove_reference_t<decltype (*mFed)>>::value,
                       "second argument must be a pointer to a MessageFederate");
    }
    /** check if the Endpoint links to a valid operation*/
    bool isValid () const { return handle.isValid (); }
    bool operator== (const Endpoint &ept) const { return (handle == ept.handle); }
    bool operator!= (const Endpoint &ept) const { return (handle != ept.handle); }
    bool operator< (const Endpoint &ept) const { return (handle < ept.handle); }
    /** send a data block and length
    @param dest string name of the destination
    @param data pointer to data location
    @param data_size the length of the data
    */
    void send (const std::string &dest, const char *data, size_t data_size) const
    {
        fed->sendMessage (*this, dest, data_view (data, data_size));
    }

    /** subscribe the endpoint to a particular publication*/
    void subscribe (const std::string &key) { fed->subscribe (*this, key); }
    /** send a data block and length
    @param dest string name of the destination
    @param data pointer to data location
    @param data_size the length of the data
    @param sendTime the time to send the message
    */
    void send (const std::string &dest, const char *data, size_t data_size, Time sendTime) const
    {
        fed->sendMessage (*this, dest, data_view (data, data_size), sendTime);
    }
    /** send a data block and length
    @param data pointer to data location
    @param data_size the length of the data
    @param sendTime the time to send the message
    */
    void send (const char *data, size_t data_size, Time sendTime) const
    {
        fed->sendMessage (*this, targetDest, data_view{data, data_size}, sendTime);
    }
    /** send a data_view
    @details a data view can convert from many different formats so this function should
    be catching many of the common use cases
    @param dest string name of the destination
    @param data the information to send
    */
    void send (const std::string &dest, const data_view &data) const { fed->sendMessage (*this, dest, data); }
    /** send a data_view
    @details a data view can convert from many different formats so this function should
    be catching many of the common use cases
    @param dest string name of the destination
    @param data data representation to send
    @param sendTime  the time the message should be sent
    */
    void send (const std::string &dest, const data_view &data, Time sendTime) const
    {
        fed->sendMessage (*this, dest, data, sendTime);
    }
    /** send a data block and length to the target destination
    @param data pointer to data location
    @param data_size the length of the data
    */
    void send (const char *data, size_t data_size) const
    {
        fed->sendMessage (*this, targetDest, data_view{data, data_size});
    }
    /** send a data_view to the target destination
    @details a data view can convert from many different formats so this function should
    be catching many of the common use cases
    @param data the information to send
    */
    void send (const data_view &data) const { fed->sendMessage (*this, targetDest, data); }
    /** send a data_view to the specified target destination
    @details a data view can convert from many different formats so this function should
    be catching many of the common use cases
    @param data a representation to send
    @param sendTime  the time the message should be sent
    */
    void send (const data_view &data, Time sendTime) const
    {
        fed->sendMessage (*this, targetDest, data, sendTime);
    }
    /** send a message object
    @details this is to send a pre-built message
    @param mess a reference to an actual message object
    */
    void send (const Message &mess) const { fed->sendMessage (*this, mess); }
    /** get an available message if there is no message the returned object is empty*/
    auto getMessage () const { return fed->getMessage (*this); }
    /** check if there is a message available*/
    bool hasMessage () const { return fed->hasMessage (*this); }
    /** check if there is a message available*/
    auto pendingMessages () const { return fed->pendingMessages (*this); }
    /** register a callback for an update notification
    @details the callback is called in the just before the time request function returns
    @param callback a function with signature void(endpoint_id_t, Time)
    time is the time the value was updated  This callback is a notification callback and doesn't return the value
    */
    void setCallback (const std::function<void (const Endpoint &, Time)> &callback)
    {
        fed->setMessageNotificationCallback (*this, callback);
    }

    /** add a named filter to an endpoint for all message coming from the endpoint*/
    void addSourceFilter (const std::string &filterName) { fed->addSourceFilter (*this, filterName); }
    /** add a named filter to an endpoint for all message going to the endpoint*/
    void addDestinationFilter (const std::string &filterName) { fed->addDestinationFilter (*this, filterName); }
    /** set a target destination for unspecified messages*/
    void setDefaultDestination (std::string target) { targetDest = std::move (target); }
    /** get the target destination for the endpoint*/
    const std::string &getDefaultDestination () const { return targetDest; }
    /** get the name of the endpoint*/
    const std::string &getName () const { return actualName; }
    /** get the name of the endpoint*/
    const std::string &getKey () const { return fed->getInterfaceName (handle); }
    /** get the specified type of the endpoint*/
    const std::string &getType () const { return fed->getExtractionType (*this); }
    /** get the actual endpoint id for the fed*/
    interface_handle getHandle () const { return handle; }
    /** implicit conversion operator for extracting the handle*/
    operator interface_handle () const { return handle; }
    /** get the interface information field of the publication*/
    const std::string &getInfo () const { return fed->getInfo (handle); }
    /** set the interface information field of the publication*/
    void setInfo (const std::string &info) { fed->setInfo (handle, info); }
    void setOption (int32_t option, bool value) { fed->setInterfaceOption (handle, option, value); }

    /** get the current value of a flag for the handle*/
    bool getOption (int32_t option) const { return fed->getInterfaceOption (handle, option); }
    /** close the endpoint from receiving more messages*/
    void close () { fed->closeInterface (handle); }

  private:
    friend class MessageFederateManager;
};
}  // namespace helics
