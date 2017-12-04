package com.zhuqiqing.mvpdemo.util;

import android.content.Context;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.zhuqiqing.mvpdemo.interfaze.OnStringListener;

/**
 * Created by ZhuQiQing on 2017/11/27 16:30.
 */

public class StringModelImpl {

    private Context context;
    public StringModelImpl (Context context){
        this.context=context;
    }

    public void load(String url, final OnStringListener stringListener){
        StringRequest stringRequest=new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                stringListener.onSuccess(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                stringListener.onError(error);
            }
        });
        VolleySingleton.getVolleySingleton(context).addToRequestQueue(stringRequest);
    }


}
