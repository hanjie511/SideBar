package com.example.hj.siderbar;


import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    AlphabetView view;
    AlertDialog alertDialog;
    TextView text;
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
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
        view.setOnClickListener(new AlphabetView.OnClickListener() {
            @Override
            public void onClick(String alpha) {
                if(MyAdapter.index_map.containsKey(alpha)){
                    int position=(int)MyAdapter.index_map.get(alpha);
                    recyclerView.scrollToPosition(position);
                    Toast.makeText(MainActivity.this,""+position,Toast.LENGTH_SHORT).show();
                }
            }
        });
        ArrayList<String> list=new ArrayList<>();
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
        list.add("赵子龙");
        list.add("徐鼎盛");
        ArrayList<String>list1= PinyinUtils.getSortedListByAlpha(list);
        linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        MyAdapter myAdapter=new MyAdapter(list1);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(myAdapter);
    }

}
