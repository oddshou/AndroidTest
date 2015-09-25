package com.oddshou.testall.scroll;

import com.oddshou.testall.Logger;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class InterceptScrollView extends ScrollView {

    private static final String TAG = "InterceptScrollView";

    public InterceptScrollView(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
    }

    public InterceptScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
    }

    public InterceptScrollView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        // TODO Auto-generated method stub
        
        
        
        
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(ev);
        
        Logger.i(TAG, "onInterceptTouchEvent " + onInterceptTouchEvent + " " + ev.getAction(), "oddshou");
        return onInterceptTouchEvent;
    }
    
    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        // TODO Auto-generated method stub
        boolean onTouchEvent = super.onTouchEvent(ev);
        
        Logger.i(TAG, "onTouchEvent " + onTouchEvent +" " + ev.getAction() , "oddshou");
        return onTouchEvent;
        
    }

}
