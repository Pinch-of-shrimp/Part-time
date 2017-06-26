package com.example.wkg.part_timejob;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

public class MainActivity extends AppCompatActivity {
    private FrameLayout fl_contain;
    /*
    变量声明
     */
    private BottomNavigationBar bottom_navigation_bar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fl_contain= (FrameLayout) findViewById(R.id.fragment_containt);
        initBottomNavigationBar();

    }

    private void initBottomNavigationBar(){
        //找到对应的页面布局---BottomNavigationBar
        bottom_navigation_bar = (BottomNavigationBar) findViewById(R.id.bottom_navigation_bar);
        bottom_navigation_bar.setMode(BottomNavigationBar.MODE_SHIFTING);
        bottom_navigation_bar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_RIPPLE);

        /*
            设置消息数目
            badge=new BadgeItem()
             .setText("2")；//显示文本
         */
        /*
        添加底部导航栏分别有 “首页  招聘  消息  我的”四个按钮
        V 1.0
        Create by wkg
         */
        bottom_navigation_bar.addItem(new BottomNavigationItem(R.mipmap.home,"首页"))
                .addItem(new BottomNavigationItem(R.mipmap.document, "招聘"))
                .addItem(new BottomNavigationItem(R.mipmap.mail, "消息"))
                .addItem(new BottomNavigationItem(R.mipmap.user, "我的"))
                .initialise();//初始化
        bottom_navigation_bar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener(){

            @Override
            public void onTabSelected(int position) {
                //未选中 -> 选中
                /*
                *
                */
                switch (position)
                {
                    case 0:
                        Fragment f1=new Fragment_main();
                        FragmentTransaction ft= getFragmentManager().beginTransaction();
                        ft.replace(R.id.fragment_containt,f1).commit();
                        break;
                    case 1:
                        Fragment f2=new Fragment_person_information();
                        FragmentTransaction ft2=getFragmentManager().beginTransaction();
                        ft2.replace(R.id.fragment_containt,f2).commit();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onTabUnselected(int position) {
                //选中 -> 未选中
            }

            @Override
            public void onTabReselected(int position) {
                //选中 -> 选中
            }
        });
    }
}