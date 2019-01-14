package com.example.shubham.myapplication;

/**
 * Created by shubham on 17-Nov-18.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;


public class JavaQuizDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "MyAwesomeQuiz1.db";
    private static final int DATABASE_VERSION = 1;

    private SQLiteDatabase db1;

    public JavaQuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db1) {
        this.db1 = db1;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                JavaQuizContract.QuestionsTable.TABLE_NAME1 + " ( " +
                JavaQuizContract.QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                JavaQuizContract.QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                JavaQuizContract.QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                JavaQuizContract.QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                JavaQuizContract.QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                JavaQuizContract.QuestionsTable.COLUMN_ANSWER_NR + " INTEGER" +
                ")";

        db1.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + JavaQuizContract.QuestionsTable.TABLE_NAME1);
        onCreate(db1);
    }
    private void fillQuestionsTable() {
        JavaQuestions q1 = new JavaQuestions("What is Recursion in Java?", "Recursion is a class", " Recursion is a process of defining a method that calls other methods repeatedly", "Recursion is a process of defining a method that calls itself repeatedly", 2);
        addQuestion(q1);
        JavaQuestions q2 = new JavaQuestions("Which of these data types is used by operating system to manage the Recursion in Java?", "Array", "Stack", "Queue", 2);
        addQuestion(q2);
        JavaQuestions q3 = new JavaQuestions("Which of these will happen if recursive method does not have a base case?", "An infinite loop occurs", "System stops the program after some time", "After 1000000 calls it will be automatically stopped", 1);
        addQuestion(q3);
        JavaQuestions q4 = new JavaQuestions("Which of these is not a correct statement?", "Recursion is managed by Java Runtime environment", "A recursive method must have a base case", "Recursion always uses stack", 1);
        addQuestion(q4);
        JavaQuestions q5 = new JavaQuestions("Which of these packages contains the exception Stack Overflow in Java?", "java.lang", "java.util", "java.io", 1);
        addQuestion(q5);
        JavaQuestions q6 = new JavaQuestions("class recursion \n" +
                "    {\n" +
                "        int func (int n) \n" +
                "        {\n" +
                "            int result;\n" +
                "            result = func (n - 1);\n" +
                "            return result;\n" +
                "        }\n" +
                "    } \n" +
                "    class Output \n" +
                "    {\n" +
                "        public static void main(String args[]) \n" +
                "        {\n" +
                "            recursion obj = new recursion() ;\n" +
                "            System.out.print(obj.func(12));\n" +
                "        }\n" +
                "    }", "Runtime Error", "0", "1", 1);
        addQuestion(q6);
        JavaQuestions q7 = new JavaQuestions("class recursion \n" +
                "    {\n" +
                "        int func (int n) \n" +
                "        {\n" +
                "            int result;\n" +
                "            if (n == 1)\n" +
                "                return 1;\n" +
                "            result = func (n - 1);\n" +
                "            return result;\n" +
                "        }\n" +
                "    } \n" +
                "    class Output \n" +
                "    {\n" +
                "        public static void main(String args[]) \n" +
                "        {\n" +
                "            recursion obj = new recursion() ;\n" +
                "            System.out.print(obj.func(5));\n" +
                "        }\n" +
                "    }", "0", "1", "120", 2);
        addQuestion(q7);
        JavaQuestions q8 = new JavaQuestions("What is the output of this program?\n" +
                "\n" +
                "    class recursion \n" +
                "    {\n" +
                "        int fact(int n) \n" +
                "        {\n" +
                "            int result;\n" +
                "            if (n == 1)\n" +
                "                return 1;\n" +
                "            result = fact(n - 1) * n;\n" +
                "            return result;\n" +
                "        }\n" +
                "    } \n" +
                "    class Output \n" +
                "    {\n" +
                "        public static void main(String args[]) \n" +
                "        {\n" +
                "            recursion obj = new recursion() ;\n" +
                "            System.out.print(obj.fact(5));\n" +
                "        }\n" +
                "    }", "24", "30", "120", 3);
        addQuestion(q8);
        JavaQuestions q9 = new JavaQuestions("class recursion \n" +
                "    {\n" +
                "        int fact(int n) \n" +
                "        {\n" +
                "            int result;\n" +
                "            if (n == 1)\n" +
                "                return 1;\n" +
                "            result = fact(n - 1) * n;\n" +
                "            return result;\n" +
                "        }\n" +
                "    } \n" +
                "    class Output \n" +
                "    {\n" +
                "        public static void main(String args[]) \n" +
                "        {\n" +
                "            recursion obj = new recursion() ;\n" +
                "            System.out.print(obj.fact(1));\n" +
                "        }\n" +
                "    }", "1", " 30", "120", 1);
        addQuestion(q9);
        JavaQuestions q10 = new JavaQuestions("What is the output of this program?\n" +
                "\n" +
                "    class recursion \n" +
                "    {\n" +
                "        int fact(int n) \n" +
                "        {\n" +
                "            int result;\n" +
                "            if (n == 1)\n" +
                "                return 1;\n" +
                "            result = fact(n - 1) * n;\n" +
                "            return result;\n" +
                "        }\n" +
                "    } \n" +
                "    class Output \n" +
                "    {\n" +
                "        public static void main(String args[]) \n" +
                "        {\n" +
                "            recursion obj = new recursion() ;\n" +
                "            System.out.print(obj.fact(6));\n" +
                "        }\n" +
                "    }", "720", "120", "1", 1);
        addQuestion(q10);
        JavaQuestions q11 = new JavaQuestions("Which of these class is superclass of every class in Java?", "String class", "Object class", "Abstract class", 2);
        addQuestion(q11);
        JavaQuestions q12 = new JavaQuestions("Which of these method of Object class can clone an object?", "Objectcopy()", " copy()", "Object clone()", 3);
        addQuestion(q12);
        JavaQuestions q13 = new JavaQuestions("Which of these method of Object class is used to obtain class of an object at run time?", "get()", "void getclass()", "Class getclass()", 3);
        addQuestion(q13);
        JavaQuestions q14 = new JavaQuestions("Which of these keywords can be used to prevent inheritance of a class?", "final", "constant", "super", 3);
        addQuestion(q14);
        JavaQuestions q15 = new JavaQuestions(" Which of these keywords cannot be used for a class which has been declared final?", "abstract", "extends", "abstract and extends", 1);
        addQuestion(q15);
        JavaQuestions q16 = new JavaQuestions(" Which of these class relies upon its subclasses for complete implementation of its methods?", "Object class", " abstract class", "ArrayList class", 2);
        addQuestion(q16);
        JavaQuestions q17 = new JavaQuestions("What is the output of this program?\n" +
                "\n" +
                "    abstract class A \n" +
                "    {\n" +
                "        int i;\n" +
                "        abstract void display();\n" +
                "    }    \n" +
                "    class B extends A \n" +
                "    {\n" +
                "        int j;\n" +
                "        void display() \n" +
                "        {\n" +
                "            System.out.println(j);\n" +
                "        }\n" +
                "    }    \n" +
                "    class Abstract_demo \n" +
                "    {\n" +
                "        public static void main(String args[])\n" +
                "        {\n" +
                "            B obj = new B();\n" +
                "            obj.j=2;\n" +
                "            obj.display();    \n" +
                "        }\n" +
                "    }", "0", "2", "runtime error", 2);
        addQuestion(q17);
        JavaQuestions q18 = new JavaQuestions(" class A \n" +
                "   {\n" +
                "\tint i;\n" +
                "\tint j;\n" +
                "        A() \n" +
                "        {\n" +
                "            i = 1;\n" +
                "            j = 2;\n" +
                "        }\n" +
                "   }\n" +
                "   class Output \n" +
                "   {\n" +
                "        public static void main(String args[])\n" +
                "        {\n" +
                "             A obj1 = new A();\n" +
                "             A obj2 = new A();\n" +
                "\t     System.out.print(obj1.equals(obj2));\n" +
                "        }\n" +
                "   }", "false", "true", "1", 1);
        addQuestion(q18);
        JavaQuestions q19 = new JavaQuestions("What is the output of this program?\n" +
                "\n" +
                "    class Output \n" +
                "    {\n" +
                "        public static void main(String args[])\n" +
                "        {\n" +
                "             Object obj = new Object();\n" +
                "\t     System.out.print(obj.getclass());\n" +
                "        }\n" +
                "    }", "Object", "class Object", "class java.lang.Object", 3);
        addQuestion(q19);
        JavaQuestions q20 = new JavaQuestions("What is the output of this program?\n" +
                "\n" +
                "   class A \n" +
                "   {\n" +
                "        int i;\n" +
                "\tint j;\n" +
                "        A() \n" +
                "        {\n" +
                "            i = 1;\n" +
                "            j = 2;\n" +
                "        }\n" +
                "   }\n" +
                "   class Output \n" +
                "   {\n" +
                "        public static void main(String args[])\n" +
                "        {\n" +
                "             A obj1 = new A();\n" +
                "\t     System.out.print(obj1.toString());\n" +
                "        }\n" +
                "   }", "true", "false", "String associated with obj1", 3);
        addQuestion(q20);



    }
    private void addQuestion(JavaQuestions question) {
        ContentValues cv = new ContentValues();
        cv.put(JavaQuizContract.QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(JavaQuizContract.QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(JavaQuizContract.QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(JavaQuizContract.QuestionsTable.COLUMN_OPTION3, question.getOption3());
        cv.put(JavaQuizContract.QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        db1.insert(JavaQuizContract.QuestionsTable.TABLE_NAME1, null, cv);
    }
    public ArrayList<JavaQuestions> getAllQuestions() {
        ArrayList<JavaQuestions> questionList = new ArrayList<>();
        db1 = getReadableDatabase();
        Cursor c = db1.rawQuery("SELECT * FROM " + JavaQuizContract.QuestionsTable.TABLE_NAME1, null);

        if (c.moveToFirst()) {
            do {JavaQuestions question = new JavaQuestions();
                question.setQuestion(c.getString(c.getColumnIndex(JavaQuizContract.QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(JavaQuizContract.QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(JavaQuizContract.QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(JavaQuizContract.QuestionsTable.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(JavaQuizContract.QuestionsTable.COLUMN_ANSWER_NR)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }
}


