package com.parse.starter;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;
import com.parse.PushService;

public class ParseApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		// Add your initialization code here
		Parse.initialize(this, "vtSL0B6rTt2fUm1gLBqIa8J6EkBFls2aCAXFziA3", "WxbfV8wrXuV8baUjcHefisln4xivkWerQBpS66RC");

		ParseUser.enableAutomaticUser();
		ParseACL defaultACL = new ParseACL();
	    
		// If you would like all objects to be private by default, remove this line.
		defaultACL.setPublicReadAccess(true);
		
		ParseACL.setDefaultACL(defaultACL, true);
		
		PushService.subscribe(this, "", ParseStarterProjectActivity.class);
		PushService.subscribe(this, "test", ParseStarterProjectActivity.class);
		PushService.setDefaultPushCallback(this, ParseStarterProjectActivity.class);
	}

}
