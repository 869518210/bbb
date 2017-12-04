package com.zhuqiqing.mvpdemo.data;

import java.util.List;

/**
 * Created by ZhuQiQing on 2017/11/15 22:54.
 */

public class ZhihuDailyNews {

    private String date;

    private List<ZhihuDailyNewsQuestion> stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<ZhihuDailyNewsQuestion> getStories() {
        return stories;
    }

    public void setStories(List<ZhihuDailyNewsQuestion> stories) {
        this.stories = stories;
    }
}
