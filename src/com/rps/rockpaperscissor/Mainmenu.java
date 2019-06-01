package com.rps.rockpaperscissor;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Mainmenu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mainmenu);
		
		Button rps = (Button) findViewById(R.id.rps);
		Button swg = (Button) findViewById(R.id.swg);
		Button poke = (Button) findViewById(R.id.poke);
		
		
		rps.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent rps = new Intent(Mainmenu.this, Play_RPS.class);
				Mainmenu.this.startActivity(rps);
			}
		});
		
		swg.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent swg = new Intent(Mainmenu.this, SnakeWaterGun.class);
				Mainmenu.this.startActivity(swg);
			}
		});
		
		poke.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent poke = new Intent(Mainmenu.this, Play_poke.class);
				Mainmenu.this.startActivity(poke);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mainmenu, menu);
		return true;
	}

}
