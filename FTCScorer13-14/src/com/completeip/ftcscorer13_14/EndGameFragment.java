package com.completeip.ftcscorer13_14;

import com.completeip.ftcscorer13_14.R;
import android.support.v4.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class EndGameFragment extends Fragment {
	
	public RadioGroup redFlag, redLift, blueFlag, blueLift;
	public RadioButton Noneflag, NoneLift;
	public CheckBox redBalance, blueBalance;
	public Button record;
	
	public static final String ARG_OBJECT = "object";
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		  
        View rootView = inflater.inflate(R.layout.endgame, container, false);
        
        redFlag =  (RadioGroup)rootView.findViewById(R.id.redFlagGroup);
    	redLift =  (RadioGroup)rootView.findViewById(R.id.redLiftGroup);
    	blueFlag = (RadioGroup)rootView.findViewById(R.id.blueFlagGroup);
    	blueLift = (RadioGroup)rootView.findViewById(R.id.blueLiftGroup);
    	redBalance = (CheckBox)rootView.findViewById(R.id.redBalanceCheck);
    	blueBalance = (CheckBox)rootView.findViewById(R.id.blueBalanceCheck);
    	
    	Noneflag = (RadioButton)rootView.findViewById(R.id.bluenoneFlag);
    	NoneLift = (RadioButton)rootView.findViewById(R.id.bluenoneLift);
    	
    	Noneflag.setChecked(true);
    	NoneLift.setChecked(true);
    			
    	record = (Button)rootView.findViewById(R.id.record);
    	record.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
         	   
         	   // update the two final score labels based on all of the tabs
            	int redFlagID = redFlag.getCheckedRadioButtonId();
        		
        		if (redFlagID == R.id.rednoneFlag) 
        			MainActivity.totalRedFlag = 0;
        		else if (redFlagID == R.id.redhalfFlag) 
        			MainActivity.totalRedFlag = 15;	
        		else if (redFlagID == R.id.redfullFlag) 
        			MainActivity.totalRedFlag = 35;
        		
        		int blueFlagID = blueFlag.getCheckedRadioButtonId();
        		
        		if (blueFlagID == R.id.bluenoneFlag) 
        			MainActivity.totalBlueFlag = 0;
        		else if (blueFlagID == R.id.bluehalfFlag) 
        			MainActivity.totalBlueFlag = 15;	
        		else if (blueFlagID == R.id.bluefullFlag) 
        			MainActivity.totalBlueFlag = 35;
        		
        		int redLiftID = redLift.getCheckedRadioButtonId();
        		
        		if (redLiftID == R.id.rednoneLift) 
        			MainActivity.totalRedLift = 0;
        		else if (redLiftID == R.id.redoneLift) 
        			MainActivity.totalRedLift = 50;	
        		else if (redLiftID == R.id.redtwoLift) 
        			MainActivity.totalRedLift = 100;
        		
        		int blueLiftID = blueLift.getCheckedRadioButtonId();
        		
        		if (blueLiftID == R.id.bluenoneLift) 
        			MainActivity.totalBlueLift = 0;
        		else if (blueLiftID == R.id.blueoneLift) 
        			MainActivity.totalBlueLift = 50;	
        		else if (blueLiftID == R.id.bluetwoLift) 
        			MainActivity.totalBlueLift = 100;
        		
        		
        		if (redBalance.isChecked())
        			MainActivity.totalRedBonus = MainActivity.totalRedBlockScore / 2;
        		else
        			MainActivity.totalRedBonus = 0;
        		
        		if (blueBalance.isChecked()) 
        			MainActivity.totalBlueBonus = MainActivity.totalBlueBlockScore / 2;
        		else
        			MainActivity.totalBlueBonus = 0;
         	   
            	
            }
         });
    	
    	
        return rootView;
        
	}
	
	@Override
	public void onPause() {
		super.onPause();
		
		int redFlagID = redFlag.getCheckedRadioButtonId();
		
		if (redFlagID == R.id.rednoneFlag) 
			MainActivity.totalRedFlag = 0;
		else if (redFlagID == R.id.redhalfFlag) 
			MainActivity.totalRedFlag = 15;	
		else if (redFlagID == R.id.redfullFlag) 
			MainActivity.totalRedFlag = 35;
		
		int blueFlagID = blueFlag.getCheckedRadioButtonId();
		
		if (blueFlagID == R.id.bluenoneFlag) 
			MainActivity.totalBlueFlag = 0;
		else if (blueFlagID == R.id.bluehalfFlag) 
			MainActivity.totalBlueFlag = 15;	
		else if (blueFlagID == R.id.bluefullFlag) 
			MainActivity.totalBlueFlag = 35;
		
		int redLiftID = redLift.getCheckedRadioButtonId();
		
		if (redLiftID == R.id.rednoneLift) 
			MainActivity.totalRedLift = 0;
		else if (redLiftID == R.id.redoneLift) 
			MainActivity.totalRedLift = 50;	
		else if (redLiftID == R.id.redtwoLift) 
			MainActivity.totalRedLift = 100;
		
		int blueLiftID = blueLift.getCheckedRadioButtonId();
		
		if (blueLiftID == R.id.bluenoneLift) 
			MainActivity.totalBlueLift = 0;
		else if (blueLiftID == R.id.blueoneLift) 
			MainActivity.totalBlueLift = 50;	
		else if (blueLiftID == R.id.bluetwoLift) 
			MainActivity.totalBlueLift = 100;
		
		
		if (redBalance.isChecked())
			MainActivity.totalRedBonus = MainActivity.totalRedBlockScore / 2;
		else
			MainActivity.totalRedBonus = 0;
		
		if (blueBalance.isChecked()) 
			MainActivity.totalBlueBonus = MainActivity.totalBlueBlockScore / 2;
		else
			MainActivity.totalBlueBonus = 0;

	}

}
