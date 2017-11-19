package com.zhuqiqing.mvpdemo.data;

/**
 * Created by ZhuQiQing on 2017/11/15 23:24.
 */

public class DoubanMomentNewsThumbs {

    private DoubanMomentNewsMedium medium;

    private String description;

    private DoubanMomentNewsLarge large;

    private String tag_name;

    private DoubanMomentNewsSmall small;

    private int id;

    public DoubanMomentNewsMedium getMedium() {
        return medium;
    }

    public void setMedium(DoubanMomentNewsMedium medium) {
        this.medium = medium;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DoubanMomentNewsLarge getLarge() {
        return large;
    }

    public void setLarge(DoubanMomentNewsLarge large) {
        this.large = large;
    }

    public String getTag_name() {
        return tag_name;
    }

    public void setTag_name(String tag_name) {
        this.tag_name = tag_name;
    }

    public DoubanMomentNewsSmall getSmall() {
        return small;
    }

    public void setSmall(DoubanMomentNewsSmall small) {
        this.small = small;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
