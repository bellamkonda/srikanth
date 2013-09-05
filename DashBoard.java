package com.srikanth.phonegap;

import org.apache.cordova.DroidGap;

import android.os.Bundle;

public class DashBoard extends DroidGap{
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		super.loadUrl("file:///android_asset/openshot/DashBoard.html");
	}

}
