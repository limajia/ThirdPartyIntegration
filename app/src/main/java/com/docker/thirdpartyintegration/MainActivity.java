package com.docker.thirdpartyintegration;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = findViewById(R.id.my_toolbar); // 假设你的Toolbar的ID为my_toolbar
        setSupportActionBar(myToolbar); // 调用setActionBar方法，传入Toolbar对象
        getSupportActionBar().setTitle("第三方集成toolbar"); // 给左上角图标的左边加上一个返回的图标 。对应ActionBar.DISPLAY_HOME_AS_UP
    }
}