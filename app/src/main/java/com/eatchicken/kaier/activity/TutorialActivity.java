package com.eatchicken.kaier.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import com.eatchicken.kaier.R;

import java.util.Timer;
import java.util.TimerTask;

public class TutorialActivity extends AppCompatActivity {
    private static final int END_TIME = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_launch);
        toHomeActivity();
    }

    private void toHomeActivity() {
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(TutorialActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();
            }
        };
        timer.schedule(timerTask,END_TIME);
    }
}
