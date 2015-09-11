package com.oddshou.testall.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.oddshou.testall.R;

public class FragmentScrollView extends Fragment {
    private int mScrollViewBgColor;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
    }
    
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View rootView = inflater.inflate(R.layout.scroll_view, null);
        if (mScrollViewBgColor != 0) {
            rootView.findViewById(R.id.btnContent).setBackgroundColor(mScrollViewBgColor);
        }
        return rootView;
    }
    
    public void setColor(int color){
        mScrollViewBgColor = color;
    }

}
