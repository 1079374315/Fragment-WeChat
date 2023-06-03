package com.gsls.fragment_wechat.activity;

import android.os.Bundle;
import android.view.KeyEvent;

import com.gsls.fragment_wechat.fragment.MainFragment;
import com.gsls.fragment_wechat.R;
import com.gsls.gt.GT;

@GT.Annotations.GT_AnnotationActivity(R.layout.activity_main)
public class MainActivity extends GT.GT_Activity.AnnotationActivity {

    //在初始化的时候直接默认启动 MainFragment
    @GT.GT_Fragment.Build(setLayoutMain = R.id.fl, setClass = MainFragment.class)
    private GT.GT_Fragment gt_fragment;

    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        //做一些初始化工作
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return super.onKeyDown(keyCode, event);
    }
}