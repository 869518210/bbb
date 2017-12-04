package com.zhuqiqing.mvpdemo.data;

import java.util.List;

/**
 * Created by ZhuQiQing on 2017/11/15 23:17.
 */

public class DoubanMomentNews {

    private int count;

    private List<DoubanMomentNewsPosts> posts;

    private int offset;

    private String date;

    private String total;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<DoubanMomentNewsPosts> getPosts() {
        return posts;
    }

    public void setPosts(List<DoubanMomentNewsPosts> posts) {
        this.posts = posts;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
