package com.example.zheng.listviewinnergridview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.GridView;

public class MGridView extends GridView {


    public MGridView(Context context) {
        super(context);
    }

    public MGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MGridView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec + 50);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return false;
    }
}