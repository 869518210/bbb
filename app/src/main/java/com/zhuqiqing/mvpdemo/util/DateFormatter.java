package com.zhuqiqing.mvpdemo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ZhuQiQing on 2017/11/11 15:36.
 */

public class DateFormatter {

    /**
     * 将long类date转换为String类型
     * @param date date
     * @return String date
     */
    public String ZhihuDailyDateFormat(long date){
        String sDate;
        Date d=new Date(date+24*60*60*1000);
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyyMMdd");
        sDate=dateFormat.format(d);
        return sDate;
    }

    public String DoubanDateFormat(long date){
        String sDate;
        Date d=new Date(date);
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        sDate=dateFormat.format(d);
        return sDate;
    }

}
