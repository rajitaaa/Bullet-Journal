package com.example.rajita.bullet_journal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Button logs,todo,deadline,habit,bday,trips,lib,other,speech;

        logs = (Button) findViewById(R.id.button);
        todo = (Button) findViewById(R.id.button2);
        deadline = (Button) findViewById(R.id.button3);
        habit = (Button) findViewById(R.id.button4);
        bday = (Button) findViewById(R.id.button5);
        trips = (Button) findViewById(R.id.button6);
        lib = (Button) findViewById(R.id.button7);
        other = (Button) findViewById(R.id.button8);
        speech = (Button) findViewById(R.id.button9);

        logs.setOnClickListener(new View.OnClickListener() {    //FOR NEW LOGS
            public void onClick(View arg0) {

                Intent myIntent = new Intent(HomePage.this,
                        NewLogs.class);
                startActivity(myIntent);
            }
            });

        todo.setOnClickListener(new View.OnClickListener() {      //FOR TO-TO LISTS
            public void onClick(View arg0) {

                Intent myIntent = new Intent(HomePage.this,
                        Todo.class);
                startActivity(myIntent);
            }
        });

        deadline.setOnClickListener(new View.OnClickListener() {      //FOR DEADLINES
            public void onClick(View arg0) {

                Intent myIntent = new Intent(HomePage.this,
                       Deadlines.class);
                startActivity(myIntent);
            }
        });


        habit.setOnClickListener(new View.OnClickListener() {      //FOR HABIT TRACKER
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(HomePage.this,
                        HabitTracker.class);
                startActivity(myIntent);
            }
        });

        bday.setOnClickListener(new View.OnClickListener() {      //FOR BIRTHDAYS
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(HomePage.this,
                        Birthday.class);
                startActivity(myIntent);
            }
        });

        trips.setOnClickListener(new View.OnClickListener() {      //FOR BIRTHDAYS
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(HomePage.this,
                        Trips.class);
                startActivity(myIntent);
            }
        });

        lib.setOnClickListener(new View.OnClickListener() {      //FOR BIRTHDAYS
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(HomePage.this,
                        Library.class);
                startActivity(myIntent);
            }
        });

        other.setOnClickListener(new View.OnClickListener() {      //FOR BIRTHDAYS
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(HomePage.this,
                        OtherEntry.class);
                startActivity(myIntent);
            }
        });

        speech.setOnClickListener(new View.OnClickListener() {      //FOR BIRTHDAYS
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(HomePage.this,
                        SpeechToText.class);
                startActivity(myIntent);
            }
        });


    }
}


