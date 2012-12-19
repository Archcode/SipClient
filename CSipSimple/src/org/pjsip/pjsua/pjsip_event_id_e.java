/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public enum pjsip_event_id_e {
  PJSIP_EVENT_UNKNOWN,
  PJSIP_EVENT_TIMER,
  PJSIP_EVENT_TX_MSG,
  PJSIP_EVENT_RX_MSG,
  PJSIP_EVENT_TRANSPORT_ERROR,
  PJSIP_EVENT_TSX_STATE,
  PJSIP_EVENT_USER;

  public final int swigValue() {
    return swigValue;
  }

  public static pjsip_event_id_e swigToEnum(int swigValue) {
    pjsip_event_id_e[] swigValues = pjsip_event_id_e.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (pjsip_event_id_e swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + pjsip_event_id_e.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private pjsip_event_id_e() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private pjsip_event_id_e(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private pjsip_event_id_e(pjsip_event_id_e swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

