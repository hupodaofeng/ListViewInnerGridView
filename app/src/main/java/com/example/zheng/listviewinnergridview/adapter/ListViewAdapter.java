package com.example.zheng.listviewinnergridview.adapter;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.zheng.listviewinnergridview.R;
import com.example.zheng.listviewinnergridview.domain.Data;
import com.example.zheng.listviewinnergridview.view.MGridView;

import java.util.List;

/**
 * Created by Zheng on 2017/5/5.
 *
 * @email 1037664873@qq.com
 * @Author Done
 */
public class ListViewAdapter extends BaseAdapter {
    private static final String TAG = "ListViewAdapter";
    private LayoutInflater inflate;
    private List<Data> listview_item;
    private Context mContext;

    public ListViewAdapter(Context context, List<Data> list) {
        mContext = context;
        this.inflate = LayoutInflater.from(context);
        this.listview_item = list;
    }
    @Override
    public int getCount() {
        return listview_item.size();
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
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = inflate.inflate(R.layout.item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.mGridView = (MGridView) convertView.findViewById(R.id.gv);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
//        AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) convertView.getLayoutParams();
//        layoutParams.width = AbsListView.LayoutParams.MATCH_PARENT;
//        layoutParams.height = AbsListView.LayoutParams.WRAP_CONTENT;
//        convertView.setLayoutParams(layoutParams);
//        ViewGroup.LayoutParams layoutParams1 = viewHolder.mGridView.getLayoutParams();
//        layoutParams1.width = 500;
//        layoutParams1.height = ViewGroup.LayoutParams.WRAP_CONTENT;
//        viewHolder.mGridView.setLayoutParams(layoutParams1);
        // 设置GridView的Adapter
        viewHolder.mGridView.setAdapter(new GridViewAdapter(mContext, listview_item.get(position).getLists()));

        Log.e(TAG, viewHolder.mGridView.getWidth() + "\t" + viewHolder.mGridView.getHeight());
        // 计算GridView宽度, 设置默认为numColumns为3.
        return convertView;
    }

    private class ViewHolder{
        public MGridView mGridView;
    }
}
