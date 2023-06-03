package com.gsls.fragment_wechat.fragment;

import android.os.Bundle;
import android.view.View;

import com.gsls.fragment_wechat.R;
import com.gsls.fragment_wechat.fragment.home.FragmentA;
import com.gsls.fragment_wechat.fragment.home.FragmentB;
import com.gsls.fragment_wechat.fragment.home.FragmentC;
import com.gsls.fragment_wechat.fragment.home.FragmentD;
import com.gsls.gt.GT;

@GT.Annotations.GT_AnnotationFragment(R.layout.fragment_main)
public class MainFragment extends GT.GT_Fragment.AnnotationFragment {

    @Override
    protected void initView(View view, Bundle savedInstanceState) {
        super.initView(view, savedInstanceState);
        //参数说明：首页容器，其他页面容器，默认加载的页面，切换动画(非填选项)0~7 (推荐0/4)
        setHomeModel(R.id.fl_home, R.id.fl_main, FragmentA.class, 1);
    }

    @GT.Annotations.GT_Click({R.id.btnA, R.id.btnB, R.id.btnC, R.id.btnD})
    public void OnClick(View view) {
        switch (view.getId()) {
            case R.id.btnA:
                startFragmentHome(FragmentA.class);//启动或切换 FragmentA
                break;
            case R.id.btnB:
                startFragmentHome(FragmentB.class);//启动或切换 FragmentB
                break;
            case R.id.btnC:
                startFragmentHome(FragmentC.class);//启动或切换 FragmentC
                break;
            case R.id.btnD:
                startFragmentHome(FragmentD.class);//启动或切换 FragmentD
                break;
        }
    }

}
