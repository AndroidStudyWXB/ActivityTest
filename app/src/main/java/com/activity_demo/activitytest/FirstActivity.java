package com.activity_demo.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by WXB506 on 2016/1/29.
 */
public class FirstActivity extends ActionBarActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);

        Button button1 = (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent 是 android 程序中各组件之间进行交互的一种重要方式，可以指明当前组件想要执行的动作，
                // 同时还可以在不同组件之间传递数据。一般可用于启动活动、启动服务、发送广播
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                // Activity类中提供了一个startActivity() 方法，专门用于启动活动，接受一个Intent参数
                startActivity(intent);
            }
        });
    }
}
