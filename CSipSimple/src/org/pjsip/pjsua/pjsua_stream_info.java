/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public class pjsua_stream_info {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected pjsua_stream_info(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(pjsua_stream_info obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsuaJNI.delete_pjsua_stream_info(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(SWIGTYPE_p_pjmedia_type value) {
    pjsuaJNI.pjsua_stream_info_type_set(swigCPtr, this, SWIGTYPE_p_pjmedia_type.getCPtr(value));
  }

  public SWIGTYPE_p_pjmedia_type getType() {
    return new SWIGTYPE_p_pjmedia_type(pjsuaJNI.pjsua_stream_info_type_get(swigCPtr, this), true);
  }

  public pjsua_stream_info() {
    this(pjsuaJNI.new_pjsua_stream_info(), true);
  }

}
