package com.flavu.activities;

import com.flavu.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Branch extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_branch);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.branch, menu);
		return true;
	}

}
