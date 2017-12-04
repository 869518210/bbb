package com.zhuqiqing.mvpdemo.interfaze;

import com.android.volley.VolleyError;

/**
 * Created by ZhuQiQing on 2017/11/27 16:26.
 */

public interface OnStringListener {

    //    成功时调用
    void onSuccess(String result);

    //    失败时调用
    void onError(VolleyError error);
}
