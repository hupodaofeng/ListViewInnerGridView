package com.example.zheng.listviewinnergridview.domain;

import java.util.List;

/**
 * Created by Zheng on 2017/5/7.
 *
 * @email 1037664873@qq.com
 * @Author Done
 */
public class Data {
    private String name;
    private String title;
    private List<String> lists;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }
}
