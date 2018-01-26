package com.eatchicken.kaier;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class LaunchActivity extends AppCompatActivity {
    private TextView jumpText;
    private int endTime = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_launch);
        jumpText = (TextView) findViewById(R.id.text_jump_over);
        handler.postDelayed(runnable,1000);
    }

    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            endTime--;
            handler.postDelayed(this,1000);
            jumpText.setText(R.string.jump_over+endTime);
            if (endTime==0){
                Intent intent = new Intent(LaunchActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }else {
                jumpText.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(LaunchActivity.this,MainActivity.class);
                        startActivity(intent);
                        handler.removeCallbacks(runnable);
                        finish();
                    }
                });
            }
        }
    };
}
