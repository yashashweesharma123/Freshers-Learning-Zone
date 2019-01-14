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

public class CStartingScreenActivity extends AppCompatActivity {
    private static final int REQUEST_CODE_QUIZ2 = 1;

    public static final String SHARED_PREFS2 = "sharedPrefs2";
    public static final String KEY_HIGHSCORE2 = "keyHighscore2";

    private TextView textViewHighscore2;

    private int highscore2;
    Button buttonStartQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cstartingscreen);
        textViewHighscore2 = (TextView)findViewById(R.id.text_view_highscore2);
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
        Intent intent = new Intent(CStartingScreenActivity.this, CQuizActivity.class);
        startActivityForResult(intent, REQUEST_CODE_QUIZ2);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE_QUIZ2) {
            if (resultCode == RESULT_OK) {
                int score = data.getIntExtra(CQuizActivity.EXTRA_SCORE2, 0);
                if (score > highscore2) {
                    updateHighscore(score);
                }
            }
        }
    }

    private void loadHighscore() {
        SharedPreferences prefs = getSharedPreferences(SHARED_PREFS2, MODE_PRIVATE);
        highscore2 = prefs.getInt(KEY_HIGHSCORE2, 0);
        textViewHighscore2.setText("Highscore: " + highscore2);
    }

    private void updateHighscore(int highscoreNew) {
        highscore2 = highscoreNew;
        textViewHighscore2.setText("Highscore: " + highscore2);

        SharedPreferences prefs = getSharedPreferences(SHARED_PREFS2, MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(KEY_HIGHSCORE2, highscore2);
        editor.apply();
    }
}


