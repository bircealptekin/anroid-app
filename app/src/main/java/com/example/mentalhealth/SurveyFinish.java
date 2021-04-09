package com.example.mentalhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SurveyFinish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_finish);
    }

    public void goToList(View view)
    {
        Intent i = new Intent(SurveyFinish.this, Screen2.class);
        startActivity(i);
        overridePendingTransition(R.transition.slide_in_left, R.transition.slide_out_right);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.transition.slide_in_left,R.transition.slide_out_right);
    }
}