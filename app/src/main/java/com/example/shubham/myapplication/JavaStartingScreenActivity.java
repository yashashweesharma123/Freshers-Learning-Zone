package com.example.shubham.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by shubham on 17-Nov-18.
 */

public class JavaStartingScreenActivity extends AppCompatActivity {

        private static final int REQUEST_CODE_QUIZ1 = 1;

        public static final String SHARED_PREFS1 = "sharedPrefs1";
        public static final String KEY_HIGHSCORE1 = "keyHighscore1";

        private TextView textViewHighscore1;

        private int highscore1;
        Button buttonStartQuiz;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.javastartingscreen);
        textViewHighscore1 = (TextView)findViewById(R.id.text_view_highscore1);
        loadHighscore();
        buttonStartQuiz=(Button)findViewById(R.id.button_start_quiz);

        //Button buttonStartQuiz = findViewById(R.id.button_start_quiz);
        buttonStartQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startQuiz();
            }
        });
    }

    private void startQuiz() {
        Intent intent = new Intent(JavaStartingScreenActivity.this, JavaQuizActivity.class);
        startActivityForResult(intent, REQUEST_CODE_QUIZ1);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE_QUIZ1) {
            if (resultCode == RESULT_OK) {
                int score = data.getIntExtra(JavaQuizActivity.EXTRA_SCORE1, 0);
                if (score > highscore1) {
                    updateHighscore(score);
                }
            }
        }
    }

    private void loadHighscore() {
        SharedPreferences prefs = getSharedPreferences(SHARED_PREFS1, MODE_PRIVATE);
        highscore1 = prefs.getInt(KEY_HIGHSCORE1, 0);
        textViewHighscore1.setText("Highscore: " + highscore1);
    }

    private void updateHighscore(int highscoreNew) {
        highscore1 = highscoreNew;
        textViewHighscore1.setText("Highscore: " + highscore1);

        SharedPreferences prefs = getSharedPreferences(SHARED_PREFS1, MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(KEY_HIGHSCORE1, highscore1);
        editor.apply();
    }
}

