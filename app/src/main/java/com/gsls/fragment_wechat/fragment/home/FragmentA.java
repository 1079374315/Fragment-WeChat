package com.gsls.fragment_wechat.fragment.home;

import android.os.Bundle;
import android.view.View;

import com.gsls.fragment_wechat.fragment.more.FragmentDemo;
import com.gsls.fragment_wechat.R;
import com.gsls.gt.GT;

@GT.Annotations.GT_AnnotationFragment(R.layout.fragment_a)
public class FragmentA extends GT.GT_Fragment.AnnotationFragment {

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        super.initView(view, savedInstanceState);
        GT.logt("初始化");
        findViewById(R.id.tvNew).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startFragment(FragmentDemo.class);//启动一个新的Fragment
            }
        });
    }

    @Override
    protected void show() {
        super.show();
        GT.logt("显示 当前Fragment");
    }

    @Override
    protected void hide() {
        super.hide();
        GT.logt("隐藏 当前Fragment");
    }

    @Override
    protected boolean onBackPressed() {
        //拦截返回事件，如果设置为 false 就会不拦截返回事件导致退出栈并销毁 当前Fragment
        GT.logt("监听到返回");
        return true;
    }
}
