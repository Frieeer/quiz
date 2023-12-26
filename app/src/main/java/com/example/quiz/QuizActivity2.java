package com.example.quiz;

import static com.example.quiz.QuizData.options_space;

import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class QuizActivity2 extends AppCompatActivity {

    private TextView questionTextView;
    private RadioGroup optionsRadioGroup;
    private Button nextButton;

    private int currentQuestionIndex = 0;
    private int correctAnswersCount = 0;

    private List<Integer> randomQuestionIndexes;

    private int[] selectedAnswers = new int[5];


    private String themeType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

        Button backQuizButton = findViewById(R.id.backQuizButton);

        questionTextView = findViewById(R.id.questionTextView);
        optionsRadioGroup = findViewById(R.id.optionsRadioGroup);
        nextButton = findViewById(R.id.nextButton);


        themeType = "geo";

        randomQuestionIndexes = QuizData.getRandomQuestionsIndexes(5, themeType);
        showQuestion();

        backQuizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backQuiz();
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer();
                currentQuestionIndex++;
                if (currentQuestionIndex < randomQuestionIndexes.size()) {
                    showQuestion();
                } else {
                    showResult();
                }
            }
        });
    }

    private void showQuestion() {
        int currentQuestion = randomQuestionIndexes.get(currentQuestionIndex);
        int questionNumber = currentQuestionIndex + 1;

        String questionNumberText = "Вопрос " + questionNumber + " из " + selectedAnswers.length;
        TextView questionNumberTextView = findViewById(R.id.questionNumberTextView);
        questionNumberTextView.setText(questionNumberText);

        questionTextView.setText(QuizData.getQuestionsSubset(randomQuestionIndexes, themeType)[currentQuestionIndex]);
        optionsRadioGroup.removeAllViews();
        for (int i = 0; i < QuizData.getOptionsSubset(randomQuestionIndexes, themeType)[currentQuestionIndex].length; i++) {
            RadioButton radioButton = new RadioButton(this);
            radioButton.setText(QuizData.getOptionsSubset(randomQuestionIndexes, themeType)[currentQuestionIndex][i]);
            radioButton.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
            optionsRadioGroup.addView(radioButton);
        }
    }

    private void checkAnswer() {
        int selectedOptionIndex = optionsRadioGroup.indexOfChild(
                findViewById(optionsRadioGroup.getCheckedRadioButtonId()));
        int currentQuestion = randomQuestionIndexes.get(currentQuestionIndex);
        if (selectedOptionIndex == QuizData.getCorrectAnswersSubset(randomQuestionIndexes, themeType)[currentQuestionIndex]) {
            correctAnswersCount++;
        }
        selectedAnswers[currentQuestionIndex] = selectedOptionIndex;
    }

    private void showResult() {
        Toast.makeText(this, "Правильных ответов: " + correctAnswersCount + " из " + selectedAnswers.length, Toast.LENGTH_LONG).show();
        Intent intent = new Intent(QuizActivity2.this, ResultActivity.class);
        intent.putExtra("questions", QuizData.getQuestionsSubset(randomQuestionIndexes, "geo"));
        intent.putExtra("selectedAnswers", selectedAnswers);
        intent.putExtra("correctAnswers", QuizData.getCorrectAnswersSubset(randomQuestionIndexes, "geo"));
        intent.putExtra("options", QuizData.options_geo);
        intent.putExtra("themeType", themeType);

        ArrayList<Integer> randomIndexesList = new ArrayList<>(randomQuestionIndexes);
        intent.putIntegerArrayListExtra("randomQuestionIndexes", randomIndexesList);

        startActivity(intent);
    }

    private void backQuiz() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
