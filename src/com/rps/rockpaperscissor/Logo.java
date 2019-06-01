package com.rps.rockpaperscissor;



import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Logo extends Activity {

	
	private static int TIMEOUT = 4000;
	
	 ImageView logoanim; 
	 Animation animation, fade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
        
        logoanim = (ImageView) findViewById(R.id.logo);
		animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.newanimation);
        logoanim.startAnimation(animation);
        logoanim.setImageLevel(R.drawable.rps7);
        
        new Handler().postDelayed( new Runnable() {
        	@Override
        	public void run(){
        		Intent logo = new Intent(Logo.this, Mainmenu.class);
        		Logo.this.startActivity(logo);
        		finish();
        	}
        }, TIMEOUT);
        
   
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.logo, menu);
        return true;
    }
    
}
