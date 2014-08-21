package com.mostwanted.inventionsquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation.AnimationListener;
import android.widget.Button;

import com.example.inventionsquiz.R;


public class Levels extends Activity {

	protected Button bA, bB, bC, bD, bE, bF, bG, bH, bI ;
	protected Animation animAlpha;
	protected Button btnMenu, btnLogo;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
                                WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.levels);
		
		bA = (Button) findViewById(R.id.btnA);
		bA.setOnClickListener(pressA);
		
		bB = (Button) findViewById(R.id.btnB);
		bB.setOnClickListener(pressB);
		
		bC = (Button) findViewById(R.id.btnC);
		bC.setOnClickListener(pressC);
		
		bD = (Button) findViewById(R.id.btnD);
		bD.setOnClickListener(pressD);
		
		bE = (Button) findViewById(R.id.btnE);
		bE.setOnClickListener(pressE);
		
		bF = (Button) findViewById(R.id.btnF);
		bF.setOnClickListener(pressF);
		
		bG = (Button) findViewById(R.id.btnG);
		bG.setOnClickListener(pressG);
		
		bH = (Button) findViewById(R.id.btnH);
		bH.setOnClickListener(pressH);
		
	
		
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
	           
	    			Intent myIntent = new Intent(Levels.this, L1.class);
	    			startActivityForResult(myIntent, 0);
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
	            
	    			Intent myIntent = new Intent(Levels.this, L2.class);
	    			startActivityForResult(myIntent, 0);
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
	           
	    			Intent myIntent = new Intent(Levels.this, L3.class);
	    			startActivityForResult(myIntent, 0);
	    			overridePendingTransition(R.anim.right_slide_in, R.anim.right_slide_out);
	            }
	        });
			v.startAnimation(animAlpha);
		}
	};
	View.OnClickListener pressD = new View.OnClickListener() {
		@Override
		public void onClick(final View v) {
			animAlpha.setAnimationListener(new AnimationListener() { //changed to fade4
	            @Override
				public void onAnimationStart(Animation animation) {}
	            @Override
				public void onAnimationRepeat(Animation animation) {}
	            @Override
				public void onAnimationEnd(Animation animation) {
	       
	    			Intent myIntent = new Intent(Levels.this, L4.class);
	    			startActivityForResult(myIntent, 0);
	    			overridePendingTransition(R.anim.right_slide_in, R.anim.right_slide_out);
	            }
	        });
			v.startAnimation(animAlpha);
		}
	};
	View.OnClickListener pressE = new View.OnClickListener() {
		@Override
		public void onClick(final View v) {
			animAlpha.setAnimationListener(new AnimationListener() { //changed to fade4
	            @Override
				public void onAnimationStart(Animation animation) {}
	            @Override
				public void onAnimationRepeat(Animation animation) {}
	            @Override
				public void onAnimationEnd(Animation animation) {
	      
	    			Intent myIntent = new Intent(Levels.this, L5.class);
	    			startActivityForResult(myIntent, 0);
	    			overridePendingTransition(R.anim.right_slide_in, R.anim.right_slide_out);
	            }
	        });
			v.startAnimation(animAlpha);
		}
	};
	View.OnClickListener pressF = new View.OnClickListener() {
		@Override
		public void onClick(final View v) {
			animAlpha.setAnimationListener(new AnimationListener() { //changed to fade4
	            @Override
				public void onAnimationStart(Animation animation) {}
	            @Override
				public void onAnimationRepeat(Animation animation) {}
	            @Override
				public void onAnimationEnd(Animation animation) {
	 
	    			Intent myIntent = new Intent(Levels.this, L6.class);
	    			startActivityForResult(myIntent, 0);
	    			overridePendingTransition(R.anim.right_slide_in, R.anim.right_slide_out);
	            }
	        });
			v.startAnimation(animAlpha);
		}
	};
	View.OnClickListener pressG = new View.OnClickListener() {
		@Override
		public void onClick(final View v) {
			animAlpha.setAnimationListener(new AnimationListener() { //changed to fade4
	            @Override
				public void onAnimationStart(Animation animation) {}
	            @Override
				public void onAnimationRepeat(Animation animation) {}
	            @Override
				public void onAnimationEnd(Animation animation) {
	
	    			Intent myIntent = new Intent(Levels.this, L7.class);
	    			startActivityForResult(myIntent, 0);
	    			overridePendingTransition(R.anim.right_slide_in, R.anim.right_slide_out);
	            }
	        });
			v.startAnimation(animAlpha);
		}
	};
	View.OnClickListener pressH = new View.OnClickListener() {
		@Override
		public void onClick(final View v) {
			animAlpha.setAnimationListener(new AnimationListener() { //changed to fade4
	            @Override
				public void onAnimationStart(Animation animation) {}
	            @Override
				public void onAnimationRepeat(Animation animation) {}
	            @Override
				public void onAnimationEnd(Animation animation) {

	    			Intent myIntent = new Intent(Levels.this, L8.class);
	    			startActivityForResult(myIntent, 0);
	    			overridePendingTransition(R.anim.right_slide_in, R.anim.right_slide_out);
	            }
	        });
			v.startAnimation(animAlpha);
		}
	};
	

}


