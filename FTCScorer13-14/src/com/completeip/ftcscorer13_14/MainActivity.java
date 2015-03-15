package com.completeip.ftcscorer13_14;

import java.util.Locale;

import com.completeip.ftcscorer13_14.R;
import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

public class MainActivity extends FragmentActivity implements ActionBar.TabListener {

	SectionsPagerAdapter mSectionsPagerAdapter;
	ViewPager mViewPager;
	public static int totalRedAutoBlock1 = 0;
	public static int totalBlueAutoBlock1 = 0;
	public static int totalRedAutoRamp1 = 0;
	public static int totalBlueAutoRamp1 = 0;
	public static int totalRedAutoBlock2 = 0;
	public static int totalBlueAutoBlock2 = 0;
	public static int totalRedAutoRamp2 = 0;
	public static int totalBlueAutoRamp2 = 0;
	public static int totalRedLift = 0;
	public static int totalBlueLift = 0;
	public static int totalRedFlag = 0;
	public static int totalBlueFlag = 0;
	public static int totalRedBlockScore = 0;
	public static int totalBlueBlockScore = 0;
	public static int totalRedBonus = 0;
	public static int totalBlueBonus = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		final ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setAdapter(mSectionsPagerAdapter);

		mViewPager.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
					@Override
					public void onPageSelected(int position) {
						actionBar.setSelectedNavigationItem(position);
					}
				});

		for (int i = 0; i < mSectionsPagerAdapter.getCount(); i++) {
			actionBar.addTab(actionBar.newTab().setText(mSectionsPagerAdapter.getPageTitle(i)).setTabListener(this));
		}
	
		// set content after initialization
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
		// When the given tab is selected, switch to the corresponding page in
		// the ViewPager.
		mViewPager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
	}

	@Override
	public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
	}

	public class SectionsPagerAdapter extends FragmentPagerAdapter {

		public SectionsPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		// could potentially check i and create different fragments accordingly
		// should be done to separate and simplify fragment code files
		
		@Override
	    public Fragment getItem(int i) {
			
			Fragment fragment = null;
			
			if (i==0) {
				fragment = new TabFragment();
			}
			else if(i==1) {
				fragment = new RedSideFragment();
			}
			else if(i==2) {
				fragment = new BlueSideFragment();
			}
			else if(i==3) {
				fragment = new EndGameFragment();
			}
			else {
				fragment = new ScoreFragment();
			}
			
	    	// Setting the tab fragments
	       
	        Bundle bundle = new Bundle();
	        bundle.putInt(TabFragment.ARG_OBJECT, i);
	        fragment.setArguments(bundle);
	        
	        return fragment;
	    } 

		@Override
		public int getCount() {
			// Show 3 total pages.
			return 5;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			Locale l = Locale.getDefault();
			switch (position) {
			case 0:
				return "Auto";
			case 1:
				return "Red";
			case 2:
				return "Blue";
			case 3:
				return "EndGame";
			case 4:
				return "Score";
			}
			return null;
		}
	}
	
}
