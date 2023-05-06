package com.busenazkose.childapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.busenazkose.childapp.databinding.ActivityMainBinding;

public class page1 extends AppCompatActivity {

    private Button learningButton;
    private Button playButton;
    private Button logoutButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);

        learningButton = findViewById(R.id.learnButtonClicked);
        playButton = findViewById(R.id.playButtonClicked);
        logoutButton = findViewById(R.id.logoutButtonClicked);

        learningButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openLearningActivity();
            }
        });

        playButton.setOnClickListener(new View.OnClickListener(){
           @Override
            public void onClick(View v){
               openPlayingActivities();
           }
        });

        logoutButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                turnMainActivity();
            }
        });

    }

    public void openLearningActivity(){
        Intent intent = new Intent(page1.this, LearningActivities.class);
        startActivity(intent);
        finish();
    }
    public void openPlayingActivities(){
        Intent intent = new Intent(page1.this,PlayingActivities.class);
        startActivity(intent);
        finish();

    }

    public void turnMainActivity(){
        Intent intent = new Intent(page1.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

}
