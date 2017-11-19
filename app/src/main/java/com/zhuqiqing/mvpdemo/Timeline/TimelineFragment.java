package com.zhuqiqing.mvpdemo.Timeline;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zhuqiqing.mvpdemo.R;
import com.zhuqiqing.mvpdemo.adapter.TimelineFragmentPagerAdapter;

/**
 * Created by ZhuQiQing on 2017/11/13 21:17.
 * Viewpager+Fragment
 */

public class TimelineFragment extends Fragment {

    private FloatingActionButton fab;

    private TabLayout tabLayout;

//    private

    public static TimelineFragment newInstance() {
        return new TimelineFragment();
    }

    //    初始化fragment,获取数据
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState!=null){
            FragmentManager manager=getChildFragmentManager();

        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_timeline, container, false);

//        初始化控件
        initviews(view);

//        tablayout监听
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == 2) {
                    fab.hide();
                } else {
                    fab.show();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
//        FloatingActionButton 监听
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tabLayout.getSelectedTabPosition() == 0) {

                } else {

                }
            }
        });
        return view;
    }

    private void initviews(View view) {
        ViewPager viewPager=view.findViewById(R.id.view_pager);
//        绑定pageradapter
        viewPager.setAdapter(new TimelineFragmentPagerAdapter(getContext(),getChildFragmentManager()));
//        设置viewpager左右缓存的页面
        viewPager.setOffscreenPageLimit(3);

        fab = view.findViewById(R.id.fab);
        tabLayout = view.findViewById(R.id.tab_layout);

//        tablayout绑定viewpager
        tabLayout.setupWithViewPager(viewPager);
    }
}
