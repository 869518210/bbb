package com.zhuqiqing.mvpdemo.Timeline;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhuqiqing.mvpdemo.data.GuokrHandpickNewsResult;

import java.util.List;

/**
 * Created by ZhuQiQing on 2017/11/16 21:49.
 */

public class GuokrHandpickFragment extends Fragment implements GuokrHandpickContract.View {

    public GuokrHandpickFragment() {
    }

    public static GuokrHandpickFragment newIntsantce() {
        return new GuokrHandpickFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void setPresenter(GuokrHandpickContract.Presenter presenter) {

    }

    @Override
    public void initViews(View view) {

    }

    @Override
    public void onSuccess(List<GuokrHandpickNewsResult> guokrHandpickNewsResults) {

    }

    @Override
    public void onError() {

    }
}
