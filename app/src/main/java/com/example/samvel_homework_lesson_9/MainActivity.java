package com.example.samvel_homework_lesson_9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private AppCompatEditText editText;
    private AppCompatButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_1_1);

        editText = findViewById(R.id.my_edit_text);
        button = findViewById(R.id.my_button);

        if(button != null){
            button.setOnClickListener(v->{
                Intent intent = new Intent(
                        this,
                        SecondActivity.class
                );
                if(editText != null) {
                    intent.putExtra("my_text", editText.getText());
                    startActivity(intent);
                }
            });
        }
    }
}