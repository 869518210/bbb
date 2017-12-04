package com.zhuqiqing.mvpdemo.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;

import com.zhuqiqing.mvpdemo.R;

/**
 * Created by ZhuQiQing on 2017/11/14 23:08.
 */

public class TimelineFragmentPagerAdapter extends FragmentPagerAdapter {

    private final int pagecount = 3;

    private String[] titles;

    public TimelineFragmentPagerAdapter(Context context, FragmentManager fragmentManager) {

//        父类FragmentPagerAdapter需要一个FragmentManager
        super(fragmentManager);
        titles = new String[]{
                context.getString(R.string.zhihu_daily),
                context.getString(R.string.douban_moment),
                context.getString(R.string.guokr_handpick)
        };
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            default:
                break;
        }
        return null;
    }

    @Override
    public int getCount() {
        return pagecount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
