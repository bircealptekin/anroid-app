package com.example.mentalhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Sounds extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sounds);
    }

    public void goFire(View v) {
        MediaPlayer mp = MediaPlayer.create(Sounds.this, R.raw.fire);
        mp.start();
    }

    public void goOcean(View v) {
        MediaPlayer mp = MediaPlayer.create(Sounds.this, R.raw.ocean);
        mp.start();
    }

    public void goRain(View v) {
        MediaPlayer mp = MediaPlayer.create(Sounds.this, R.raw.rain);
        mp.start();
    }

    public void goRainforest(View v) {
        MediaPlayer mp = MediaPlayer.create(Sounds.this, R.raw.rainforest);
        mp.start();
    }

    public void goWaterfall(View v) {
        MediaPlayer mp = MediaPlayer.create(Sounds.this, R.raw.waterfall);
        mp.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.home) {
            Intent i = new Intent(Sounds.this, Screen2.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.transition.slide_in_left,R.transition.slide_out_right);
    }

}