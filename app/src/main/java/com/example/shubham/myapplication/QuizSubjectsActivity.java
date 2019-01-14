package com.example.shubham.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by shubham on 17-Nov-18.
 */

public class QuizSubjectsActivity extends AppCompatActivity {
    ArrayList itemNames=new ArrayList<>(Arrays.asList("C","JAVA","PYTHON"));
    ArrayList<Integer> itemImages=new ArrayList<>(Arrays.asList(R.drawable.c,R.drawable.java,R.drawable.python));
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizsubjects);
        toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        CustomAdapter1 cAdapter=new CustomAdapter1(QuizSubjectsActivity.this,itemNames,itemImages);
        recyclerView.setAdapter(cAdapter);

    }}

