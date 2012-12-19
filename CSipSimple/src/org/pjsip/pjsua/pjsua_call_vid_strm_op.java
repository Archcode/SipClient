/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public enum pjsua_call_vid_strm_op {
  PJSUA_CALL_VID_STRM_NO_OP,
  PJSUA_CALL_VID_STRM_ADD,
  PJSUA_CALL_VID_STRM_REMOVE,
  PJSUA_CALL_VID_STRM_CHANGE_DIR,
  PJSUA_CALL_VID_STRM_CHANGE_CAP_DEV,
  PJSUA_CALL_VID_STRM_START_TRANSMIT,
  PJSUA_CALL_VID_STRM_STOP_TRANSMIT,
  PJSUA_CALL_VID_STRM_SEND_KEYFRAME;

  public final int swigValue() {
    return swigValue;
  }

  public static pjsua_call_vid_strm_op swigToEnum(int swigValue) {
    pjsua_call_vid_strm_op[] swigValues = pjsua_call_vid_strm_op.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (pjsua_call_vid_strm_op swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + pjsua_call_vid_strm_op.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private pjsua_call_vid_strm_op() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private pjsua_call_vid_strm_op(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private pjsua_call_vid_strm_op(pjsua_call_vid_strm_op swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

