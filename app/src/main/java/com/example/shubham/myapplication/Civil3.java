package com.example.shubham.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

/**
 * Created by shubham on 22-Oct-18.
 */

public class Civil3 extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout dLayout;
    Button button;
    Button button1;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physicsmidterms);
        button=(Button) findViewById(R.id.button);
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),WebViewActivity.class);
                intent.putExtra("URL","https://drive.google.com/open?id=0B6guZ4n5yz_LR05zOW03UzkwRDQ");
                startActivity(intent);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),WebViewActivity.class);
                intent.putExtra("URL","https://drive.google.com/open?id=1_DS6QsikNdBQkt9kdbTOLTOB5vvAKmNJ");
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),WebViewActivity.class);
                intent.putExtra("URL","https://drive.google.com/open?id=1mR4h8dXtyZ6b6sGSI8XEq0bGWTIGqphP");
                startActivity(intent);
            }
        });
        //button2=(Button) findViewById(R.id.button2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dLayout.openDrawer(Gravity.LEFT);
            }
        });
        setNavigationDrawer(); // call method
    }
    private void setNavigationDrawer() {
        dLayout = (DrawerLayout) findViewById(R.id.drawer_layout); // initiate a DrawerLayout
        NavigationView navView = (NavigationView) findViewById(R.id.navigation);
    }

}// i


