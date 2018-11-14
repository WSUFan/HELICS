/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.java.helics;

public class helicsJNI {
  public final static native int helics_ok_get();
  public final static native int helics_error_registration_failure_get();
  public final static native int helics_error_connection_failure_get();
  public final static native int helics_error_invalid_object_get();
  public final static native int helics_error_invalid_argument_get();
  public final static native int helics_error_discard_get();
  public final static native int helics_error_system_failure_get();
  public final static native int helics_warning_get();
  public final static native int helics_error_invalid_state_transition_get();
  public final static native int helics_error_invalid_function_call_get();
  public final static native int helics_error_execution_failure_get();
  public final static native int helics_error_other_get();
  public final static native int other_error_type_get();
  public final static native double helics_time_zero_get();
  public final static native double helics_time_epsilon_get();
  public final static native double helics_time_invalid_get();
  public final static native double helics_time_maxtime_get();
  public final static native int helics_true_get();
  public final static native int helics_false_get();
  public final static native int helics_state_startup_get();
  public final static native int helics_filtertype_custom_get();
  public final static native int helics_filtertype_delay_get();
  public final static native int helics_filtertype_random_delay_get();
  public final static native int helics_filtertype_random_drop_get();
  public final static native int helics_filtertype_reroute_get();
  public final static native int helics_filtertype_clone_get();
  public final static native int helics_filtertype_firewall_get();
  public final static native int helics_flag_observer_get();
  public final static native int helics_flag_uninterruptible_get();
  public final static native int helics_flag_interruptible_get();
  public final static native int helics_flag_source_only_get();
  public final static native int helics_flag_only_transmit_on_change_get();
  public final static native int helics_flag_only_update_on_change_get();
  public final static native int helics_flag_wait_for_current_time_update_get();
  public final static native int helics_flag_rollback_get();
  public final static native int helics_flag_forward_compute_get();
  public final static native int helics_flag_realtime_get();
  public final static native int helics_flag_ignore_time_mismatch_warnings_get();
  public final static native int helics_time_property_time_delta_get();
  public final static native int helics_time_property_period_get();
  public final static native int helics_time_property_offset_get();
  public final static native int helics_time_property_rt_lag_get();
  public final static native int helics_time_property_rt_lead_get();
  public final static native int helics_time_property_rt_tolerance_get();
  public final static native int helics_time_property_input_delay_get();
  public final static native int helics_time_property_output_delay_get();
  public final static native int helics_int_property_max_iterations_get();
  public final static native int helics_int_property_log_level_get();
  public final static native int helics_handle_option_connection_required_get();
  public final static native int helics_handle_option_connection_optional_get();
  public final static native int helics_handle_option_single_connection_only_get();
  public final static native int helics_handle_option_multiple_connections_allowed_get();
  public final static native int helics_handle_option_only_transmit_on_change_get();
  public final static native int helics_handle_option_only_update_on_change_get();
  public final static native void helics_complex_real_set(long jarg1, helics_complex jarg1_, double jarg2);
  public final static native double helics_complex_real_get(long jarg1, helics_complex jarg1_);
  public final static native void helics_complex_imag_set(long jarg1, helics_complex jarg1_, double jarg2);
  public final static native double helics_complex_imag_get(long jarg1, helics_complex jarg1_);
  public final static native long new_helics_complex();
  public final static native void delete_helics_complex(long jarg1);
  public final static native void message_t_time_set(long jarg1, message_t jarg1_, double jarg2);
  public final static native double message_t_time_get(long jarg1, message_t jarg1_);
  public final static native void message_t_data_set(long jarg1, message_t jarg1_, String jarg2);
  public final static native String message_t_data_get(long jarg1, message_t jarg1_);
  public final static native void message_t_length_set(long jarg1, message_t jarg1_, long jarg2);
  public final static native long message_t_length_get(long jarg1, message_t jarg1_);
  public final static native void message_t_messageID_set(long jarg1, message_t jarg1_, long jarg2);
  public final static native long message_t_messageID_get(long jarg1, message_t jarg1_);
  public final static native void message_t_flags_set(long jarg1, message_t jarg1_, long jarg2);
  public final static native long message_t_flags_get(long jarg1, message_t jarg1_);
  public final static native void message_t_original_source_set(long jarg1, message_t jarg1_, String jarg2);
  public final static native String message_t_original_source_get(long jarg1, message_t jarg1_);
  public final static native void message_t_source_set(long jarg1, message_t jarg1_, String jarg2);
  public final static native String message_t_source_get(long jarg1, message_t jarg1_);
  public final static native void message_t_dest_set(long jarg1, message_t jarg1_, String jarg2);
  public final static native String message_t_dest_get(long jarg1, message_t jarg1_);
  public final static native void message_t_original_dest_set(long jarg1, message_t jarg1_, String jarg2);
  public final static native String message_t_original_dest_get(long jarg1, message_t jarg1_);
  public final static native long new_message_t();
  public final static native void delete_message_t(long jarg1);
  public final static native int HELICS_CORE_TYPE_DEFAULT_get();
  public final static native int HELICS_CORE_TYPE_ZMQ_get();
  public final static native int HELICS_CORE_TYPE_MPI_get();
  public final static native int HELICS_CORE_TYPE_TEST_get();
  public final static native int HELICS_CORE_TYPE_INTERPROCESS_get();
  public final static native int HELICS_CORE_TYPE_IPC_get();
  public final static native int HELICS_CORE_TYPE_TCP_get();
  public final static native int HELICS_CORE_TYPE_UDP_get();
  public final static native int HELICS_CORE_TYPE_ZMQ_TEST_get();
  public final static native int HELICS_CORE_TYPE_TCP_SS_get();
  public final static native String helicsGetVersion();
  public final static native int helicsIsCoreTypeAvailable(String jarg1);
  public final static native long helicsCreateCore(String jarg1, String jarg2, String jarg3);
  public final static native long helicsCreateCoreFromArgs(String jarg1, String jarg2, String[] jarg3);
  public final static native long helicsCoreClone(long jarg1);
  public final static native int helicsCoreIsValid(long jarg1);
  public final static native long helicsCreateBroker(String jarg1, String jarg2, String jarg3);
  public final static native long helicsCreateBrokerFromArgs(String jarg1, String jarg2, String[] jarg3);
  public final static native long helicsBrokerClone(long jarg1);
  public final static native int helicsBrokerIsValid(long jarg1);
  public final static native int helicsBrokerIsConnected(long jarg1);
  public final static native void helicsBrokerDataLink(long jarg1, String jarg2, String jarg3);
  public final static native void helicsBrokerAddSourceFilterToEndpoint(long jarg1, String jarg2, String jarg3);
  public final static native void helicsBrokerAddDestinationFilterToEndpoint(long jarg1, String jarg2, String jarg3);
  public final static native int helicsBrokerWaitForDisconnect(long jarg1, int jarg2);
  public final static native int helicsCoreIsConnected(long jarg1);
  public final static native void helicsCoreDataLink(long jarg1, String jarg2, String jarg3);
  public final static native void helicsCoreAddSourceFilterToEndpoint(long jarg1, String jarg2, String jarg3);
  public final static native void helicsCoreAddDestinationFilterToEndpoint(long jarg1, String jarg2, String jarg3);
  public final static native String helicsBrokerGetIdentifier(long jarg1);
  public final static native String helicsCoreGetIdentifier(long jarg1);
  public final static native String helicsBrokerGetAddress(long jarg1);
  public final static native void helicsCoreSetReadyToInit(long jarg1);
  public final static native void helicsCoreDisconnect(long jarg1);
  public final static native long helicsGetFederateByName(String jarg1);
  public final static native void helicsBrokerDisconnect(long jarg1);
  public final static native void helicsFederateDestroy(long jarg1);
  public final static native void helicsBrokerDestroy(long jarg1);
  public final static native void helicsCoreDestroy(long jarg1);
  public final static native void helicsCoreFree(long jarg1);
  public final static native void helicsBrokerFree(long jarg1);
  public final static native long helicsCreateValueFederate(String jarg1, long jarg2);
  public final static native long helicsCreateValueFederateFromConfig(String jarg1);
  public final static native long helicsCreateMessageFederate(String jarg1, long jarg2);
  public final static native long helicsCreateMessageFederateFromConfig(String jarg1);
  public final static native long helicsCreateCombinationFederate(String jarg1, long jarg2);
  public final static native long helicsCreateCombinationFederateFromConfig(String jarg1);
  public final static native long helicsFederateClone(long jarg1);
  public final static native long helicsCreateFederateInfo();
  public final static native void helicsFederateInfoLoadFromArgs(long jarg1, String[] jarg2);
  public final static native void helicsFederateInfoFree(long jarg1);
  public final static native int helicsFederateIsValid(long jarg1);
  public final static native void helicsFederateInfoSetCoreName(long jarg1, String jarg2);
  public final static native void helicsFederateInfoSetCoreInitString(long jarg1, String jarg2);
  public final static native void helicsFederateInfoSetCoreType(long jarg1, int jarg2);
  public final static native void helicsFederateInfoSetCoreTypeFromString(long jarg1, String jarg2);
  public final static native void helicsFederateInfoSetBroker(long jarg1, String jarg2);
  public final static native void helicsFederateInfoSetBrokerPort(long jarg1, int jarg2);
  public final static native void helicsFederateInfoSetLocalPort(long jarg1, String jarg2);
  public final static native void helicsFederateInfoSetFlagOption(long jarg1, int jarg2, int jarg3);
  public final static native void helicsFederateInfoSetSeparator(long jarg1, char jarg2);
  public final static native void helicsFederateInfoSetTimeProperty(long jarg1, int jarg2, double jarg3);
  public final static native void helicsFederateInfoSetIntegerProperty(long jarg1, int jarg2, int jarg3);
  public final static native void helicsFederateRegisterInterfaces(long jarg1, String jarg2);
  public final static native void helicsFederateFinalize(long jarg1);
  public final static native void helicsFederateFree(long jarg1);
  public final static native void helicsCloseLibrary();
  public final static native void helicsFederateEnterInitializingMode(long jarg1);
  public final static native void helicsFederateEnterInitializingModeAsync(long jarg1);
  public final static native int helicsFederateIsAsyncOperationCompleted(long jarg1);
  public final static native void helicsFederateEnterInitializingModeComplete(long jarg1);
  public final static native void helicsFederateEnterExecutingMode(long jarg1);
  public final static native void helicsFederateEnterExecutingModeAsync(long jarg1);
  public final static native void helicsFederateEnterExecutingModeComplete(long jarg1);
  public final static native int helicsFederateEnterExecutingModeIterative(long jarg1, int jarg2);
  public final static native void helicsFederateEnterExecutingModeIterativeAsync(long jarg1, int jarg2);
  public final static native int helicsFederateEnterExecutingModeIterativeComplete(long jarg1);
  public final static native int helicsFederateGetState(long jarg1);
  public final static native long helicsFederateGetCoreObject(long jarg1);
  public final static native double helicsFederateRequestTime(long jarg1, double jarg2);
  public final static native double helicsFederateRequestNextStep(long jarg1);
  public final static native double helicsFederateRequestTimeIterative(long jarg1, double jarg2, int jarg3, int[] jarg4);
  public final static native void helicsFederateRequestTimeAsync(long jarg1, double jarg2);
  public final static native double helicsFederateRequestTimeComplete(long jarg1);
  public final static native void helicsFederateRequestTimeIterativeAsync(long jarg1, double jarg2, int jarg3);
  public final static native double helicsFederateRequestTimeIterativeComplete(long jarg1, int[] jarg2);
  public final static native String helicsFederateGetName(long jarg1);
  public final static native void helicsFederateSetTimeProperty(long jarg1, int jarg2, double jarg3);
  public final static native void helicsFederateSetFlagOption(long jarg1, int jarg2, int jarg3);
  public final static native void helicsFederateSetSeparator(long jarg1, char jarg2);
  public final static native void helicsFederateSetIntegerProperty(long jarg1, int jarg2, int jarg3);
  public final static native double helicsFederateGetTimeProperty(long jarg1, int jarg2);
  public final static native int helicsFederateGetFlagOption(long jarg1, int jarg2);
  public final static native int helicsFederateGetIntegerProperty(long jarg1, int jarg2);
  public final static native double helicsFederateGetCurrentTime(long jarg1);
  public final static native long helicsCreateQuery(String jarg1, String jarg2);
  public final static native String helicsQueryExecute(long jarg1, long jarg2);
  public final static native String helicsQueryCoreExecute(long jarg1, long jarg2);
  public final static native String helicsQueryBrokerExecute(long jarg1, long jarg2);
  public final static native void helicsQueryExecuteAsync(long jarg1, long jarg2);
  public final static native String helicsQueryExecuteComplete(long jarg1);
  public final static native int helicsQueryIsCompleted(long jarg1);
  public final static native void helicsQueryFree(long jarg1);
  public final static native void helicsCleanupLibrary();
  public final static native int HELICS_DATA_TYPE_STRING_get();
  public final static native int HELICS_DATA_TYPE_DOUBLE_get();
  public final static native int HELICS_DATA_TYPE_INT_get();
  public final static native int HELICS_DATA_TYPE_COMPLEX_get();
  public final static native int HELICS_DATA_TYPE_VECTOR_get();
  public final static native int HELICS_DATA_TYPE_NAMEDPOINT_get();
  public final static native int HELICS_DATA_TYPE_BOOLEAN_get();
  public final static native int HELICS_DATA_TYPE_CHAR_get();
  public final static native int HELICS_DATA_TYPE_TIME_get();
  public final static native int HELICS_DATA_TYPE_RAW_get();
  public final static native int HELICS_DATA_TYPE_ANY_get();
  public final static native long helicsFederateRegisterSubscription(long jarg1, String jarg2, String jarg3);
  public final static native long helicsFederateRegisterPublication(long jarg1, String jarg2, int jarg3, String jarg4);
  public final static native long helicsFederateRegisterTypePublication(long jarg1, String jarg2, String jarg3, String jarg4);
  public final static native long helicsFederateRegisterGlobalPublication(long jarg1, String jarg2, int jarg3, String jarg4);
  public final static native long helicsFederateRegisterGlobalTypePublication(long jarg1, String jarg2, String jarg3, String jarg4);
  public final static native long helicsFederateRegisterInput(long jarg1, String jarg2, int jarg3, String jarg4);
  public final static native long helicsFederateRegisterTypeInput(long jarg1, String jarg2, String jarg3, String jarg4);
  public final static native long helicsFederateRegisterGlobalInput(long jarg1, String jarg2, int jarg3, String jarg4);
  public final static native long helicsFederateRegisterGlobalTypeInput(long jarg1, String jarg2, String jarg3, String jarg4);
  public final static native long helicsFederateGetPublication(long jarg1, String jarg2);
  public final static native long helicsFederateGetPublicationByIndex(long jarg1, int jarg2);
  public final static native long helicsFederateGetInput(long jarg1, String jarg2);
  public final static native long helicsFederateGetInputByIndex(long jarg1, int jarg2);
  public final static native long helicsFederateGetSubscription(long jarg1, String jarg2);
  public final static native void helicsPublicationPublishRaw(long jarg1, long jarg2, int jarg3);
  public final static native void helicsPublicationPublishString(long jarg1, String jarg2);
  public final static native void helicsPublicationPublishInteger(long jarg1, long jarg2);
  public final static native void helicsPublicationPublishBoolean(long jarg1, int jarg2);
  public final static native void helicsPublicationPublishDouble(long jarg1, double jarg2);
  public final static native void helicsPublicationPublishTime(long jarg1, double jarg2);
  public final static native void helicsPublicationPublishChar(long jarg1, char jarg2);
  public final static native void helicsPublicationPublishComplex(long jarg1, double jarg2, double jarg3);
  public final static native void helicsPublicationPublishVector(long jarg1, double[] jarg2, int jarg3);
  public final static native void helicsPublicationPublishNamedPoint(long jarg1, String jarg2, double jarg3);
  public final static native void helicsPublicationAddTarget(long jarg1, String jarg2);
  public final static native void helicsInputAddTarget(long jarg1, String jarg2);
  public final static native int helicsInputGetRawValueSize(long jarg1);
  public final static native void helicsInputGetRawValue(long jarg1, long jarg2, int jarg3, int[] jarg4);
  public final static native int helicsInputGetStringSize(long jarg1);
  public final static native void helicsInputGetString(long jarg1, byte[] jarg2, int[] jarg4);
  public final static native long helicsInputGetInteger(long jarg1);
  public final static native int helicsInputGetBoolean(long jarg1);
  public final static native double helicsInputGetDouble(long jarg1);
  public final static native double helicsInputGetTime(long jarg1);
  public final static native char helicsInputGetChar(long jarg1);
  public final static native long helicsInputGetComplexObject(long jarg1);
  public final static native void helicsInputGetComplex(long jarg1, double[] jarg2, double[] jarg3);
  public final static native int helicsInputGetVectorSize(long jarg1);
  public final static native void helicsInputGetVector(long jarg1, long jarg2, int jarg3, int[] jarg4);
  public final static native void helicsInputGetNamedPoint(long jarg1, byte[] jarg2, int[] jarg4, double[] jarg5);
  public final static native void helicsInputSetDefaultRaw(long jarg1, long jarg2, int jarg3);
  public final static native void helicsInputSetDefaultString(long jarg1, String jarg2);
  public final static native void helicsInputSetDefaultInteger(long jarg1, long jarg2);
  public final static native void helicsInputSetDefaultBoolean(long jarg1, int jarg2);
  public final static native void helicsInputSetDefaultTime(long jarg1, double jarg2);
  public final static native void helicsInputSetDefaultChar(long jarg1, char jarg2);
  public final static native void helicsInputSetDefaultDouble(long jarg1, double jarg2);
  public final static native void helicsInputSetDefaultComplex(long jarg1, double jarg2, double jarg3);
  public final static native void helicsInputSetDefaultVector(long jarg1, double[] jarg2, int jarg3);
  public final static native void helicsInputSetDefaultNamedPoint(long jarg1, String jarg2, double jarg3);
  public final static native String helicsInputGetType(long jarg1);
  public final static native String helicsPublicationGetType(long jarg1);
  public final static native String helicsInputGetKey(long jarg1);
  public final static native String helicsSubscriptionGetKey(long jarg1);
  public final static native String helicsPublicationGetKey(long jarg1);
  public final static native String helicsInputGetUnits(long jarg1);
  public final static native String helicsPublicationGetUnits(long jarg1);
  public final static native int helicsInputIsUpdated(long jarg1);
  public final static native double helicsInputLastUpdateTime(long jarg1);
  public final static native int helicsFederateGetPublicationCount(long jarg1);
  public final static native int helicsFederateGetInputCount(long jarg1);
  public final static native long helicsFederateRegisterEndpoint(long jarg1, String jarg2, String jarg3);
  public final static native long helicsFederateRegisterGlobalEndpoint(long jarg1, String jarg2, String jarg3);
  public final static native long helicsFederateGetEndpoint(long jarg1, String jarg2);
  public final static native long helicsFederateGetEndpointByIndex(long jarg1, int jarg2);
  public final static native void helicsEndpointSetDefaultDestination(long jarg1, String jarg2);
  public final static native void helicsEndpointSendMessageRaw(long jarg1, String jarg2, long jarg3, int jarg4);
  public final static native void helicsEndpointSendEventRaw(long jarg1, String jarg2, long jarg3, int jarg4, double jarg5);
  public final static native void helicsEndpointSendMessage(long jarg1, long jarg2, message_t jarg2_);
  public final static native void helicsEndpointSubscribe(long jarg1, String jarg2);
  public final static native int helicsFederateHasMessage(long jarg1);
  public final static native int helicsEndpointHasMessage(long jarg1);
  public final static native int helicsFederatePendingMessages(long jarg1);
  public final static native int helicsEndpointPendingMessages(long jarg1);
  public final static native long helicsEndpointGetMessage(long jarg1);
  public final static native long helicsFederateGetMessage(long jarg1);
  public final static native String helicsEndpointGetType(long jarg1);
  public final static native String helicsEndpointGetName(long jarg1);
  public final static native int helicsFederateGetEndpointCount(long jarg1);
  public final static native long helicsFederateRegisterFilter(long jarg1, int jarg2, String jarg3);
  public final static native long helicsFederateRegisterGlobalFilter(long jarg1, int jarg2, String jarg3);
  public final static native long helicsFederateRegisterCloningFilter(long jarg1, String jarg2);
  public final static native long helicsFederateRegisterGlobalCloningFilter(long jarg1, String jarg2);
  public final static native long helicsCoreRegisterFilter(long jarg1, int jarg2, String jarg3);
  public final static native long helicsCoreRegisterCloningFilter(long jarg1, String jarg2);
  public final static native long helicsFederateGetFilter(long jarg1, String jarg2);
  public final static native long helicsFederateGetFilterByIndex(long jarg1, int jarg2);
  public final static native String helicsFilterGetName(long jarg1);
  public final static native void helicsFilterSet(long jarg1, String jarg2, double jarg3);
  public final static native void helicsFilterSetString(long jarg1, String jarg2, String jarg3);
  public final static native void helicsFilterAddDestinationTarget(long jarg1, String jarg2);
  public final static native void helicsFilterAddSourceTarget(long jarg1, String jarg2);
  public final static native void helicsFilterAddDeliveryEndpoint(long jarg1, String jarg2);
  public final static native void helicsFilterRemoveTarget(long jarg1, String jarg2);
  public final static native void helicsFilterRemoveDeliveryEndpoint(long jarg1, String jarg2);
}
