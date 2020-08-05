package com.example.mainpage;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    private Context mContext;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext=this;
        setContentView(initLayout());
        initView();
        initData();

    }
    //布局的初始化
    protected abstract int initLayout();
     //控件的初始化
    protected  abstract void initView();
    //给控件赋值和添加事件
    protected abstract void initData();
}
