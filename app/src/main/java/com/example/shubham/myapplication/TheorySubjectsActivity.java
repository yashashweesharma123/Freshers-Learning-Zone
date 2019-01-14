package com.example.shubham.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import java.util.ArrayList;

/**
 * Created by shubham on 06-Oct-18.
 */

public class TheorySubjectsActivity extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout dLayout;
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        GridView gridView=(GridView) findViewById(R.id.gridview);
        //MyActivity EngineeringMathmatics=new MyActivity("EngineeringMathsmatics","drawable://"+R.drawable.books);
        MyActivity Physics=new MyActivity("Physics","drawable://"+R.drawable.books);
        MyActivity Chemistry=new MyActivity("Chemistry","drawable://"+R.drawable.books);
         MyActivity ComputerProgramming=new MyActivity("ComputerProgramming","drawable://"+R.drawable.books);
        MyActivity Mechanical=new MyActivity("Mechanical","drawable://"+R.drawable.books);
        MyActivity AppliedMechanics=new MyActivity("AppliedMechanics","drawable://"+R.drawable.books);
        MyActivity Electrical=new MyActivity("Electrical","drawable://"+R.drawable.books);
        MyActivity Electronics=new MyActivity("Electronics","drawable://"+R.drawable.books);
        MyActivity EnglishI=new MyActivity("EnglishI","drawable://"+R.drawable.books);
        ArrayList<MyActivity> arrayList=new ArrayList<>();
        //arrayList.add(EngineeringMathmatics);
        arrayList.add(Physics);
        arrayList.add(Chemistry);
        arrayList.add(ComputerProgramming);
        arrayList.add(Mechanical);
        arrayList.add(AppliedMechanics);
        arrayList.add(Electrical);
        arrayList.add(Electronics);
        arrayList.add(EnglishI);
        MyAdapter myAdapter=new MyAdapter(getApplicationContext(),R.layout.adapter_view_layout,arrayList);
        gridView.setAdapter(myAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final Intent intent=new Intent();
                switch (position){
                    //case 0:
                         //Intent intent0=new Intent(view.getContext(),Maths.class);
                        //startActivity(intent0);
                       //break;
                    case 0:
                        Intent intent0=new Intent(view.getContext(),Phy.class);
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1=new Intent(view.getContext(),chem.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2=new Intent(view.getContext(),computer.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3=new Intent(view.getContext(),mecha.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4=new Intent(view.getContext(),applied.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5=new Intent(view.getContext(),electrical.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6=new Intent(view.getContext(),electronics.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7=new Intent(view.getContext(),english.class);
                        startActivity(intent7);
                        break;
                }

            }
        });

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



