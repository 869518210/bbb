package com.zhuqiqing.mvpdemo.Timeline;

import com.zhuqiqing.mvpdemo.BasePresenter;
import com.zhuqiqing.mvpdemo.BaseView;
import com.zhuqiqing.mvpdemo.data.DoubanMomentNewsPosts;

import java.util.List;

/**
 * Created by ZhuQiQing on 2017/11/27.
 */

public interface DoubanMomentContract {

    interface View extends BaseView<Presenter> {
        void onSuccess(List<DoubanMomentNewsPosts> doubanMomentNewsPosts);

        void onError();
    }

    interface Presenter extends BasePresenter {
        void load();
    }

}
