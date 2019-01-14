package com.example.shubham.myapplication;

/**
 * Created by shubham on 19-Nov-18.
 */

import android.provider.BaseColumns;

public final class CQuizContract {

    private CQuizContract() {
    }

    public static class QuestionsTable implements BaseColumns {
        public static final String TABLE_NAME2 = "quiz_questions2";
        public static final String COLUMN_QUESTION = "question";
        public static final String COLUMN_OPTION1 = "option1";
        public static final String COLUMN_OPTION2 = "option2";
        public static final String COLUMN_OPTION3 = "option3";
        public static final String COLUMN_ANSWER_NR = "answer_nr";
    }
}
