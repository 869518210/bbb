package com.zhuqiqing.mvpdemo;

import android.view.View;

/**
 * Created by ZhuQiQing on 2017/11/9 22:09.
 * MVP V层的基类
 */

public interface BaseView<T> {
//    为view设置presenter
    void setPresenter(T presenter);
//    初始化界面
    void initViews(View view);
}
