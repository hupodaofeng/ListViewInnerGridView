package com.example.zheng.listviewinnergridview.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.zheng.listviewinnergridview.R;
import com.example.zheng.listviewinnergridview.adapter.ListViewAdapter;
import com.example.zheng.listviewinnergridview.domain.Data;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<Data> lists = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        listView = (ListView) findViewById(R.id.lv);
        ListViewAdapter listViewAdapter = new ListViewAdapter(this,lists);
        listView.setAdapter(listViewAdapter);
    }

    private void initData() {
        for (int i = 0; i < 1000; i++) {
            Data itemListView = new Data();
            itemListView.setName("item " + i);
            itemListView.setTitle("i = " + i);
            List<String> list = new ArrayList<>();
            for (int j = 0; j < 100; j++) {
                list.add(j + "");
            }
            itemListView.setLists(list);
            lists.add(itemListView);
        }
    }
}
