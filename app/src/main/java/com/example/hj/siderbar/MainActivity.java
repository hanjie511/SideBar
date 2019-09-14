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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }
    private void init_index_map(ArrayList<Map<String,String>> list){
        for(int i=0;i<list.size();i++){
            String name=list.get(i).get("name").toString();
            if(name.length()==1&&(name.charAt(0)>=65&&name.charAt(0)<=90)){
               index_map.put(name,i);
               System.out.println("name:"+name);
               System.out.println("i:"+i);
            }
        }
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
                if(index_map.containsKey(alpha)){
                    int position=(int)index_map.get(alpha);
                    recyclerView.scrollToPosition(position);
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
        ArrayList<Map<String,String>> list1= PinyinUtils.getSortedListByAlpha(list);
        init_index_map(list1);
        linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        MyAdapter myAdapter=new MyAdapter(list1);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(myAdapter);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {

            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                if(dy<=0){
                    group_text.setVisibility(View.GONE);
                }else if(dy>0){
                        LinearLayoutManager linearLayoutManager=(LinearLayoutManager) recyclerView.getLayoutManager();
                        View view=linearLayoutManager.getChildAt(0);
                        TextView text=view.findViewById(R.id.username_item);
                        group_text.setText(text.getTag().toString());
                        group_text.setVisibility(View.VISIBLE);
                }
            }
        });
    }

}
