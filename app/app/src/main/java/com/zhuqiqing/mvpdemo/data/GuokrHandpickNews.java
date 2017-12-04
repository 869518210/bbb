package com.zhuqiqing.mvpdemo.data;

import java.util.List;

/**
 * Created by ZhuQiQing on 2017/11/15 23:40.
 */

public class GuokrHandpickNews {

    private String now;

    private boolean ok;

    private int limit;

    private List<GuokrHandpickNewsResult> result;

    private int offset;

    private int total;

    public String getNow() {
        return now;
    }

    public void setNow(String now) {
        this.now = now;
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public List<GuokrHandpickNewsResult> getResult() {
        return result;
    }

    public void setResult(List<GuokrHandpickNewsResult> result) {
        this.result = result;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
