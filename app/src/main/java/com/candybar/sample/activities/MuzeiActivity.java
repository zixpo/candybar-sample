package com.candybar.sample.activities;

import androidx.annotation.NonNull;

import candybar.lib.activities.CandyBarMuzeiActivity;
import com.candybar.sample.services.MuzeiService;

public class MuzeiActivity extends CandyBarMuzeiActivity {

    @NonNull
    @Override
    public Class<?> onInit() {
        return MuzeiService.class;
    }
}
