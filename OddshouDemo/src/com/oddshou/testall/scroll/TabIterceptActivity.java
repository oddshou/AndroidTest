package com.oddshou.testall.scroll;

import com.oddshou.testall.R;
import com.oddshou.testall.R.layout;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

public class TabIterceptActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tab_itercept);
		ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);
	}
	
	private void initViewPager(){
		
	}
}
