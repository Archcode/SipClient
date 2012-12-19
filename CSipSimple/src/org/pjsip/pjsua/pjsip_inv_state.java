/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public enum pjsip_inv_state {
  PJSIP_INV_STATE_NULL,
  PJSIP_INV_STATE_CALLING,
  PJSIP_INV_STATE_INCOMING,
  PJSIP_INV_STATE_EARLY,
  PJSIP_INV_STATE_CONNECTING,
  PJSIP_INV_STATE_CONFIRMED,
  PJSIP_INV_STATE_DISCONNECTED;

  public final int swigValue() {
    return swigValue;
  }

  public static pjsip_inv_state swigToEnum(int swigValue) {
    pjsip_inv_state[] swigValues = pjsip_inv_state.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (pjsip_inv_state swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + pjsip_inv_state.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private pjsip_inv_state() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private pjsip_inv_state(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private pjsip_inv_state(pjsip_inv_state swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

