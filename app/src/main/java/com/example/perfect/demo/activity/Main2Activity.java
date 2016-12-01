package com.example.perfect.demo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.perfect.demo.R;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    ListView mList;
    List<String> data;
    ArrayAdapter<String> mAdapter;
    //https://github.com/wxcican/InterView_ListView_20161201.git

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mList = (ListView) findViewById(R.id.lst_main2);
      data=  new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            data.add("第" + i + "条数据");
        }
        mAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        mList.setAdapter(mAdapter);
         setListViewHight(mList);
    }

    private void setListViewHight(ListView listView) {
        //
        ListAdapter adapter = listView.getAdapter();
        if (adapter == null) {
            return;
        }
        int tiotalHight = 0;
        for (int i = 0; i < adapter.getCount(); i++) {
            //adapter.getCount()
            View listltem = adapter.getView(i, null, listView);
            //计算子项View的宽高
            listltem.measure(0, 0);
            //统计所有子项的高度
            tiotalHight += listltem.getMeasuredHeight();
        }
        ViewGroup.LayoutParams params = listView.getLayoutParams();
        //listView.getDividerHeight()获取子项间分隔符占用的高度
        int i = (listView.getDividerHeight() * (listView.getCount()-1));
        params.height = i + tiotalHight;
        listView.setLayoutParams(params);




    }

}
