/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.java.helics;

public final class helics_handle_options {
  public final static helics_handle_options helics_handle_option_connection_required = new helics_handle_options("helics_handle_option_connection_required", helicsJNI.helics_handle_option_connection_required_get());
  public final static helics_handle_options helics_handle_option_connection_optional = new helics_handle_options("helics_handle_option_connection_optional", helicsJNI.helics_handle_option_connection_optional_get());
  public final static helics_handle_options helics_handle_option_single_connection_only = new helics_handle_options("helics_handle_option_single_connection_only", helicsJNI.helics_handle_option_single_connection_only_get());
  public final static helics_handle_options helics_handle_option_multiple_connections_allowed = new helics_handle_options("helics_handle_option_multiple_connections_allowed", helicsJNI.helics_handle_option_multiple_connections_allowed_get());
  public final static helics_handle_options helics_handle_option_only_transmit_on_change = new helics_handle_options("helics_handle_option_only_transmit_on_change", helicsJNI.helics_handle_option_only_transmit_on_change_get());
  public final static helics_handle_options helics_handle_option_only_update_on_change = new helics_handle_options("helics_handle_option_only_update_on_change", helicsJNI.helics_handle_option_only_update_on_change_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static helics_handle_options swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + helics_handle_options.class + " with value " + swigValue);
  }

  private helics_handle_options(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private helics_handle_options(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private helics_handle_options(String swigName, helics_handle_options swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static helics_handle_options[] swigValues = { helics_handle_option_connection_required, helics_handle_option_connection_optional, helics_handle_option_single_connection_only, helics_handle_option_multiple_connections_allowed, helics_handle_option_only_transmit_on_change, helics_handle_option_only_update_on_change };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
