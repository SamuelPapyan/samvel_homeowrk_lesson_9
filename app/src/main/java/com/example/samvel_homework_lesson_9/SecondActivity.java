package com.example.samvel_homework_lesson_9;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

public class SecondActivity extends AppCompatActivity {
    private AppCompatTextView text_view_output;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_1_2);

        text_view_output = findViewById(R.id.text_view_output);
        if(text_view_output != null){
            Intent intent = getIntent();

            intent.getExtras();
            String my_text = intent.getStringExtra("my_text");
            if(my_text != null){
                text_view_output.setText(my_text);
            }
        }
    }
}
