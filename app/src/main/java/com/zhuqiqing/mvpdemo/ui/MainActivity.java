package com.zhuqiqing.mvpdemo.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.zhuqiqing.mvpdemo.Fravorite.FavoriteFragment;
import com.zhuqiqing.mvpdemo.Info.InfoFragment;
import com.zhuqiqing.mvpdemo.R;
import com.zhuqiqing.mvpdemo.Timeline.TimelineFragment;

/**
 * Created by ZhuQiQing on 2017/11/13 21:01.
 * Mactivity+Fragment搭配
 * Mactivity+TimelineFragment+FavoriteFragment+InfoFragment
 */

public class MainActivity extends AppCompatActivity {

    private static String BOTTOM_NAVIGATION_VIEW="BOTTOM_NAVIGATION_VIEW";
    private static String ACTION_FAVORITES="com.zhuqiqing.mvpdemo.Fravorite";

    private TimelineFragment timelineFragment;
    private FavoriteFragment favoriteFragment;
    private InfoFragment infoFragment;

    private BottomNavigationView navigationView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        初始化控件
        initViews();
//        初始化fragment
        initFragments(savedInstanceState);
//        初始化界面
        if (savedInstanceState!=null){
            int id=savedInstanceState.getInt(BOTTOM_NAVIGATION_VIEW,R.id.nav_timeline);
            switch (id){
                case R.id.nav_timeline:
                    showFragment(timelineFragment);
                    break;
                case R.id.nav_favorites:
                    showFragment(favoriteFragment);
                    break;
                case R.id.nav_info:
                    showFragment(infoFragment);
                    break;
            }
        }else{
            if (getIntent().getAction().equals(ACTION_FAVORITES)){
                showFragment(favoriteFragment);
                navigationView.setSelectedItemId(R.id.nav_favorites);
            }else 
            showFragment(timelineFragment);
        }
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_timeline:
                        showFragment(timelineFragment);
                        break;
                    case R.id.nav_favorites:
                        showFragment(favoriteFragment);
                        break;
                    case R.id.nav_info:
                        showFragment(infoFragment);
                        break;
                }
                return true;
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(BOTTOM_NAVIGATION_VIEW,navigationView.getSelectedItemId());
        FragmentManager manager=getSupportFragmentManager();
        if (timelineFragment.isAdded()){
            manager.putFragment(outState,TimelineFragment.class.getSimpleName(),timelineFragment);
        }
        if (favoriteFragment.isAdded()){
            manager.putFragment(outState,FavoriteFragment.class.getSimpleName(),favoriteFragment);
        }
        if (infoFragment.isAdded()){
            manager.putFragment(outState,InfoFragment.class.getSimpleName(),infoFragment);
        }
    }

    //    初始化控件
    private void initViews(){
        navigationView=findViewById(R.id.bottom_nav);
    }

//    初始化fragment
    private void initFragments(Bundle savedInstanceState){
        FragmentManager fragmentManager=getSupportFragmentManager();
        if (savedInstanceState==null){
            timelineFragment=TimelineFragment.newInstance();
            favoriteFragment=FavoriteFragment.newInstance();
            infoFragment=InfoFragment.newInstance();
        }else{
            timelineFragment= (TimelineFragment) fragmentManager.getFragment(savedInstanceState,TimelineFragment.class.getSimpleName());
            favoriteFragment= (FavoriteFragment) fragmentManager.getFragment(savedInstanceState,FavoriteFragment.class.getSimpleName());
            infoFragment= (InfoFragment) fragmentManager.getFragment(savedInstanceState,InfoFragment.class.getSimpleName());
        }
        if (!timelineFragment.isAdded()){
            fragmentManager.beginTransaction()
                    .replace(R.id.container,timelineFragment,TimelineFragment.class.getSimpleName())
                    .commit();
        }
        if (!favoriteFragment.isAdded()){
            fragmentManager.beginTransaction()
                    .replace(R.id.container,favoriteFragment,FavoriteFragment.class.getSimpleName())
                    .commit();
        }
        if (!infoFragment.isAdded()){
            fragmentManager.beginTransaction()
                    .replace(R.id.container,infoFragment,InfoFragment.class.getSimpleName())
                    .commit();
        }
    }
//    展示退出前的fragment,默认TimelineFragment
    private void showFragment(Fragment fragment){
        FragmentManager manager=getSupportFragmentManager();
        if (fragment instanceof TimelineFragment){
            manager.beginTransaction()
                    .show(timelineFragment)
                    .hide(favoriteFragment)
                    .hide(infoFragment)
                    .commit();
        }
        if (fragment instanceof FavoriteFragment){
            manager.beginTransaction()
                    .show(favoriteFragment)
                    .hide(timelineFragment)
                    .hide(infoFragment)
                    .commit();
        }
        if(fragment instanceof InfoFragment){
            manager.beginTransaction()
                    .show(infoFragment)
                    .hide(timelineFragment)
                    .hide(favoriteFragment)
                    .commit();
        }
    }

}
