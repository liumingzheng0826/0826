package com.jiyun.helloworld.wude.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jiyun.helloworld.wude.R;
import com.jiyun.helloworld.wude.bean.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASAS on 2019/5/29.
 */

public class RlvAdapter extends RecyclerView.Adapter<RlvAdapter.ViewHolder>{

    private Context mContext;
    private List<Data> mList ;

    public RlvAdapter(Context context, List<Data> list) {
        mContext = context;
        mList = list;
    }

    @NonNull
    @Override
    public RlvAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(mContext).inflate(R.layout.rlv_item, null);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RlvAdapter.ViewHolder holder, int position) {
        Data data = mList.get(position);
        holder.img.setImageResource(R.mipmap.ic_launcher);
        holder.tv.setText(data.getName());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ;private ImageView img;
        private TextView tv;
        public ViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            tv = itemView.findViewById(R.id.tv);
        }
    }
}
