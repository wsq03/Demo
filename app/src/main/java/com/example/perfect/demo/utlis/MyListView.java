package com.example.perfect.demo.utlis;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * Created by Perfect on 2016/12/1 0001.
 */

public class MyListView extends ListView {
    public MyListView(Context context) {
        this(context,null);
    }

    public MyListView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MyListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int e = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec,e);
    }
}
