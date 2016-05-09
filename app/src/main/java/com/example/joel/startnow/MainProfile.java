package com.example.joel.startnow;

import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import org.w3c.dom.Text;

public class MainProfile extends AppCompatActivity {

    private TextView yourGoal;
    private ImageView exampleActivity;
    private TextView activity;
    private TextView goalNum;
    private VideoView vid;
    private TextView likes;
    private Integer userActivity = 1;
    private Integer userReps;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_profile);

        findViews();
        personalizeViews();
    }

    public void findViews() {
        yourGoal = (TextView) findViewById(R.id.mainTextView);
        exampleActivity = (ImageView) findViewById(R.id.exampleImage);
        activity = (TextView) findViewById(R.id.activityText);
        goalNum = (TextView) findViewById(R.id.goalNumber);
        vid = (VideoView) findViewById(R.id.videoView);
        likes = (TextView) findViewById(R.id.numLikes);
    }

    public void personalizeViews() {
        final String[] activityStrings = ["sit ups", "push ups", "squats", "planks", "jumping jacks"];
        activity.setText(activityStrings[userActivity]);
        goalNum.setText(String.valueOf(userReps));
    }

}
