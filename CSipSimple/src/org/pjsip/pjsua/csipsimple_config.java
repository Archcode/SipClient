/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public class csipsimple_config {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected csipsimple_config(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(csipsimple_config obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsuaJNI.delete_csipsimple_config(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUse_compact_form_sdp(int value) {
    pjsuaJNI.csipsimple_config_use_compact_form_sdp_set(swigCPtr, this, value);
  }

  public int getUse_compact_form_sdp() {
    return pjsuaJNI.csipsimple_config_use_compact_form_sdp_get(swigCPtr, this);
  }

  public void setUse_compact_form_headers(int value) {
    pjsuaJNI.csipsimple_config_use_compact_form_headers_set(swigCPtr, this, value);
  }

  public int getUse_compact_form_headers() {
    return pjsuaJNI.csipsimple_config_use_compact_form_headers_get(swigCPtr, this);
  }

  public void setAdd_bandwidth_tias_in_sdp(int value) {
    pjsuaJNI.csipsimple_config_add_bandwidth_tias_in_sdp_set(swigCPtr, this, value);
  }

  public int getAdd_bandwidth_tias_in_sdp() {
    return pjsuaJNI.csipsimple_config_add_bandwidth_tias_in_sdp_get(swigCPtr, this);
  }

  public void setUse_no_update(int value) {
    pjsuaJNI.csipsimple_config_use_no_update_set(swigCPtr, this, value);
  }

  public int getUse_no_update() {
    return pjsuaJNI.csipsimple_config_use_no_update_get(swigCPtr, this);
  }

  public void setUse_zrtp(int value) {
    pjsuaJNI.csipsimple_config_use_zrtp_set(swigCPtr, this, value);
  }

  public int getUse_zrtp() {
    return pjsuaJNI.csipsimple_config_use_zrtp_get(swigCPtr, this);
  }

  public void setExtra_aud_codecs_cnt(long value) {
    pjsuaJNI.csipsimple_config_extra_aud_codecs_cnt_set(swigCPtr, this, value);
  }

  public long getExtra_aud_codecs_cnt() {
    return pjsuaJNI.csipsimple_config_extra_aud_codecs_cnt_get(swigCPtr, this);
  }

  public void setExtra_aud_codecs(dynamic_factory[] value) {
    pjsuaJNI.csipsimple_config_extra_aud_codecs_set(swigCPtr, this, dynamic_factory.cArrayUnwrap(value));
  }

  public dynamic_factory[] getExtra_aud_codecs() {
    return dynamic_factory.cArrayWrap(pjsuaJNI.csipsimple_config_extra_aud_codecs_get(swigCPtr, this), false);
  }

  public void setExtra_vid_codecs_cnt(long value) {
    pjsuaJNI.csipsimple_config_extra_vid_codecs_cnt_set(swigCPtr, this, value);
  }

  public long getExtra_vid_codecs_cnt() {
    return pjsuaJNI.csipsimple_config_extra_vid_codecs_cnt_get(swigCPtr, this);
  }

  public void setExtra_vid_codecs(dynamic_factory[] value) {
    pjsuaJNI.csipsimple_config_extra_vid_codecs_set(swigCPtr, this, dynamic_factory.cArrayUnwrap(value));
  }

  public dynamic_factory[] getExtra_vid_codecs() {
    return dynamic_factory.cArrayWrap(pjsuaJNI.csipsimple_config_extra_vid_codecs_get(swigCPtr, this), false);
  }

  public void setExtra_vid_codecs_destroy(dynamic_factory[] value) {
    pjsuaJNI.csipsimple_config_extra_vid_codecs_destroy_set(swigCPtr, this, dynamic_factory.cArrayUnwrap(value));
  }

  public dynamic_factory[] getExtra_vid_codecs_destroy() {
    return dynamic_factory.cArrayWrap(pjsuaJNI.csipsimple_config_extra_vid_codecs_destroy_get(swigCPtr, this), false);
  }

  public void setVid_converter(dynamic_factory value) {
    pjsuaJNI.csipsimple_config_vid_converter_set(swigCPtr, this, dynamic_factory.getCPtr(value), value);
  }

  public dynamic_factory getVid_converter() {
    long cPtr = pjsuaJNI.csipsimple_config_vid_converter_get(swigCPtr, this);
    return (cPtr == 0) ? null : new dynamic_factory(cPtr, false);
  }

  public void setStorage_folder(pj_str_t value) {
    pjsuaJNI.csipsimple_config_storage_folder_set(swigCPtr, this, pj_str_t.getCPtr(value), value);
  }

  public pj_str_t getStorage_folder() {
    long cPtr = pjsuaJNI.csipsimple_config_storage_folder_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pj_str_t(cPtr, false);
  }

  public void setAudio_implementation(dynamic_factory value) {
    pjsuaJNI.csipsimple_config_audio_implementation_set(swigCPtr, this, dynamic_factory.getCPtr(value), value);
  }

  public dynamic_factory getAudio_implementation() {
    long cPtr = pjsuaJNI.csipsimple_config_audio_implementation_get(swigCPtr, this);
    return (cPtr == 0) ? null : new dynamic_factory(cPtr, false);
  }

  public void setVideo_render_implementation(dynamic_factory value) {
    pjsuaJNI.csipsimple_config_video_render_implementation_set(swigCPtr, this, dynamic_factory.getCPtr(value), value);
  }

  public dynamic_factory getVideo_render_implementation() {
    long cPtr = pjsuaJNI.csipsimple_config_video_render_implementation_get(swigCPtr, this);
    return (cPtr == 0) ? null : new dynamic_factory(cPtr, false);
  }

  public void setVideo_capture_implementation(dynamic_factory value) {
    pjsuaJNI.csipsimple_config_video_capture_implementation_set(swigCPtr, this, dynamic_factory.getCPtr(value), value);
  }

  public dynamic_factory getVideo_capture_implementation() {
    long cPtr = pjsuaJNI.csipsimple_config_video_capture_implementation_get(swigCPtr, this);
    return (cPtr == 0) ? null : new dynamic_factory(cPtr, false);
  }

  public void setTcp_keep_alive_interval(int value) {
    pjsuaJNI.csipsimple_config_tcp_keep_alive_interval_set(swigCPtr, this, value);
  }

  public int getTcp_keep_alive_interval() {
    return pjsuaJNI.csipsimple_config_tcp_keep_alive_interval_get(swigCPtr, this);
  }

  public void setTls_keep_alive_interval(int value) {
    pjsuaJNI.csipsimple_config_tls_keep_alive_interval_set(swigCPtr, this, value);
  }

  public int getTls_keep_alive_interval() {
    return pjsuaJNI.csipsimple_config_tls_keep_alive_interval_get(swigCPtr, this);
  }

  public void setTsx_t1_timeout(int value) {
    pjsuaJNI.csipsimple_config_tsx_t1_timeout_set(swigCPtr, this, value);
  }

  public int getTsx_t1_timeout() {
    return pjsuaJNI.csipsimple_config_tsx_t1_timeout_get(swigCPtr, this);
  }

  public void setTsx_t2_timeout(int value) {
    pjsuaJNI.csipsimple_config_tsx_t2_timeout_set(swigCPtr, this, value);
  }

  public int getTsx_t2_timeout() {
    return pjsuaJNI.csipsimple_config_tsx_t2_timeout_get(swigCPtr, this);
  }

  public void setTsx_t4_timeout(int value) {
    pjsuaJNI.csipsimple_config_tsx_t4_timeout_set(swigCPtr, this, value);
  }

  public int getTsx_t4_timeout() {
    return pjsuaJNI.csipsimple_config_tsx_t4_timeout_get(swigCPtr, this);
  }

  public void setTsx_td_timeout(int value) {
    pjsuaJNI.csipsimple_config_tsx_td_timeout_set(swigCPtr, this, value);
  }

  public int getTsx_td_timeout() {
    return pjsuaJNI.csipsimple_config_tsx_td_timeout_get(swigCPtr, this);
  }

  public void setDisable_tcp_switch(int value) {
    pjsuaJNI.csipsimple_config_disable_tcp_switch_set(swigCPtr, this, value);
  }

  public int getDisable_tcp_switch() {
    return pjsuaJNI.csipsimple_config_disable_tcp_switch_get(swigCPtr, this);
  }

  public void setUse_noise_suppressor(int value) {
    pjsuaJNI.csipsimple_config_use_noise_suppressor_set(swigCPtr, this, value);
  }

  public int getUse_noise_suppressor() {
    return pjsuaJNI.csipsimple_config_use_noise_suppressor_get(swigCPtr, this);
  }

  public csipsimple_config() {
    this(pjsuaJNI.new_csipsimple_config(), true);
  }

}
