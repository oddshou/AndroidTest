
package com.oddshou.testall.activity;

import com.oddshou.testall.R;
import com.oddshou.testall.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class TwoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
    }
    
    @Override
    protected void onNewIntent(Intent intent) {
        // TODO Auto-generated method stub
        super.onNewIntent(intent);
        Log.i("TwoActivity", "#####################onnewintent" + intent.toString());
    }
    
    public void doClick(View v){
        switch (Integer.valueOf((String)v.getTag())) {
            case 10: //back
                finish();
                break;
            case 11:
                startActivity(new Intent(this, OneActivity.class));
                break;

            default:
                break;
        }
    }
}
