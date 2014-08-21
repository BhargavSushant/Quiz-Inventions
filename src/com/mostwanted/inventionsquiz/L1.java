package com.mostwanted.inventionsquiz;

import com.example.inventionsquiz.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Chronometer;

public class L1 extends Activity {
	  private WebView mWebview ;
	 /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
                                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.l1);
        
        final Chronometer chrono = (Chronometer)findViewById(R.id.chronometer1);

        chrono.setBase(SystemClock.elapsedRealtime());
        chrono.start();
   
       
            WebView mWebView = null;
            mWebView = (WebView) findViewById(R.id.webview);
            mWebView.getSettings().setJavaScriptEnabled(true);
            mWebView.loadUrl("file:///android_asset/l1.html"); //new.html is html file name.

        
    }
    	@Override
    	public void onBackPressed() {
    	    AlertDialog.Builder builder = new AlertDialog.Builder(this);
    	    builder.setCancelable(false);
    	    builder.setMessage("Do you want to End Quiz Here?");
    	    builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
    	        @Override
    	        public void onClick(DialogInterface dialog, int which) {
    	            //if user pressed "yes", then he is allowed to exit from application
    	            finish();
    	            overridePendingTransition (R.anim.right_slide_in, R.anim.right_slide_out);
    	        }
    	    });
    	    builder.setNegativeButton("No",new DialogInterface.OnClickListener() {
    	        @Override
    	        public void onClick(DialogInterface dialog, int which) {
    	            //if user select "No", just cancel this dialog and continue with app
    	            dialog.cancel();
    	        }
    	    });
    	    AlertDialog alert=builder.create();
    	    alert.show();
    	}    
   
}
