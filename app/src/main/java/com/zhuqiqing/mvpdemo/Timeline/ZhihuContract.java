package com.zhuqiqing.mvpdemo.Timeline;

import com.zhuqiqing.mvpdemo.BasePresenter;
import com.zhuqiqing.mvpdemo.BaseView;

/**
 * Created by ZhuQiQing on 2017/11/15 22:42.
 */

public interface ZhihuContract {

    interface View extends BaseView<Presenter>{

        void onSueecss();

        void onError();

    }

    interface Presenter extends BasePresenter{

        void load();

    }

}
