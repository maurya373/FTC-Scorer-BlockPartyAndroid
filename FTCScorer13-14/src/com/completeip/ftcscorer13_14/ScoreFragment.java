package com.completeip.ftcscorer13_14;

import com.completeip.ftcscorer13_14.R;
import android.support.v4.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ScoreFragment extends Fragment {
	
	public TextView redScore;
	public TextView blueScore;
	public Button refresh;
	public static final String ARG_OBJECT = "object";
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		  
       View rootView = inflater.inflate(R.layout.score, container, false);
        
       redScore = (TextView)rootView.findViewById(R.id.finalRedScore);
       blueScore = (TextView)rootView.findViewById(R.id.finalBlueScore);
       
       redScore.setTextColor(Color.RED);
       blueScore.setTextColor(Color.BLUE);
       
       refresh = (Button)rootView.findViewById(R.id.refresh);
   	   refresh.setOnClickListener(new OnClickListener() {
           @Override
           public void onClick(View v) {
        	   
        	   // update the two final score labels based on all of the tabs
        	   
        	   redScore.setTextColor(Color.RED);
        	   redScore.setText(MainActivity.totalRedAutoBlock1+MainActivity.totalRedAutoRamp1+
        			   MainActivity.totalRedAutoBlock2+MainActivity.totalRedAutoRamp2+
        			   MainActivity.totalRedBlockScore+MainActivity.totalRedFlag+MainActivity.totalRedLift+
        			   MainActivity.totalRedBonus+"");
        	   
        	   blueScore.setTextColor(Color.BLUE);
        	   blueScore.setText(MainActivity.totalBlueAutoBlock1+MainActivity.totalBlueAutoRamp1+
        			   MainActivity.totalBlueAutoBlock2+MainActivity.totalBlueAutoRamp2+
        			   MainActivity.totalBlueBlockScore+MainActivity.totalBlueFlag+MainActivity.totalBlueLift+
        			   MainActivity.totalBlueBonus+"");
           	
           }
        });
        
       return rootView;
        
	}
	
	 
}
