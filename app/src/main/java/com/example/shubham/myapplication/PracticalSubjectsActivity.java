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
 * Created by shubham on 18-Oct-18.
 */

public class PracticalSubjectsActivity extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout dLayout;
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        GridView gridView=(GridView) findViewById(R.id.gridview);
        MyPracticalActivity MechanicalWorkshop=new MyPracticalActivity("MECHANICALWORKSHOP","drawable://"+R.drawable.books);
        MyPracticalActivity PhysicsLab=new MyPracticalActivity("PHYSICS LAB","drawable://"+R.drawable.books);
        MyPracticalActivity ChemistryLab=new MyPracticalActivity("CHEMISTRY LAB","drawable://"+R.drawable.books);
        MyPracticalActivity ElectricalLab=new MyPracticalActivity("ELECTRICAL LAB","drawable://"+R.drawable.books);
        MyPracticalActivity MechanicsLab=new MyPracticalActivity("MECHANICS LAB","drawable://"+R.drawable.books);
        ArrayList<MyPracticalActivity> arrayList=new ArrayList<>();
        arrayList.add(MechanicalWorkshop);
        arrayList.add(PhysicsLab);
        arrayList.add(ChemistryLab);
        arrayList.add(ElectricalLab);
        arrayList.add(MechanicsLab);
        MyPracticalAdapter myPracticalAdapter=new MyPracticalAdapter(getApplicationContext(),R.layout.adapter_view_layout,arrayList);
        gridView.setAdapter(myPracticalAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final Intent intent=new Intent();
                switch (position){
                    case 0:
                        Intent intent0=new Intent(view.getContext(),Workshop.class);
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1=new Intent(view.getContext(),PhyLab.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2=new Intent(view.getContext(),ChemLab.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3=new Intent(view.getContext(),ElecLab.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4=new Intent(view.getContext(),MechaLab.class);
                        startActivity(intent4);
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




