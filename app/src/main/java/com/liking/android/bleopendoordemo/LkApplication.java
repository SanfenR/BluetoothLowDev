package com.liking.android.bleopendoordemo;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.liking.android.bleopendoordemo.ble.LkBleManager;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

/**
 * Created on 2018/3/2
 * Created by sanfen
 *
 * @version 1.0.0
 */

public class LkApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        LkBleManager.getInstance().initialize(this);
        Logger.addLogAdapter(new AndroidLogAdapter());

    }
}
