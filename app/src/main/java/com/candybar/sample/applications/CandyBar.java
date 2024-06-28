package com.candybar.sample.applications;

import androidx.annotation.NonNull;

// TODO: Remove `//` below to enable OneSignal
//import com.onesignal.OneSignal;

import com.candybar.sample.R;

import candybar.lib.applications.CandyBarApplication;

public class CandyBar extends CandyBarApplication {

    // TODO: Remove `/*` and `*/` below to enable OneSignal
    /*
    @Override
    public void onCreate() {
        super.onCreate();
        // OneSignal Initialization
        OneSignal.initWithContext(this, "YOUR_ONESIGNAL_APP_ID");
    }
    */

    @NonNull
    @Override
    public Class<?> getDrawableClass() {
        return R.drawable.class;
    }

    @NonNull
    @Override
    public Configuration onInit() {
        Configuration configuration = new Configuration();

        // TODO: Remove `/*` and `*/` below to enable OneSignal
        /*
        configuration.setNotificationEnabled(true, (isEnable) -> {
            if (isEnable) {
                OneSignal.getUser().getPushSubscription().optIn();
            } else {
                OneSignal.getUser().getPushSubscription().optOut();
            }
        });
        */

        configuration.setGenerateAppFilter(true);
        configuration.setGenerateAppMap(true);
        configuration.setGenerateThemeResources(true);

        return configuration;
    }
}
