package com.completeip.ftcscorer13_14;

import com.completeip.ftcscorer13_14.R;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class RedSideFragment extends Fragment {
	
	public ImageButton crateOL, crateIL, crateOR, crateIR, redFloor;
	public Button clear;
	public TextView crateOLnum, crateILnum, crateORnum, crateIRnum, score, redFloornum;
	public static final String ARG_OBJECT = "object";
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		
        
        View rootView = inflater.inflate(R.layout.redside, container, false);
        
        score = (TextView)rootView.findViewById(R.id.redscore);
        
        clear = (Button)rootView.findViewById(R.id.redclear);
        clear.setOnClickListener(new OnClickListener() {
        	@Override
        	public void onClick(View v) {
        		crateOLnum.setText("0");
        		crateILnum.setText("0");
        		crateORnum.setText("0");
        		crateIRnum.setText("0");
        		redFloornum.setText("0");
        		score.setText("0");
        		crateOL.setBackgroundResource(R.drawable.bigcrate);
        		crateIL.setBackgroundResource(R.drawable.bigcrate);
        		crateOR.setBackgroundResource(R.drawable.bigcrate);
        		crateIR.setBackgroundResource(R.drawable.bigcrate);
        	}
        });
        
        redFloornum = (TextView)rootView.findViewById(R.id.redFloornum);
        redFloor = (ImageButton)rootView.findViewById(R.id.redFloor);
        redFloor.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
         	   
         	   redFloornum.setText(Integer.parseInt(redFloornum.getText().toString())+1+"");
         	   score.setText(Integer.parseInt(score.getText().toString())+1+"");
            }
         });
        
        
        //  Code for Crate outside left
        crateOLnum = (TextView)rootView.findViewById(R.id.redcrateOLnum);
        
        crateOL = (ImageButton) rootView.findViewById(R.id.redcrateOL);
        crateOL.setOnClickListener(new OnClickListener() {
           @Override
           public void onClick(View v) {
        	   
        	   updateImage(crateOL, crateOLnum);
        	   crateOLnum.setText(Integer.parseInt(crateOLnum.getText().toString())+1+"");
        	   score.setText(Integer.parseInt(score.getText().toString())+3+"");
           }
        });
        
        //  Code for Crate inside left
        crateILnum = (TextView)rootView.findViewById(R.id.redcrateILnum);
        
        crateIL = (ImageButton) rootView.findViewById(R.id.redcrateIL);
        crateIL.setOnClickListener(new OnClickListener() {
           @Override
           public void onClick(View v) {
        	   
        	   updateImage(crateIL, crateILnum);
        	   crateILnum.setText(Integer.parseInt(crateILnum.getText().toString())+1+"");
        	   score.setText(Integer.parseInt(score.getText().toString())+2+"");
           }
        });
        
        //  Code for Crate inside right
        crateIRnum = (TextView)rootView.findViewById(R.id.redcrateIRnum);
        
        crateIR = (ImageButton) rootView.findViewById(R.id.redcrateIR);
        crateIR.setOnClickListener(new OnClickListener() {
           @Override
           public void onClick(View v) {
        	   
        	   updateImage(crateIR, crateIRnum);
        	   crateIRnum.setText(Integer.parseInt(crateIRnum.getText().toString())+1+"");
        	   score.setText(Integer.parseInt(score.getText().toString())+2+"");
           }
        });
        
        //  Code for Crate outside right
        crateORnum = (TextView)rootView.findViewById(R.id.redcrateORnum);
        
        crateOR = (ImageButton) rootView.findViewById(R.id.redcrateOR);
        crateOR.setOnClickListener(new OnClickListener() {
           @Override
           public void onClick(View v) {
        	   
        	   updateImage(crateOR, crateORnum);
        	   crateORnum.setText(Integer.parseInt(crateORnum.getText().toString())+1+"");
        	   score.setText(Integer.parseInt(score.getText().toString())+3+"");
           }
        });
        
        return rootView;
	}
	
	@Override
	public void onPause() {
		super.onPause();
		MainActivity.totalRedBlockScore = Integer.parseInt(score.getText().toString());
		
		
	}
	
	public int getNum(TextView t) {
		
		return Integer.parseInt(t.getText().toString());
	}
	
	// ************ Method to update images
		public void updateImage(ImageButton ib, TextView tv) {
			
			if (Integer.parseInt(tv.getText().toString()) == 0) {
				ib.setBackgroundResource(R.drawable.bigcrate1);
			}
			else if (Integer.parseInt(tv.getText().toString()) == 1) {
				ib.setBackgroundResource(R.drawable.bigcrate2);
			}
			else if (Integer.parseInt(tv.getText().toString()) == 2) {
				ib.setBackgroundResource(R.drawable.bigcrate3);
			}
			else if (Integer.parseInt(tv.getText().toString()) == 3) {
				ib.setBackgroundResource(R.drawable.bigcrate4);
			}
			else if (Integer.parseInt(tv.getText().toString()) == 4) {
				ib.setBackgroundResource(R.drawable.bigcrate5);
			}
			else if (Integer.parseInt(tv.getText().toString()) == 5) {
				ib.setBackgroundResource(R.drawable.bigcrate6);
			}
			else if (Integer.parseInt(tv.getText().toString()) == 6) {
				ib.setBackgroundResource(R.drawable.bigcrate7);
			}
			
		}

}
