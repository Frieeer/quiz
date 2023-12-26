package com.example.quiz;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startQuizButton = findViewById(R.id.startQuizButton);
        Button startQuizButton2 = findViewById(R.id.startQuizButton2);
        Button startRandomQuizButton = findViewById(R.id.startRandomQuizButton);

        startQuizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startQuiz();
            }
        });

        startQuizButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startQuiz2();
            }
        });

        startRandomQuizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startRandomQuiz();
            }
        });


    }

    private void startQuiz() {
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
        finish();
    }

    private void startQuiz2() {
        Intent intent = new Intent(this, QuizActivity2.class);
        startActivity(intent);
        finish();
    }

    private void startRandomQuiz() {
        Intent intent = new Intent(this, RandomQuizActivity.class);
        startActivity(intent);
        finish();
    }

}