package com.srikanth.phonegap;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;


/**
 * author: srikanth
 * PhoneGap= HTML+CSS+JAVASCRIPT
 * what i did?
 * 
 * Observing the output is very easy but for that small out i did a lot..., just follow me.
 * step 1: in the xml file i used CorodovaWebview----> by adding the lib we get cordovaWebView
 * Step 2: in the Main activity i loaded the html page, but in order to load html page on the cordovaWebView for action sequences we did
 * step 3: i copied ActivityPlugin.java from the framework sample, that is a standard java file for plug_in of corodova
 * step 4: i copied PluginManagerTest.java from the framework sample, that is a standard java file for test plugger for the project, replace with your package name carefully
 * create xml folder in res folder in designing area in that xml folder create a confing.xml file for loading as well as set up of envi,
 * in the config.xml plz observer the <content> tag it is for loading html file.
 * in the config.xml plz observer the <feature> that is very very imp for connectivity of your app making to phonegap
 * warning you don't forger the feature tag in the res/xml/confing.xml file... 
 * for ex: i want to make a camera app based on phonegap at that time <feature> tag is very imp
 * 
 * finally place your all the webpages as well as supporting pages in the assert folder
 * 
 * if you run this app it will shows u a login page plz give the username as" srikanth " and pswd as " sri "... no spaces no capital
 */
public class MainActivity extends Activity implements CordovaInterface {
    public CordovaWebView cordovaWebView;

    private final ExecutorService threadPool = Executors.newCachedThreadPool();
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        cordovaWebView = (CordovaWebView) findViewById(R.id.dovaWebView);

        cordovaWebView.loadUrl("file:///android_asset/openshot/LoginPage.html");

    }

    public Context getContext() {
        return this;
    }

    public void startActivityForResult(CordovaPlugin command, Intent intent,
            int requestCode) {
        // TODO Auto-generated method stub
        
    }

    public void setActivityResultCallback(CordovaPlugin plugin) {
        // TODO Auto-generated method stub
        
    }

    //Note: This must always return an activity!
    public Activity getActivity() {
        return this;
    }

    @Deprecated
    public void cancelLoadUrl() {
        // TODO Auto-generated method stub
        
    }

    public Object onMessage(String id, Object data) {
        // TODO Auto-generated method stub
        return null;
    }

    public ExecutorService getThreadPool() {
        // TODO Auto-generated method stub
        return threadPool;
    }
    
    @Override
    /**
     * The final call you receive before your activity is destroyed.
     */
    public void onDestroy() {
        super.onDestroy();
        if (cordovaWebView != null) {
            // Send destroy event to JavaScript
            cordovaWebView.handleDestroy();
        }
    }}
