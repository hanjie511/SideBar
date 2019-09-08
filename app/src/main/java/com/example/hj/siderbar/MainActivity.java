package com.example.hj.siderbar;


import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    AlphabetView view;
    AlertDialog alertDialog;
    TextView text;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView(){
        view=findViewById(R.id.alpha);
        text=findViewById(R.id.text_alert);
        view.setText(text);
        view.setOnTouchListener(new AlphabetView.OnTouchListener() {
            @Override
            public void getAlpha(String alpha_value,MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_UP){

                }

            }
        });
        ArrayList<String> list=new ArrayList<>();
        list.add("韩杰");
        list.add("赵虹");
        list.add("王五");
        list.add("里斯");
        list.add("刘子");
       list.add("尔雅");
        ArrayList<ArrayList<String>>list1= PinyinUtils.getSortedListByAlpha(list);
        for(ArrayList<String> list2:list1){
            for(String str:list2){
                System.out.println("str:"+str);
            }
        }
    }
}
