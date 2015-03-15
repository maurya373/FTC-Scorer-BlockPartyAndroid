package com.completeip.ftcscorer13_14;

import com.completeip.ftcscorer13_14.R;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class TabFragment extends Fragment {

	// Holds a final variable that i dont know what it is for but was required
	public static final String ARG_OBJECT = "object";
	// Holds the current layout
	 
	Spinner redBlock, redRamp, blueBlock, blueRamp;
	Spinner redBlock2, redRamp2, blueBlock2, blueRamp2;
	TextView r1, b1;
	
	// On the creation of each tab
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
   

		View rootView = inflater.inflate(R.layout.autonomous, container, false);
		
		r1 = (TextView) rootView.findViewById(R.id.textView2);
		b1 = (TextView) rootView.findViewById(R.id.textView1);
		
		r1.setTextColor(Color.RED);
		b1.setTextColor(Color.BLUE);
		
		redBlock = (Spinner) rootView.findViewById(R.id.redBlockSpinner);
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.block_choices, android.R.layout.simple_spinner_item);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		redBlock.setAdapter(adapter);
		
		blueBlock = (Spinner) rootView.findViewById(R.id.blueBlockSpinner);
		ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this.getActivity(), R.array.block_choices, android.R.layout.simple_spinner_item);
		adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		blueBlock.setAdapter(adapter2);
		
		redRamp = (Spinner) rootView.findViewById(R.id.redRampSpinner);
		ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this.getActivity(), R.array.ramp_choices, android.R.layout.simple_spinner_item);
		adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		redRamp.setAdapter(adapter3);
		
		blueRamp = (Spinner) rootView.findViewById(R.id.blueRampSpinner);
		ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this.getActivity(), R.array.ramp_choices, android.R.layout.simple_spinner_item);
		adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		blueRamp.setAdapter(adapter4);
		
		// ******
		
		redBlock2 = (Spinner) rootView.findViewById(R.id.redBlockSpinner2);
		ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this.getActivity(), R.array.block_choices, android.R.layout.simple_spinner_item);
		adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		redBlock2.setAdapter(adapter5);
		
		blueBlock2 = (Spinner) rootView.findViewById(R.id.blueBlockSpinner2);
		ArrayAdapter<CharSequence> adapter6 = ArrayAdapter.createFromResource(this.getActivity(), R.array.block_choices, android.R.layout.simple_spinner_item);
		adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		blueBlock2.setAdapter(adapter6);
		
		redRamp2 = (Spinner) rootView.findViewById(R.id.redRampSpinner2);
		ArrayAdapter<CharSequence> adapter7 = ArrayAdapter.createFromResource(this.getActivity(), R.array.ramp_choices, android.R.layout.simple_spinner_item);
		adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		redRamp2.setAdapter(adapter7);
		
		blueRamp2 = (Spinner) rootView.findViewById(R.id.blueRampSpinner2);
		ArrayAdapter<CharSequence> adapter8 = ArrayAdapter.createFromResource(this.getActivity(), R.array.ramp_choices, android.R.layout.simple_spinner_item);
		adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		blueRamp2.setAdapter(adapter8);
		
		
       	return rootView;
        
    } // End onCreateView(LayoutInflater,ViewGroup,Bundle)
	
	 @Override
	 public void onPause() {
		 super.onPause();

		 switch (redBlock.getSelectedItemPosition()) {
		 	case 0: MainActivity.totalRedAutoBlock1 = 0; break;
		 	case 1: MainActivity.totalRedAutoBlock1 = 5; break;
		 	case 2: MainActivity.totalRedAutoBlock1 = 20; break;
		 	case 3: MainActivity.totalRedAutoBlock1 = 40; break;
		 	default: MainActivity.totalRedAutoBlock1 = 0;
		 }
		 
		 switch (blueBlock.getSelectedItemPosition()) {
		 	case 0: MainActivity.totalBlueAutoBlock1 = 0; break;
		 	case 1: MainActivity.totalBlueAutoBlock1 = 5; break;
		 	case 2: MainActivity.totalBlueAutoBlock1 = 20; break;
		 	case 3: MainActivity.totalBlueAutoBlock1 = 40; break;
		 	default: MainActivity.totalBlueAutoBlock1 = 0;
		 }
		 
		 switch (blueRamp.getSelectedItemPosition()) {
		 	case 0: MainActivity.totalBlueAutoRamp1 = 0; break;
		 	case 1: MainActivity.totalBlueAutoRamp1 = 10; break;
		 	case 2: MainActivity.totalBlueAutoRamp1 = 20; break;
		 	default: MainActivity.totalBlueAutoRamp1 = 0;
		 }
		 
		 switch (redRamp.getSelectedItemPosition()) {
		 	case 0: MainActivity.totalRedAutoRamp1 = 0; break;
		 	case 1: MainActivity.totalRedAutoRamp1 = 10; break;
		 	case 2: MainActivity.totalRedAutoRamp1 = 20; break;
		 	default: MainActivity.totalRedAutoRamp1 = 0;
		 }
		 
		 // *****
		 
		 switch (redBlock2.getSelectedItemPosition()) {
		 	case 0: MainActivity.totalRedAutoBlock2 = 0; break;
		 	case 1: MainActivity.totalRedAutoBlock2 = 5; break;
		 	case 2: MainActivity.totalRedAutoBlock2 = 20; break;
		 	case 3: MainActivity.totalRedAutoBlock2 = 40; break;
		 	default: MainActivity.totalRedAutoBlock2 = 0;
		 }
		 
		 switch (blueBlock2.getSelectedItemPosition()) {
		 	case 0: MainActivity.totalBlueAutoBlock2 = 0; break;
		 	case 1: MainActivity.totalBlueAutoBlock2 = 5; break;
		 	case 2: MainActivity.totalBlueAutoBlock2 = 20; break;
		 	case 3: MainActivity.totalBlueAutoBlock2 = 40; break;
		 	default: MainActivity.totalBlueAutoBlock2 = 0;
		 }
		 
		 switch (blueRamp2.getSelectedItemPosition()) {
		 	case 0: MainActivity.totalBlueAutoRamp2 = 0; break;
		 	case 1: MainActivity.totalBlueAutoRamp2 = 10; break;
		 	case 2: MainActivity.totalBlueAutoRamp2 = 20; break;
		 	default: MainActivity.totalBlueAutoRamp2 = 0;
		 }
		 
		 switch (redRamp2.getSelectedItemPosition()) {
		 	case 0: MainActivity.totalRedAutoRamp2 = 0; break;
		 	case 1: MainActivity.totalRedAutoRamp2 = 10; break;
		 	case 2: MainActivity.totalRedAutoRamp2 = 20; break;
		 	default: MainActivity.totalRedAutoRamp2 = 0;
		 }
		 
		 
	 }
	
	
} // End class TabFragment