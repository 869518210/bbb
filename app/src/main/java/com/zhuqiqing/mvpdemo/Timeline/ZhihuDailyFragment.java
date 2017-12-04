package com.zhuqiqing.mvpdemo.Timeline;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhuqiqing.mvpdemo.R;
import com.zhuqiqing.mvpdemo.data.ZhihuDailyNewsQuestion;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

/**
 * Created by ZhuQiQing on 2017/11/16 21:31.
 */

public class ZhihuDailyFragment extends Fragment implements ZhihuContract.View {

    private ZhihuContract.Presenter presenter;
    private RecyclerView recyclerView;
    private SwipeRefreshLayout swipeRefreshLayout;
    private View mEmptyView;
    private FloatingActionButton floatingActionButton;

    private LinearLayoutManager linearLayoutManager;
    private int mYear,mMonth,mDay;

    public ZhihuDailyFragment() {
    }

    public static ZhihuDailyFragment newInstance() {
        return new ZhihuDailyFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Calendar calendar=Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("GMT+08"));
        mYear=calendar.get(Calendar.YEAR);
        mMonth=calendar.get(Calendar.MINUTE);
        mDay=calendar.get(Calendar.DAY_OF_MONTH);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_timeline_page,container,false);
        initViews(view);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                Calendar calendar=Calendar.getInstance();
                calendar.setTimeZone(TimeZone.getTimeZone("GMT+08"));
                
            }
        });
        return view;
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
