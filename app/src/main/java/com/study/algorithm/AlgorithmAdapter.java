package com.study.algorithm;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.study.R;

import java.util.List;

public class AlgorithmAdapter extends RecyclerView.Adapter<AlgorithmAdapter.MyViewHolder> {
    private List<String> webUrls;
    private Context context;

     void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }
    public OnItemClickListener getOnItemClickListener() {
        return onItemClickListener;
    }

    private OnItemClickListener onItemClickListener;
     AlgorithmAdapter(Context context, List<String> list) {
        this.context = context;
        this.webUrls = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.item_algorithm, null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {
        holder.tv_url.setText(webUrls.get(position));

        //通过接口回调响应点击事件
        holder.tv_url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onItemClickListener!=null){
                    onItemClickListener.onItemClick(v,holder.getAdapterPosition());
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return webUrls.size();
    }
    static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_url;

        MyViewHolder(View itemView) {
            super(itemView);
            tv_url = itemView.findViewById(R.id.tv_web_url);
        }
    }
    /**
     * 设置点击回调接口
     */
    public interface  OnItemClickListener{
        void onItemClick(View view,int position);
    }
}
