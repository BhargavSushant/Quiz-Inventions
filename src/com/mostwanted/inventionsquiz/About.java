package com.mostwanted.inventionsquiz;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation.AnimationListener;
import android.widget.Button;

import com.example.inventionsquiz.R;

public class About extends Activity {
		        
        protected Button bA, bB, bC, bD, bE, bF, bG, bH, bI ;
	    	protected Animation animAlpha;
	    	protected Button btnMenu, btnLogo;
	    	

	    	@Override
			protected void onCreate(Bundle savedInstanceState) {
	    		super.onCreate(savedInstanceState);
	    		requestWindowFeature(Window.FEATURE_NO_TITLE);
	            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
	                                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
	    		setContentView(R.layout.about);
	    		overridePendingTransition (R.anim.right_slide_in, R.anim.right_slide_out);
	    		
	    		bA = (Button) findViewById(R.id.btn1);
	    		bA.setOnClickListener(pressA);
	    		
	    		bB = (Button) findViewById(R.id.btn2);
	    		bB.setOnClickListener(pressB);
	    		
	    		bC = (Button) findViewById(R.id.btn3);
	    		bC.setOnClickListener(pressC);
	    		
	    		
	    		animAlpha = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alphabtn);
	    		
	    	
	    	}
	    	View.OnClickListener pressA = new View.OnClickListener() {
	    		@Override
				public void onClick(final View v) {
	    			animAlpha.setAnimationListener(new AnimationListener() { //changed to fade4
	    	            @Override
						public void onAnimationStart(Animation animation) {}
	    	            @Override
						public void onAnimationRepeat(Animation animation) {}
	    	            @Override
						public void onAnimationEnd(Animation animation) {
	    	           
	    	            	 startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/androidhariblog")));
 	        			    Log.i("Facebook", "Directing to Facebook Page.......");
	    	    			overridePendingTransition(R.anim.right_slide_in, R.anim.right_slide_out);
	    	            }
	    	        });
	    			v.startAnimation(animAlpha);
	    		}
	    	};
	    	View.OnClickListener pressB = new View.OnClickListener() {
	    		@Override
				public void onClick(final View v) {
	    			animAlpha.setAnimationListener(new AnimationListener() { //changed to fade4
	    	            @Override
						public void onAnimationStart(Animation animation) {}
	    	            @Override
						public void onAnimationRepeat(Animation animation) {}
	    	            @Override
						public void onAnimationEnd(Animation animation) {
	    	            	
	    	            	Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
	    	                        "mailto","hari2babloo@live.com", null));
	    	            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Feedback on Quiz Inventions");
	    	            startActivity(Intent.createChooser(emailIntent, "Send email..."));
	    	            	
	    	    			overridePendingTransition(R.anim.right_slide_in, R.anim.right_slide_out);
	    	            }
	    	        });
	    			v.startAnimation(animAlpha);
	    		}
	    	};
	    	
	    	View.OnClickListener pressC = new View.OnClickListener() {
	    		@Override
				public void onClick(final View v) {
	    			animAlpha.setAnimationListener(new AnimationListener() { //changed to fade4
	    	            @Override
						public void onAnimationStart(Animation animation) {}
	    	            @Override
						public void onAnimationRepeat(Animation animation) {}
	    	            @Override
						public void onAnimationEnd(Animation animation) {

	        			    startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://androidhari.blogspot.in/")));
	        			    Log.i("Blog", "Directing to Blog Page.......");
	    	    			overridePendingTransition(R.anim.right_slide_in, R.anim.right_slide_out);
	    	            }
	    	        });
	    			v.startAnimation(animAlpha);
	    		}
	    	};
	    			};
	    
	    


	    
	    	
	    	
	    	


