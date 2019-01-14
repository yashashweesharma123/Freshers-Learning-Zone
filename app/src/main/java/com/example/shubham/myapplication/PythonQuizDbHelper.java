package com.example.shubham.myapplication;

/**
 * Created by shubham on 17-Nov-18.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.shubham.myapplication.PythonQuizContract.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class PythonQuizDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "MyAwesomeQuiz.db";
    private static final int DATABASE_VERSION = 1;

    private SQLiteDatabase db;

    public PythonQuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionsTable.TABLE_NAME + " ( " +
                QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuestionsTable.TABLE_NAME);
        onCreate(db);
    }

    private void fillQuestionsTable() {
        PythonQuestions q1 = new PythonQuestions("Is Python case sensitive when dealing with identifiers?", "yes", "no", "machine dependent", 1);
        addQuestion(q1);
        PythonQuestions q2 = new PythonQuestions("What is the maximum possible length of an identifier?", "31 characters", "63 characters", "none of the mentioned", 3);
        addQuestion(q2);
        PythonQuestions q3 = new PythonQuestions(" Which of the following is invalid?", "_a = 1", " __a = 1", "none of the mentioned", 3);
        addQuestion(q3);
        PythonQuestions q4 = new PythonQuestions("Which of the following is an invalid variable?", "my_string_1", "1st_string", "foo", 2);
        addQuestion(q4);
        PythonQuestions q5 = new PythonQuestions(" Which of the following is not a keyword?", "eval", "assert", "nonlocal", 1);
        addQuestion(q5);
        PythonQuestions q6 = new PythonQuestions(" Which of the following is true for variable names in Python?", "unlimited length", "all private members must have leading and trailing underscores", "underscore and ampersand are the only two special characters allowed", 1);
        addQuestion(q6);
        PythonQuestions q7 = new PythonQuestions(" Which of the following is an invalid statement?", "abc = 1,000,000", "a b c = 1000 2000 3000", "a,b,c = 1000, 2000, 3000", 2);
        addQuestion(q7);
        PythonQuestions q8 = new PythonQuestions(" Which of the following cannot be a variable?", " __init__", "in", "it", 2);
        addQuestion(q8);
        PythonQuestions q9 = new PythonQuestions(" The value of the expressions 4/(3*(2-1)) and 4/3*(2-1) is the same. State whether true or false.", "true", "false", "both", 1);
        addQuestion(q9);
        PythonQuestions q10 = new PythonQuestions("  The value of the expression:\n" +
                "\n" +
                "4 + 3 % 5", "4", "7", "2", 2);
        addQuestion(q10);
        PythonQuestions q11 = new PythonQuestions(" Evaluate the expression given below if A= 16 and B = 15.\n" +
                "\n" +
                "A % B // A", " 0.0", "0", "1.0", 2);
        addQuestion(q11);
        PythonQuestions q12 = new PythonQuestions(" What is the value of x if:\n" +
                "\n" +
                "x = int(43.55+2/2)", "43", "44", "42", 2);
        addQuestion(q12);
        PythonQuestions q13 = new PythonQuestions(" What is the value of the following expression?\n" +
                "\n" +
                "2+4.00, 2**4.0", "(6.0, 16.0)", "(6.00, 16.00)", "(6, 16)", 1);
        addQuestion(q13);
        PythonQuestions q14 = new PythonQuestions(" Which of the following matrices will throw an error in Python?", "A = [[1, 2, 3],\n" +
                "        [4, 5, 6],\n" +
                "        [7, 8, 9]]", "B = [[3, 3, 3]\n" +
                "        [4, 4, 4]\n" +
                "        [5, 5, 5]]", "C = [(1, 2, 4),\n" +
                "        (5, 6, 7),\n" +
                "        (8, 9, 10)]", 2);
        addQuestion(q14);
        PythonQuestions q15 = new PythonQuestions(" What is the output of the code shown?\n" +
                "\n" +
                "l=list('HELLO')\n" +
                "'first={0[0]}, third={0[2]}'.format(l)", "‘first=H, third=L’", "‘first=0, third=2’", "Error",1 );
        addQuestion(q15);
        PythonQuestions q16 = new PythonQuestions(" Which of these definitions correctly describes a module?", "Denoted by triple quotes for providing the specification of certain program elements", "Design and implementation of specific functionality to be incorporated into a program", "Defines the specification of how it is to be used", 2);
        addQuestion(q16);
        PythonQuestions q17 = new PythonQuestions("What is the output of the following piece of code?\n" +
                "\n" +
                "#mod1\n" +
                "def change(a):\n" +
                "    b=[x*2 for x in a]\n" +
                "    print(b)\n" +
                "#mod2\n" +
                "def change(a):\n" +
                "    b=[x*x for x in a]\n" +
                "    print(b)\n" +
                "from mod1 import change\n" +
                "from mod2 import change\n" +
                "#main\n" +
                "s=[1,2,3]\n" +
                "change(s)", "[2,4,6].", "[1,4,9].", "There is a name clash", 3);
        addQuestion(q17);
        PythonQuestions q18 = new PythonQuestions(" What is the output of the code shown below?\n" +
                "\n" +
                "def san(x):\n" +
                "    print(x+1)\n" +
                "x=-2\n" +
                "x=4\n" +
                "san(12) ", "13", "10", "2", 1);
        addQuestion(q18);
        PythonQuestions q19 = new PythonQuestions(" The snippet of code shown below results in an error. State whether true or false.\n" +
                "\n" +
                "c=re.compile(r'(\\d+)(\\[A-Z]+)([a-z]+)')\n" +
                "c.groupindex", "true", "false", "both", 2);
        addQuestion(q19);
        PythonQuestions q20 = new PythonQuestions("What is the output of the code shown below?\n" +
                "\n" +
                "a = re.compile('0-9')\n" +
                "a.findall('3 trees')", "[]", "[‘3’]", "Error", 3);
        addQuestion(q20);
    }

    private void addQuestion(PythonQuestions question) {
        ContentValues cv = new ContentValues();
        cv.put(QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuestionsTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        db.insert(QuestionsTable.TABLE_NAME, null, cv);
    }
    public ArrayList<PythonQuestions> getAllQuestions() {
        ArrayList<PythonQuestions> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME, null);

        if (c.moveToFirst()) {
            do {
                PythonQuestions question = new PythonQuestions();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NR)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }
}

