package com.example.wkg.part_timejob;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/26.
 */

public class Fragment_Conversation extends Fragment {
    private RecyclerView rv_conversation;
    private Toolbar tb_conversation;
    private ArrayList<Conversation_Data>datas;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_conversation,container,false);
        rv_conversation= (RecyclerView) view.findViewById(R.id.rv_conversation);
        tb_conversation= (Toolbar) view.findViewById(R.id.tb_conversation);
        setHasOptionsMenu(true);
        datas=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            Conversation_Data data=new Conversation_Data();
            data.setImagePath("null");
            data.setTheData("星期六");
            data.setTheName("name is "+i);
            data.setTheConversation("hi this is information"+i);
            datas.add(data);
        }
        ((AppCompatActivity)getActivity()).setSupportActionBar(tb_conversation);
        conversation_rv_adapter adapter=new conversation_rv_adapter(getContext());
        adapter.setArrayList(datas);
        rv_conversation.setLayoutManager(new LinearLayoutManager(getContext()));
        rv_conversation.setAdapter(adapter);
        adapter.setItemClickListener(new conversation_rv_adapter.MyItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(getContext(),"点击了:"+position,Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.fragment_conversation_toolbar_menu,menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.mn_add:
                Toast.makeText(getContext(),"go to add people",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
