package com.example.shubham.myapplication;

/**
 * Created by shubham on 18-Oct-18.
 */

public class MyPracticalActivity {
    String Language;
    String languageListImageurl;
    public MyPracticalActivity(String language,String languageListImageurl){
        this.Language=language;
        this.languageListImageurl=languageListImageurl;
    }
    public String getLanguage(){
        return Language;
    }
    public void setLanguage(){
        this.Language=Language;
    }
    public String getLanguageListImageurl(){
        return languageListImageurl;
    }
    public void setLanguageListImageurl(){
        this.languageListImageurl=languageListImageurl;
    }}

