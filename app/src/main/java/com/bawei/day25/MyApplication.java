package com.bawei.day25;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * ProjectName: Day25
 * PackageName: com.bawei.day25
 * ClassName:   MyApplication
 * Description: Java类的作用
 * Author: Lazy
 * CreateDate: 2020/2/25_10:56
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
