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
 * Created by shubham on 15-Oct-18.
 */

public class NotesAppliedActivity extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout dLayout;
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        GridView gridView=(GridView) findViewById(R.id.gridv);
        AppliedNotesActivity MODULEI=new AppliedNotesActivity("MODULE-I","drawable://"+R.drawable.notes);
        AppliedNotesActivity MODULEII=new AppliedNotesActivity("MODULE-II","drawable://"+R.drawable.notes);
        AppliedNotesActivity MODULEIII=new AppliedNotesActivity("MODULE-III","drawable://"+R.drawable.notes);
        //ChemistryNotesActivity CHEMICALKINETICSPART1=new ChemistryNotesActivity("CHEMICAL KINETICS PART-1","drawable://"+R.drawable.notes);
        //ChemistryNotesActivity CHEMICALKINETICSPART2=new ChemistryNotesActivity("CHEMICAL KINETICS PART-2","drawable://"+R.drawable.notes);
        //ChemistryNotesActivity ModuleII=new PhysicsNotesActivity("Module-II","drawable://"+R.drawable.notes);
        //ChemistryNotesActivity ModuleIII=new PhysicsNotesActivity("Module-III","drawable://"+R.drawable.notes);
        ArrayList<AppliedNotesActivity> arrayList1=new ArrayList<>();
        arrayList1.add(MODULEI);
        arrayList1.add(MODULEII);
        arrayList1.add(MODULEIII);
        //arrayList1.add(CHEMICALKINETICSPART1);
        //arrayList1.add(CHEMICALKINETICSPART2);
        //arrayList1.add(ModuleII);
        //arrayList1.add(ModuleIII);
        //arrayList.add(Electronics);
        //arrayList.add(EnglishI);
        AppliedNotesAdapter appliedNotesAdapter=new AppliedNotesAdapter(getApplicationContext(),R.layout.activity_view_layout2,arrayList1);
        gridView.setAdapter(appliedNotesAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final Intent intent=new Intent();
                switch (position) {
                    case 0:
                        Intent intent0 = new Intent(view.getContext(), AppliedMODULEIActivity.class);
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1 = new Intent(view.getContext(), AppliedMODULEIIActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(view.getContext(), AppliedMODULEIIIActivity.class);
                        startActivity(intent2);
                        break;


                }}});
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

