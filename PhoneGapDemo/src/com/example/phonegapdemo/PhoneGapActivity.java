package com.example.phonegapdemo;

import android.os.Bundle;
import org.apache.cordova.*;

public class PhoneGapActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }    
}
