/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public class pjsua_call_vid_strm_op_param {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected pjsua_call_vid_strm_op_param(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(pjsua_call_vid_strm_op_param obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsuaJNI.delete_pjsua_call_vid_strm_op_param(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMed_idx(int value) {
    pjsuaJNI.pjsua_call_vid_strm_op_param_med_idx_set(swigCPtr, this, value);
  }

  public int getMed_idx() {
    return pjsuaJNI.pjsua_call_vid_strm_op_param_med_idx_get(swigCPtr, this);
  }

  public void setDir(pjmedia_dir value) {
    pjsuaJNI.pjsua_call_vid_strm_op_param_dir_set(swigCPtr, this, value.swigValue());
  }

  public pjmedia_dir getDir() {
    return pjmedia_dir.swigToEnum(pjsuaJNI.pjsua_call_vid_strm_op_param_dir_get(swigCPtr, this));
  }

  public void setCap_dev(SWIGTYPE_p_pjmedia_vid_dev_index value) {
    pjsuaJNI.pjsua_call_vid_strm_op_param_cap_dev_set(swigCPtr, this, SWIGTYPE_p_pjmedia_vid_dev_index.getCPtr(value));
  }

  public SWIGTYPE_p_pjmedia_vid_dev_index getCap_dev() {
    return new SWIGTYPE_p_pjmedia_vid_dev_index(pjsuaJNI.pjsua_call_vid_strm_op_param_cap_dev_get(swigCPtr, this), true);
  }

  public pjsua_call_vid_strm_op_param() {
    this(pjsuaJNI.new_pjsua_call_vid_strm_op_param(), true);
  }

}
