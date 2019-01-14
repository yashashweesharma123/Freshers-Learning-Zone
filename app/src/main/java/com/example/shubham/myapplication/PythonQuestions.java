package com.example.shubham.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by shubham on 17-Nov-18.
 */

public class PythonQuestions implements Parcelable {
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private int answerNr;

    public PythonQuestions() {
    }

    public PythonQuestions(String question, String option1, String option2, String option3, int answerNr) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.answerNr = answerNr;
    }
    protected PythonQuestions(Parcel in) {
        question = in.readString();
        option1 = in.readString();
        option2 = in.readString();
        option3 = in.readString();
        answerNr = in.readInt();
    }
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(question);
        dest.writeString(option1);
        dest.writeString(option2);
        dest.writeString(option3);
        dest.writeInt(answerNr);
    }
    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<PythonQuestions> CREATOR = new Creator<PythonQuestions>() {
        @Override
        public PythonQuestions createFromParcel(Parcel in) {
            return new PythonQuestions(in);
        }

        @Override
        public PythonQuestions[] newArray(int size) {
            return new PythonQuestions[size];
        }
    };

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public int getAnswerNr() {
        return answerNr;
    }

    public void setAnswerNr(int answerNr) {
        this.answerNr = answerNr;
    }
}

