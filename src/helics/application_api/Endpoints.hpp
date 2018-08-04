/*
Copyright © 2017-2018,
Battelle Memorial Institute; Lawrence Livermore National Security, LLC; Alliance for Sustainable Energy, LLC
All rights reserved. See LICENSE file and DISCLAIMER for more details.
*/
#pragma once

#include "MessageFederate.hpp"
#include <mutex>
#include <type_traits>

namespace helics
{
/** class to manage an endpoint */
class Endpoint
{
  private:
    MessageFederate *fed;  //!< the MessageFederate to interact with
    endpoint_id_t id;  //!< the id as generated by the Federate
    std::string actualName;  //!< the name of the endpoint
    std::string targetDest;  //!< a predefined target destination
  public:
    /** default constructor*/
    Endpoint () = default;
    /**constructor to build an endpoint object
    @param[in] mFed  the MessageFederate to use
    @param[in] name the name of the endpoint
    @param[in] type a named type associated with the endpoint
    */
    Endpoint(MessageFederate *mFed, const std::string &name, const std::string &type = std::string());
    /**constructor to build an endpoint object
    @param[in] mFed  the MessageFederate to use
    @param[in] name the name of the endpoint
    @param[in] type a named type associated with the endpoint
    */
    template <class FedPtr>
    Endpoint (FedPtr &mFed, const std::string &name, const std::string &type = std::string ())
        : Endpoint (std::addressof (*mFed),name,type)
    {
        static_assert (std::is_base_of<MessageFederate, std::remove_reference_t<decltype (*mFed)>>::value,
                       "first argument must be a pointer to a MessageFederate");
    }
    /**constructor to build an endpoint object
    @param[in] mFed  the MessageFederate to use
    @param[in] name the name of the endpoint
    @param[in] type a named type associated with the endpoint
    */
    Endpoint(interface_visibility locality,
        MessageFederate *mFed,
        const std::string &name,
        const std::string &type = std::string());
    /**constructor to build an endpoint object
    @param[in] mFed  the MessageFederate to use
    @param[in] name the name of the endpoint
    @param[in] type a named type associated with the endpoint
    */
    template <class FedPtr>
    Endpoint (interface_visibility locality,
              FedPtr &mFed,
              const std::string &name,
              const std::string &type = std::string ())
        : Endpoint (locality,std::addressof (*mFed),name,type)
    {
        static_assert (std::is_base_of<MessageFederate, std::remove_reference_t<decltype (*mFed)>>::value,
                       "second argument must be a pointer to a MessageFederate");
    }
    /** generate an endpoint from a MessageFederate pointer and an endpoint index
     */
    Endpoint (MessageFederate *mFed, int endpointIndex);
    /** send a data block and length
    @param[in] dest string name of the destination
    @param[in] data pointer to data location
    @param[in] data_size the length of the data
    */
    void send (const std::string &dest, const char *data, size_t data_size) const
    {
        fed->sendMessage (id, dest, data_view (data, data_size));
    }

    /** subscribe the endpoint to a particular publication*/
    void subscribe (const std::string &key) { fed->subscribe (id, key); }
    /** send a data block and length
    @param[in] dest string name of the destination
    @param[in] data pointer to data location
    @param[in] data_size the length of the data
    */
    void send (const std::string &dest, const char *data, size_t data_size, Time sendTime) const
    {
        fed->sendMessage (id, dest, data_view (data, data_size), sendTime);
    }
    /** send a data block and length
    @param[in] data pointer to data location
    @param[in] data_size the length of the data
    @param sendTime the time to send the message
    */
    void send (const char *data, size_t data_size, Time sendTime) const
    {
        fed->sendMessage (id, targetDest, data_view (data, data_size), sendTime);
    }
    /** send a data_view
    @details a data view can convert from many different formats so this function should
    be catching many of the common use cases
    @param[in] dest string name of the destination
    @param[in] data the information to send
    */
    void send (const std::string &dest, data_view data) const { fed->sendMessage (id, dest, data); }
    /** send a data_view
    @details a data view can convert from many different formats so this function should
    be catching many of the common use cases
    @param[in] dest string name of the destination
    @param[in] data data representation to send
    @param[in] sendTime  the time the message should be sent
    */
    void send (const std::string &dest, data_view data, Time sendTime) const
    {
        fed->sendMessage (id, dest, data, sendTime);
    }
    /** send a data block and length to the target destination
    @param[in] data pointer to data location
    @param[in] data_size the length of the data
    */
    void send (const char *data, size_t data_size) const
    {
        fed->sendMessage (id, targetDest, data_view (data, data_size));
    }
    /** send a data_view to the target destination
    @details a data view can convert from many different formats so this function should
    be catching many of the common use cases
    @param[in] data the information to send
    */
    void send (data_view data) const { fed->sendMessage (id, targetDest, data); }
    /** send a data_view to the specified target destination
    @details a data view can convert from many different formats so this function should
    be catching many of the common use cases
    @param[in] data a representation to send
    @param[in] sendTime  the time the message should be sent
    */
    void send (data_view data, Time sendTime) const { fed->sendMessage (id, targetDest, data, sendTime); }
    /** send a message object
    @details this is to send a pre-built message
    @param[in] mess a reference to an actual message object
    */
    void send (const Message &mess) const { fed->sendMessage (id, mess); }
    /** get an available message if there is no message the returned object is empty*/
    auto getMessage () const { return fed->getMessage (id); }
    /** check if there is a message available*/
    bool hasMessage () const { return fed->hasMessage (id); }
    /** check if there is a message available*/
    auto pendingMessages () const { return fed->pendingMessages (id); }
    /** register a callback for an update notification
    @details the callback is called in the just before the time request function returns
    @param[in] callback a function with signature void(endpoint_id_t, Time)
    time is the time the value was updated  This callback is a notification callback and doesn't return the value
    */
    void setCallback (const std::function<void(endpoint_id_t, Time)> &callback)
    {
        fed->registerEndpointCallback (id, callback);
    }
    /** register a callback for an update notification
    @details the callback is called in the just before the time request function returns
    @param[in] callback a function with signature void(endpoint_id_t, Time)
    time is the time the value was updated  This callback is a notification callback and doesn't return the value
    */
    void setCallback (std::function<void(const Endpoint *, Time)> callback);
    /** set a target destination for unspecified messages*/
    void setTargetDestination (const std::string &target) { targetDest = target; }
    /** get the name of the endpoint*/
    const std::string &getName () const { return actualName; }
    /** get the specified type of the endpoint*/
    std::string getType () const { return fed->getEndpointType (id); }
    /** get the actual endpoint id for the fed*/
    endpoint_id_t getID () const { return id; }
};
}  // namespace helics
