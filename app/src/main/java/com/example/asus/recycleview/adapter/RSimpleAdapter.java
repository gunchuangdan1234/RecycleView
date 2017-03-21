package com.example.asus.recycleview.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus.recycleview.holder.RSimpleHolder;
import com.example.materialdesign.R;


import java.util.ArrayList;

/**
 * Created by zhiyuan on 17/3/21.
 */

public class RSimpleAdapter extends RecyclerView.Adapter<RSimpleHolder> {
    private final Context context;
    private final ArrayList<String> dataList;

    public RSimpleAdapter(Context context, ArrayList<String> dataList) {
        this.context=context;
        this.dataList=dataList;
    }

    /**
     * 关联相应的viewHolder
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public RSimpleHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //实例化布局view
        View view = LayoutInflater.from(context).inflate(R.layout.simple_item, parent, false);
        RSimpleHolder rSimpleHolder = new RSimpleHolder(view);
        return rSimpleHolder;
    }

    /**
     * 设置每个条目的数据
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(RSimpleHolder holder, int position) {
        holder.tv_item.setText(dataList.get(position));
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
