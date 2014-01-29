/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2013 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package be.k0suke.tiwebviewclearcache;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;

import ti.modules.titanium.ui.WebViewProxy;
import ti.modules.titanium.ui.widget.webview.TiUIWebView;

import android.webkit.WebView;

@Kroll.module(name="Tiwebviewclearcache", id="be.k0suke.tiwebviewclearcache")
public class TiwebviewclearcacheModule extends KrollModule
{

	// Standard Debugging variables
	private static final String TAG = "TiwebviewclearcacheModule";

	// You can define constants with @Kroll.constant, for example:
	// @Kroll.constant public static final String EXTERNAL_NAME = value;
	
	public TiwebviewclearcacheModule()
	{
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app)
	{
		Log.d(TAG, "inside onAppCreate");
		// put module init code that needs to run when the application is created
	}

	// Methods
	@Kroll.method
	public String example()
	{
		Log.d(TAG, "example called");
		return "hello world";
	}
	
	// Properties
	@Kroll.getProperty
	public String getExampleProp()
	{
		Log.d(TAG, "get example property");
		return "hello world";
	}
	
	
	@Kroll.setProperty
	public void setExampleProp(String value) {
		Log.d(TAG, "set example property: " + value);
	}

	@Kroll.method
	public void clearCache(WebViewProxy webViewProxy, Boolean flag)
    {
		WebView webView = webViewProxy.getWebView().getWebView();
		if (webView != null) {
			webView.clearCache(flag);
		}
    }
}

