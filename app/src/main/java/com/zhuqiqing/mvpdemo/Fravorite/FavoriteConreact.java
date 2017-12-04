package com.zhuqiqing.mvpdemo.Fravorite;

import com.zhuqiqing.mvpdemo.BasePresenter;
import com.zhuqiqing.mvpdemo.BaseView;

/**
 * Created by ADMIN on 2017/11/27.
 */

public interface FavoriteConreact {

    interface View extends BaseView<Presenter> {
        boolean isActive();

        void showResult();
    }

    interface Presenter extends BasePresenter {
        void loadFavorite();
    }

}
