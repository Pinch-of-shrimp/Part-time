package com.example.wkg.part_timejob;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by WKG on 2017/6/24.
 */

public class Fragment_person_information extends Fragment implements OnClickListener{
    private TextView tv_register;
    private ListView lv_group_one;
    private ListView getLv_group_two;
    @Nullable
    /*
    给listview添加内容first
     */
    private String[] group_one={"我的兼职","我的简历","我的收藏","我的偏好"};
    private String[] group_two={"我要找人","联系客服","投诉和反馈"};
    private ArrayList<String>data1;
    private ArrayList<String>data2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.person_infor,container,false);
        tv_register= (TextView) view.findViewById(R.id.tv_register);
        lv_group_one= (ListView) view.findViewById(R.id.lv_group_one);
        getLv_group_two= (ListView) view.findViewById(R.id.lv_group_two);
        tv_register.setOnClickListener(this);
        data1=new ArrayList<>();
        data2=new ArrayList<>();
        for(int i=0;i<group_one.length;i++)
            data1.add(group_one[i]);
        for (int i=0;i<group_two.length;i++)
            data2.add(group_two[i]);
        lv_group_one.setAdapter(new ListAdapter(data1,getContext()));
        getLv_group_two.setAdapter(new ListAdapter(data2,getContext()));

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.tv_register:
                Toast.makeText(getContext(),"this is register",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }

    }
}
