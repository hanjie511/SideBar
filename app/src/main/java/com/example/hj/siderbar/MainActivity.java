package com.example.hj.siderbar;


import android.app.AlertDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class MainActivity extends AppCompatActivity {
    public static Map<String,Integer> index_map=new HashMap<String, Integer>();
    AlphabetView view;
    AlertDialog alertDialog;
    TextView text;
    TextView group_text;
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    boolean scrollToPosition=false;
    ArrayList<String> list1=new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView(){
        view=findViewById(R.id.alpha);
        text=findViewById(R.id.alert_text_main);
        view.setText(text);
        recyclerView=findViewById(R.id.recycler);
        group_text=findViewById(R.id.group_text_main);
        view.setOnClickListener(new AlphabetView.OnClickListener() {
            @Override
            public void onClick(String alpha) {
                if(list1.contains(alpha)){
                    int position=(int)list1.indexOf(alpha);
                    moveToPosition((LinearLayoutManager) recyclerView.getLayoutManager(),position);
                }
            }
        });
        LinkedList<String> list=new LinkedList<>();
        list.add("韩杰");
        list.add("赵高");
        list.add("王五");
        list.add("里斯");
        list.add("刘子");
        list.add("尔雅");
        list.add("刘三");
        list.add("刘强");
        list.add("郝梦龄");
        list.add("汉三军");
        list.add("唐国强");
        list.add("唐三藏");
        list.add("王军");
        list.add("网上三");
        list.add("简化军");
        list.add("成龙");
        list.add("陈三强");
        list.add("丁龙");
        list.add("赵子龙1");
        list.add("赵子龙2");
        list.add("赵子龙3");
        list.add("赵子龙4");
        list.add("赵子龙5");
        list.add("赵子龙6");
        list.add("赵子龙7");
        list.add("赵子龙8");
        list.add("赵子龙9");
        list.add("赵子龙10");
        list.add("赵子龙11");
        list.add("赵子龙12");
        list.add("赵子龙13");
        list.add("徐鼎盛");
        list1= PinyinUtils.getSortedListByAlpha(list);
        linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        MyAdapter myAdapter=new MyAdapter(list1);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(myAdapter);
    }
    /*
    将指定的列表项置顶显示的方法
     */
    public void moveToPosition(LinearLayoutManager manager, int n) {
        manager.scrollToPositionWithOffset(n, 0);
        manager.setStackFromEnd(true);
    }
}
