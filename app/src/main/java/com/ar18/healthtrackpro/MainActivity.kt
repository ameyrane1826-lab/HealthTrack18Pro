package com.ar18.healthtrackpro
import android.app.Activity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
class MainActivity:Activity(){ @Suppress("SetJavaScriptEnabled") override fun onCreate(savedInstanceState:Bundle?){super.onCreate(savedInstanceState); val w=WebView(this);w.settings.javaScriptEnabled=true;w.settings.domStorageEnabled=true;w.webViewClient=WebViewClient();w.webChromeClient=WebChromeClient();setContentView(w);w.loadUrl("file:///android_asset/index.html")} override fun onBackPressed(){val w=(window.decorView.findViewById(android.R.id.content) as? android.view.ViewGroup)?.getChildAt(0) as? WebView;if(w?.canGoBack()==true)w.goBack()else super.onBackPressed()} }