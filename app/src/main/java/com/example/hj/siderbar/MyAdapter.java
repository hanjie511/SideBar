package com.example.hj.siderbar;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Map;
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.VH> {
    ArrayList<String> list;
    public static class VH extends RecyclerView.ViewHolder{
        TextView groupText;
        TextView username;
        LinearLayout linear;
        public VH(View view){
            super(view);
            groupText=view.findViewById(R.id.group_text_item);
            username=view.findViewById(R.id.username_item);
            linear=view.findViewById(R.id.username_linear);
        }
    }
    public MyAdapter(ArrayList<String>list){
        this.list=list;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item,viewGroup,false);
        VH vh=new VH(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull VH vh, int i) {
        String name=list.get(i);
        if(name.length()==1){
            if(name.charAt(0)>=65&&name.charAt(0)<=90){
                vh.linear.setVisibility(View.GONE);
                vh.groupText.setVisibility(View.VISIBLE);
                vh.groupText.setText(name);
                vh.username.setTag(list.get(i));
            }

        }else{
            vh.linear.setVisibility(View.VISIBLE);
            vh.groupText.setVisibility(View.GONE);
            vh.username.setText(name);
            vh.username.setTag(list.get(i));
       }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
