package com.harperconsultingllc.sunnyoregon;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class SunnyOregon extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //System.exit(0);    	
    }
    @Override
    public void onResume() {
    	super.onResume();
    	Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sunnyoregon.com"));
    	//myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(myIntent);  	
    }
}