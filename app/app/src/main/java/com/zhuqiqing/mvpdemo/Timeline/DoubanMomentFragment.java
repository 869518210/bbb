package com.zhuqiqing.mvpdemo.Timeline;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhuqiqing.mvpdemo.data.DoubanMomentNewsPosts;

import java.util.List;

/**
 * Created by ZhuQiQing on 2017/11/16 21:33.
 */

public class DoubanMomentFragment extends Fragment implements DoubanMomentContract.View {

    public DoubanMomentFragment() {
    }

    public static DoubanMomentFragment newInstance() {
        return new DoubanMomentFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void setPresenter(DoubanMomentContract.Presenter presenter) {

    }

    @Override
    public void initViews(View view) {

    }

    @Override
    public void onSuccess(List<DoubanMomentNewsPosts> doubanMomentNewsPosts) {

    }

    @Override
    public void onError() {

    }
}
