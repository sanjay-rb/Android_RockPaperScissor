package com.rps.rockpaperscissor;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Play_poke extends Activity {

	
	int[] imageNo = {R.drawable.rps11, R.drawable.rps12, R.drawable.rps13};
	int sel, r, x;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_play_poke);
		
		
		ImageButton imgstone = (ImageButton) findViewById(R.id.Stone);
		ImageButton imgpaper = (ImageButton) findViewById(R.id.Paper);
		ImageButton imgscissor = (ImageButton) findViewById(R.id.Scissor);
		final ImageView Select = (ImageView) findViewById(R.id.Select);
		final ImageView Selectcp = (ImageView) findViewById(R.id.Selectcp);
		
		imgstone.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				sel = 0;
				Select.setImageResource(imageNo[sel]);
				x = cpplay();
				Selectcp.setImageResource(imageNo[x]);
				gameplay(sel , x);
			}
		});
		
		imgpaper.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				sel = 1;
				Select.setImageResource(imageNo[sel]);
				x = cpplay();
				Selectcp.setImageResource(imageNo[x]);
				gameplay(sel , x);
			}
		});
		
		imgscissor.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				sel = 2;
				Select.setImageResource(imageNo[sel]);
				x = cpplay();
				Selectcp.setImageResource(imageNo[x]);
				gameplay(sel , x);
			}
		});
	}
	
	public int cpplay(){
		 r = (int) (Math.random()*3+0);
		 return r;
	}
	
	public void gameplay(int a, int b){
		TextView Exp = (TextView) findViewById(R.id.expression);
		final MediaPlayer chari = MediaPlayer.create(this, R.raw.sample7);
		final MediaPlayer venar = MediaPlayer.create(this, R.raw.sample8);
		final MediaPlayer blast = MediaPlayer.create(this, R.raw.sample9);
		if(a==b){	
			Exp.setTextSize(20);
			Exp.setText("Do It Again!!");
			Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotation);
			Exp.startAnimation(animation);
		}
		else if((a==0&&b==1)||(a==1&&b==2)||(a==2&&b==0)){
			Exp.setTextSize(35);
			Exp.setText("You Won!!");
			Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotation);
			Exp.startAnimation(animation);
			
			if(a==0&&b==1){
				chari.start();
			}
			else if(a==1&&b==2){
				venar.start();
			}
			else if(a==2&&b==0)
			{
				blast.start();
			}
		}
		else if((a==0&&b==2)||(a==1&&b==0)||(a==2&&b==1)){
			Exp.setTextSize(20);
			Exp.setText("Hoo Nooo!!");
			Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotation);
			Exp.startAnimation(animation);
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.play_poke, menu);
		return true;
	}

}
