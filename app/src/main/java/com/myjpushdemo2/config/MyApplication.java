package com.myjpushdemo2.config;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by TR 105 on 2017/4/21.
 * Email:1241577948@qq.com
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        JPushInterface.setDebugMode(true);    // 设置开启日志,发布时请关闭日志
        JPushInterface.init(this);            // 初始化 JPush

    }
}
