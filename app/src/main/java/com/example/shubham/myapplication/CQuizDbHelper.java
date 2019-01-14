package com.example.shubham.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by shubham on 19-Nov-18.
 */

public class CQuizDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "MyAwesomeQuiz2.db";
    private static final int DATABASE_VERSION = 1;

    private SQLiteDatabase db2;

    public CQuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db2) {
        this.db2 = db2;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                CQuizContract.QuestionsTable.TABLE_NAME2 + " ( " +
                CQuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                CQuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                CQuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                CQuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                CQuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                CQuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";

        db2.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + CQuizContract.QuestionsTable.TABLE_NAME2);
        onCreate(db2);
    }
    private void fillQuestionsTable() {
        CQuestions q1 = new CQuestions("#include <stdio.h>\n" +
                "    int *m();\n" +
                "    void main()\n" +
                "    {\n" +
                "        int k = m();\n" +
                "        printf(\"%d\", k);\n" +
                "    }\n" +
                "    int *m()\n" +
                "    {\n" +
                "        int a[2] = {5, 8};\n" +
                "        return a;\n" +
                "    }"
       ,"Varies", "5 ", "8",1 );
        addQuestion(q1);
        CQuestions q2 = new CQuestions("#include <stdio.h>\n" +
                "    void m(int k)\n" +
                "    {\n" +
                "        printf(\"hi\");\n" +
                "    }\n" +
                "    void m(double k)\n" +
                "    {\n" +
                "        printf(\"hello\");\n" +
                "    }\n" +
                "    void main()\n" +
                "    {\n" +
                "        m(3);\n" +
                "    }", " Compile time error", "hello", "hi", 1);
        addQuestion(q2);
        CQuestions q3 = new CQuestions("What is the default return type if it is not specified in function definition?", "void", "int", "double", 2);
        addQuestion(q3);
        CQuestions q4 = new CQuestions("#include <stdio.h>\n" +
                "    int foo();\n" +
                "    int main()\n" +
                "    {\n" +
                "        int i = foo();\n" +
                "    }\n" +
                "    foo()\n" +
                "    {\n" +
                "        printf(\"2 \");\n" +
                "        return 2;\n" +
                "    }", " 2", "Compile time error", "Depends on the compiler", 1);
        addQuestion(q4);
        CQuestions q5 = new CQuestions("What will be the output of the following C code?\n" +
                "\n" +
                "    #include <stdio.h>\n" +
                "    double foo();\n" +
                "    int main()\n" +
                "    {\n" +
                "        foo();\n" +
                "        return 0;\n" +
                "    }\n" +
                "    foo()\n" +
                "    {\n" +
                "        printf(\"2 \");\n" +
                "        return 2;\n" +
                "    }", " 2", "Compile time error", "Depends on the compiler", 2);
        addQuestion(q5);
        CQuestions q6 = new CQuestions(" Functions can return structure in C?", "True", "False", "Depends on the compiler", 1);
        addQuestion(q6);
        CQuestions q7 = new CQuestions(" Functions can return enumeration constants in C?", " true", "false", "depends on the compiler", 1);
        addQuestion(q7);
        CQuestions q8 = new CQuestions(" What will be the output of the following C code?\n" +
                "\n" +
                "    #include <stdio.h>\n" +
                "    enum m{JAN, FEB, MAR};\n" +
                "    enum m foo();\n" +
                "    int main()\n" +
                "    {\n" +
                "        enum m i = foo();\n" +
                "        printf(\"%d\\n\", i);\n" +
                "    }\n" +
                "    int  foo()\n" +
                "    {\n" +
                "        return JAN;\n" +
                "    }", "Compile time error", "0", "Depends on the compiler", 1);
        addQuestion(q8);
        CQuestions q9 = new CQuestions("#include <stdio.h>\n" +
                "    void main()\n" +
                "    {\n" +
                "        m();\n" +
                "        printf(\"%d\", x);\n" +
                "    }\n" +
                "    int x;\n" +
                "    void m()\n" +
                "    {\n" +
                "        x = 4;\n" +
                "    }", "4", "Compile time error", " 0", 2);
        addQuestion(q9);
        CQuestions q10 = new CQuestions(" What will be the output of the following C code?\n" +
                "\n" +
                "    #include <stdio.h>\n" +
                "    int x;\n" +
                "    void main()\n" +
                "    {\n" +
                "        printf(\"%d\", x);\n" +
                "    }", "Junk value", "Run time error", "0", 3);
        addQuestion(q10);
        CQuestions q11 = new CQuestions("What will be the output of the following C code?\n" +
                "\n" +
                "    #include <stdio.h>\n" +
                "    int x = 5;\n" +
                "    void main()\n" +
                "    {\n" +
                "        int x = 3;\n" +
                "        printf(\"%d\", x);\n" +
                "        {\n" +
                "            x = 4;\n" +
                "        }\n" +
                "        printf(\"%d\", x);\n" +
                "    }", "3 4", "Run time error", "3 3", 1);
        addQuestion(q11);
        CQuestions q12 = new CQuestions("What will be the output of the following C code?\n" +
                "\n" +
                "    #include <stdio.h>\n" +
                "    int x = 5;\n" +
                "    void main()\n" +
                "    {\n" +
                "        int x = 3;\n" +
                "        printf(\"%d\", x);\n" +
                "        {\n" +
                "            int x = 4;\n" +
                "        }\n" +
                "        printf(\"%d\", x);\n" +
                "    }", "3 3", "3 4 ", "3 5", 1);
        addQuestion(q12);
        CQuestions q13 = new CQuestions("Functions in C are always _________", "Internal", "External", "Both Internal and External", 2);
        addQuestion(q13);
        CQuestions q14 = new CQuestions("Global variables are ____________", "Internal", "External", " Both Internal and External", 2);
        addQuestion(q14);
        CQuestions q15 = new CQuestions("What will be the output of the following C code?\n" +
                "\n" +
                "     #include <stdio.h>\n" +
                "    int main()\n" +
                "    {\n" +
                "        printf(\"%d\", d++);\n" +
                "    }\n" +
                "    int d = 10;", "compile time error", "9", "10", 1);
        addQuestion(q15);
        CQuestions q16 = new CQuestions("What will be the output of the following C code?\n" +
                "\n" +
                "    #include <stdio.h>\n" +
                "    double var = 8;\n" +
                "    int main()\n" +
                "    {\n" +
                "        int var = 5;\n" +
                "        printf(\"%d\", var);\n" +
                "    }", " 5", " 8", "Compile time error due to wrong format identifier for double", 1);
        addQuestion(q16);
        CQuestions q17 = new CQuestions(" Which of the following is an external variable in the following C code?\n" +
                "\n" +
                "    #include <stdio.h>\n" +
                "    int func (int a)\n" +
                "    {\n" +
                "        int b;\n" +
                "        return b;\n" +
                "    }\n" +
                "    int main()\n" +
                "    {\n" +
                "        int c;\n" +
                "        func (c);\n" +
                "    }\n" +
                "    int d;", "d", "a", "b", 1);
        addQuestion(q17);
        CQuestions q18 = new CQuestions(" Array sizes are optional during array declaration by using ______ keyword.", "auto", "static", "extern", 3);
        addQuestion(q18);
        CQuestions q19 = new CQuestions(" #include <stdio.h>\n" +
                "    void main()\n" +
                "    {\n" +
                "        int x = 3;\n" +
                "        {\n" +
                "            x = 4;\n" +
                "            printf(\"%d\", x);\n" +
                "        }\n" +
                "    }", "4", "3", "0", 1);
        addQuestion(q19);
        CQuestions q20 = new CQuestions("#include <stdio.h>\n" +
                "    int x = 5;\n" +
                "    void main()\n" +
                "    {\n" +
                "        int x = 3;\n" +
                "        m();\n" +
                "        printf(\"%d\", x);\n" +
                "    }\n" +
                "    void m()\n" +
                "    {\n" +
                "        x = 8;\n" +
                "        n();\n" +
                "    }\n" +
                "    void n()\n" +
                "    {\n" +
                "        printf(\"%d\", x);\n" +
                "    }", "8 3", "3 8", " 8 5", 1);
        addQuestion(q20);



    }
    private void addQuestion(CQuestions question) {
        ContentValues cv = new ContentValues();
        cv.put(CQuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(CQuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(CQuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(CQuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3());
        cv.put(CQuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        db2.insert(CQuizContract.QuestionsTable.TABLE_NAME2, null, cv);
    }
    public ArrayList<CQuestions> getAllQuestions() {
        ArrayList<CQuestions> questionList = new ArrayList<>();
        db2 = getReadableDatabase();
        Cursor c = db2.rawQuery("SELECT * FROM " + CQuizContract.QuestionsTable.TABLE_NAME2, null);

        if (c.moveToFirst()) {
            do {CQuestions question = new CQuestions();
                question.setQuestion(c.getString(c.getColumnIndex(CQuizContract.QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(CQuizContract.QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(CQuizContract.QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(CQuizContract.QuestionsTable.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(CQuizContract.QuestionsTable.COLUMN_ANSWER_NR)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }
}
