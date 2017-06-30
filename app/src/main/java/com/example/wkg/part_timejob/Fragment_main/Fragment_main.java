package com.example.wkg.part_timejob.Fragment_main;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wkg.part_timejob.R;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;

import java.util.ArrayList;

/**
 * Created by WKG on 2017/6/24.
 */

public class Fragment_main extends Fragment {
    private Banner banner;
    private ArrayList<Integer> list_path;
    private ArrayList<String> list_title;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_main,container,false);
        banner = (Banner)view.findViewById(R.id.banner);
        InitData();
        return view;
    }
    private void InitData()
    {
        //banner=(Banner)getActivity().findViewById(R.id.banner);
        list_path=new ArrayList<>();
        list_path.add(R.drawable.test);
        list_path.add(R.drawable.test);
        list_title=new ArrayList<>();
        list_title.add("爱祖国");
        list_title.add("爱人民");
        //banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE);
        banner.setImageLoader(new GlideImageLoader());
        banner.setImages(list_path);
        banner.setBannerAnimation(Transformer.DepthPage);
        banner.setBannerTitles(list_title);
        banner.setDelayTime(1000);
        banner.isAutoPlay(true);
        banner.setIndicatorGravity(BannerConfig.CENTER);
        banner.start();
    }
}
