/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public class pjsua_reg_info {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected pjsua_reg_info(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(pjsua_reg_info obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsuaJNI.delete_pjsua_reg_info(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCbparam(SWIGTYPE_p_pjsip_regc_cbparam value) {
    pjsuaJNI.pjsua_reg_info_cbparam_set(swigCPtr, this, SWIGTYPE_p_pjsip_regc_cbparam.getCPtr(value));
  }

  public SWIGTYPE_p_pjsip_regc_cbparam getCbparam() {
    long cPtr = pjsuaJNI.pjsua_reg_info_cbparam_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_pjsip_regc_cbparam(cPtr, false);
  }

  public pjsua_reg_info() {
    this(pjsuaJNI.new_pjsua_reg_info(), true);
  }

}
