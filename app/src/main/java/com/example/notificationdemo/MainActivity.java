package com.example.notificationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvScore = findViewById(R.id.tv_score);
        if(getIntent()!=null && getIntent().hasExtra("score")){
            for(String key : getIntent().getExtras().keySet()){
                tvScore.append(getIntent().getExtras().getString(key)+"\n");
            }
        }
    }
}
