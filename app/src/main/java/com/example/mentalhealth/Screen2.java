package com.example.mentalhealth;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;


public class Screen2 extends ListActivity {



    private static final String[] myTabs = {
            "Info",
            "Survey",
            "Diary",
            "Sounds",
            "Videos",
            "Reminder"
    };

    private static final String[] myLabels = {
            "basic information",
            "a survey about mental health",
            "little diary",
            "relaxing sounds",
            "short film",
            "daily reminders"
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        setListAdapter(new MyOwnAdapter());


    }

    class MyOwnAdapter extends ArrayAdapter<String> {
        MyOwnAdapter() {
            super(Screen2.this, R.layout.my_row, R.id.label, myLabels);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View row=super.getView(position, convertView, parent);
            ImageView icon=(ImageView)row.findViewById(R.id.icon);


            if (myTabs[position]== "Info")
                icon.setImageResource(R.drawable.infoicon);
            if (myTabs[position]== "Survey")
                icon.setImageResource(R.drawable.surveyicon);
            if (myTabs[position]== "Diary")
                icon.setImageResource(R.drawable.diaryicon);
            if (myTabs[position]== "Sounds")
                icon.setImageResource(R.drawable.soundsicon);
            if (myTabs[position]== "Videos")
                icon.setImageResource(R.drawable.videoicon);
            if (myTabs[position]== "Reminder")
                icon.setImageResource(R.drawable.remindericon);



            return(row);
        }
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {


        try {
            Class myClass = Class.forName("com.example.mentalhealth." + myTabs[position]);
            Intent i = new Intent(Screen2.this, myClass);
            startActivity(i);
        }
        catch
        (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.transition.slide_in_left,R.transition.slide_out_right);
    }

}
