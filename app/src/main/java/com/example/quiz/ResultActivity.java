package com.example.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {

    private String themeType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Button backQuizButton = findViewById(R.id.backQuizButton);

        Intent intent = getIntent();
        themeType = intent.getStringExtra("themeType");
        ArrayList<Integer> randomQuestionIndexes = intent.getIntegerArrayListExtra("randomQuestionIndexes");

        LinearLayout resultLayout = findViewById(R.id.resultLayout);

        String[] questions = QuizData.getQuestionsSubset(randomQuestionIndexes, themeType);
        String[][] options = QuizData.getOptionsSubset(randomQuestionIndexes, themeType);
        int[] correctAnswers = QuizData.getCorrectAnswersSubset(randomQuestionIndexes, themeType);
        int[] selectedAnswers = intent.getIntArrayExtra("selectedAnswers");

        int correctAnswersCount = 0;


        for (int i = 0; i < questions.length; i++) {

            TextView questionTextView = new TextView(this);
            questionTextView.setText("Вопрос " + (i + 1) + ": " + questions[i]);



            TextView selectedAnswerTextView = new TextView(this);
            if (selectedAnswers[i] != -1 && selectedAnswers[i] == correctAnswers[i]) {
                selectedAnswerTextView.setText("Ваш ответ: " + options[i][selectedAnswers[i]]);
                correctAnswersCount++;
                questionTextView.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_green_light));
            } else if (selectedAnswers[i] == -1){
                selectedAnswerTextView.setText("Вы не выбрали ответ");
                questionTextView.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_red_light));
            } else {
                selectedAnswerTextView.setText("Ваш ответ: " + options[i][selectedAnswers[i]]);
                questionTextView.setBackgroundColor(ContextCompat.getColor(this, android.R.color.holo_red_light));
            }

            resultLayout.addView(questionTextView);
            resultLayout.addView(selectedAnswerTextView);

            TextView correctAnswersCountTextView = findViewById(R.id.correctAnswersCountTextView);
            correctAnswersCountTextView.setText("Правильных ответов: " + correctAnswersCount + " из " + selectedAnswers.length);


            TextView correctAnswerTextView = new TextView(this);
            correctAnswerTextView.setText("Правильный ответ: " + options[i][correctAnswers[i]]);
            resultLayout.addView(correctAnswerTextView);


            View separator = new View(this);
            separator.setBackgroundColor(ContextCompat.getColor(this, android.R.color.darker_gray));
            separator.setLayoutParams(new LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, 2
            ));
            resultLayout.addView(separator);
        }

        backQuizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backQuiz();
            }
        });
    }

    private TextView createTextView(String format, Object... args) {
        TextView textView = new TextView(this);
        textView.setText(String.format(format, args));
        return textView;
    }

    private View createSeparator() {
        View separator = new View(this);
        separator.setBackgroundColor(ContextCompat.getColor(this, android.R.color.darker_gray));
        separator.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, 2
        ));
        return separator;
    }

    private void backQuiz() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
