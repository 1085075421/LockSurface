package com.github.xiaofei_dev.locksurface.util;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2017/3/20.
 */

public final class MyApplication extends Application {

    private static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context getContext(){
        return mContext;
    }
}
