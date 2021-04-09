package com.example.mentalhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Reminder extends AppCompatActivity {

    private SharedPreferences person_details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);
    }

    public void goSave(View v){

        person_details = getApplicationContext().getSharedPreferences("person_details", MODE_PRIVATE);
        EditText myName =  findViewById(R.id.editText);
        String txt = myName.getText().toString();
        SharedPreferences.Editor editor = person_details.edit();
        editor.putString("key_name", txt);
        editor.commit();

        Toast.makeText(getBaseContext(), "name saved",
                Toast.LENGTH_SHORT).show();


    }

    public void goShow1(View v){
        person_details = getApplicationContext().getSharedPreferences("person_details", MODE_PRIVATE);

        String reminder1 = "hey " + person_details.getString("key_name", null) + " you got this!";
        Toast.makeText(getBaseContext(), reminder1,
                Toast.LENGTH_LONG).show();

    }

    public void goShow2(View v){
        person_details = getApplicationContext().getSharedPreferences("person_details", MODE_PRIVATE);

        String reminder2 = "hey " + person_details.getString("key_name", null) + " you are loved!";
        Toast.makeText(getBaseContext(), reminder2,
                Toast.LENGTH_LONG).show();

    }

    public void goShow3(View v){
        person_details = getApplicationContext().getSharedPreferences("person_details", MODE_PRIVATE);

        String reminder3 = "hey " + person_details.getString("key_name", null) + " you are strong!";
        Toast.makeText(getBaseContext(), reminder3,
                Toast.LENGTH_LONG).show();

    }

    public void goShow4(View v){
        person_details = getApplicationContext().getSharedPreferences("person_details", MODE_PRIVATE);

        String reminder4 = "hey " + person_details.getString("key_name", null) + " you are not alone!";
        Toast.makeText(getBaseContext(), reminder4,
                Toast.LENGTH_LONG).show();

    }

    public void goShow5(View v){
        person_details = getApplicationContext().getSharedPreferences("person_details", MODE_PRIVATE);

        String reminder5 = "hey " + person_details.getString("key_name", null) + " everything will be okay.";
        Toast.makeText(getBaseContext(), reminder5,
                Toast.LENGTH_LONG).show();

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
            Intent i = new Intent(Reminder.this, Screen2.class);
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