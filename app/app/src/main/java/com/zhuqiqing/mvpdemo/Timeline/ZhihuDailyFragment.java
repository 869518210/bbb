package com.zhuqiqing.mvpdemo.Timeline;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhuqiqing.mvpdemo.R;
import com.zhuqiqing.mvpdemo.data.ZhihuDailyNewsQuestion;

import java.util.List;

/**
 * Created by ZhuQiQing on 2017/11/16 21:31.
 */

public class ZhihuDailyFragment extends Fragment implements ZhihuContract.View {

    public ZhihuDailyFragment() {
    }

    public static ZhihuDailyFragment newInstance() {
        return new ZhihuDailyFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_timeline_page,container,false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void setPresenter(ZhihuContract.Presenter presenter) {

    }

    @Override
    public void initViews(View view) {

    }

    @Override
    public void onSuccess(List<ZhihuDailyNewsQuestion> ZhihuDailyNewsQuestion) {

    }

    @Override
    public void onError() {

    }
}
