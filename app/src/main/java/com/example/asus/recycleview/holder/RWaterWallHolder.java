package com.example.asus.recycleview.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.materialdesign.R;

/**
 * Created by zhiyuan on 17/3/21.
 */

public class RWaterWallHolder extends RecyclerView.ViewHolder {

    public  final TextView tv_item;

    public RWaterWallHolder(View itemView) {
        super(itemView);
        tv_item = (TextView) itemView.findViewById(R.id.tv_item);
    }
}
