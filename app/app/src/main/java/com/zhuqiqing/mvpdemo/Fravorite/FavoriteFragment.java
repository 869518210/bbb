package com.zhuqiqing.mvpdemo.Fravorite;

import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by ZhuQiQing on 2017/11/13 21:18.
 */

public class FavoriteFragment extends Fragment implements FavoriteConreact.View{

    public static FavoriteFragment newInstance(){
        return new FavoriteFragment();
    }

    @Override
    public void setPresenter(FavoriteConreact.Presenter presenter) {

    }

    @Override
    public void initViews(View view) {

    }

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public void showResult() {

    }
}
