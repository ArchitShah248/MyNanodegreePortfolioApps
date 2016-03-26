package com.portfolio.archit.myappportfolio.Activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

abstract public class BaseActivity extends AppCompatActivity{

	protected Context mContext;
	
	public abstract void initViews();
	public abstract void setListeners();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		mContext = this;
		super.onCreate(savedInstanceState);
		
		initViews();
		setListeners();
	}
	
	
	
}
