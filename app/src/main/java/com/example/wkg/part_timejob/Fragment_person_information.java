package com.example.wkg.part_timejob;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by WKG on 2017/6/24.
 */

public class Fragment_person_information extends Fragment {
    @Nullable
    /*
    给listview添加内容first
     */
    private String[] group_one={"我的兼职","我的简历","我的收藏","我的偏好"};
    private String[] group_two={"我要找人","联系客服","投诉和反馈"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.person_infor,container,false);
        return view;
    }
}
