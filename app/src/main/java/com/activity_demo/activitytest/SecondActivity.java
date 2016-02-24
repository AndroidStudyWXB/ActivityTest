package com.activity_demo.activitytest;

import android.app.Activity;
import android.os.Bundle;

import com.activity_demo.activitytest.R;

/**
 * Created by WXB506 on 2016/2/18.
 */
public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
    }
}