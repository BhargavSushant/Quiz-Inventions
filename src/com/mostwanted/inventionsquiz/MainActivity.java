package com.mostwanted.inventionsquiz;

import com.example.inventionsquiz.R;
import com.startapp.android.publish.StartAppSDK;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation.AnimationListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	protected Button bA, bB, bC, bD, bE, bF, bG, bH, bI ;
	protected Animation animAlpha;
	protected Button btnMenu, btnLogo;

	
	/** StartApp Native Ad declaration */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    	StartAppSDK.init(this, "208627113", "105320715", true); //TODO: Replace with your IDs
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
                                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.main);
        
        bA = (Button) findViewById(R.id.button1);
		bA.setOnClickListener(pressA);
		
		bB = (Button) findViewById(R.id.button2);
		bB.setOnClickListener(pressB);
		
		
		
		bC = (Button) findViewById(R.id.button4);
		bC.setOnClickListener(pressD);
		
	
		
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
	           
	    			Intent myIntent = new Intent(MainActivity.this, Levels.class);
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
	            
	    			Intent myIntent = new Intent(MainActivity.this, Inst.class);
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
	           
	    			Intent myIntent = new Intent(MainActivity.this, About.class);
	    			startActivityForResult(myIntent, 0);
	    			overridePendingTransition(R.anim.right_slide_in, R.anim.right_slide_out);
	            }
	        });
			v.startAnimation(animAlpha);
		}
	};
	
	@Override
	public void onBackPressed() {
	    AlertDialog.Builder builder = new AlertDialog.Builder(this);
	    builder.setCancelable(false);
	    builder.setMessage("Do you want to Exit?");
	    builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
	        @Override
	        public void onClick(DialogInterface dialog, int which) {
	            //if user pressed "yes", then he is allowed to exit from application
	            finish();
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

		