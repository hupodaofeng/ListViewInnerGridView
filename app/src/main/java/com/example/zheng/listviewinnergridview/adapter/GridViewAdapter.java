package com.example.zheng.listviewinnergridview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.zheng.listviewinnergridview.R;

import java.util.List;

/**
 * Created by Zheng on 2017/5/5.
 *
 * @email 1037664873@qq.com
 * @Author Done
 */
public class GridViewAdapter extends BaseAdapter {
    private Context mContext;
    private List<String> list;

    public GridViewAdapter(Context context, List<String> list) {
        this.mContext = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate( R.layout.iv_item, parent,false);
        }
        ImageView imageView = (ImageView) convertView.findViewById(R.id.iv);
//        TextView textView = (TextView) convertView.findViewById(R.id.tv_title);
//        textView.setText(list.get(position));
        return convertView;
    }
}
