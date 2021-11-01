package com.example.samvel_homework_lesson_9;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class ThirdActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private AppCompatButton button;

    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_2_1);

        progressBar = findViewById(R.id.progressBar);
        button = findViewById(R.id.hide_button);
        if(button != null){
            button.setOnClickListener(t->{
                if(progressBar != null){
                    progressBar.setVisibility(View.GONE);
                }
            });
        }
    }


}
