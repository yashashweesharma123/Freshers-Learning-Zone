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
 * Created by shubham on 08-Oct-18.
 */

public class NotesActivity extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout dLayout;
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        GridView gridView=(GridView) findViewById(R.id.gridv);
        PhysicsNotesActivity Interference=new PhysicsNotesActivity("Interference","drawable://"+R.drawable.notes);
        PhysicsNotesActivity Diffraction=new PhysicsNotesActivity("Diffraction","drawable://"+R.drawable.notes);
        PhysicsNotesActivity Polarisation=new PhysicsNotesActivity("Polarisation","drawable://"+R.drawable.notes);
        PhysicsNotesActivity RelativisticPhysics=new PhysicsNotesActivity("Relativistic Physics","drawable://"+R.drawable.notes);
        PhysicsNotesActivity SolidStatePhysics=new PhysicsNotesActivity("Solid State Physics","drawable://"+R.drawable.notes);
        PhysicsNotesActivity ModuleII=new PhysicsNotesActivity("Module-II","drawable://"+R.drawable.notes);
        PhysicsNotesActivity ModuleIII=new PhysicsNotesActivity("Module-III","drawable://"+R.drawable.notes);
        ArrayList<PhysicsNotesActivity> arrayList1=new ArrayList<>();
        arrayList1.add(Interference);
        arrayList1.add(Diffraction);
        arrayList1.add(Polarisation);
        arrayList1.add(RelativisticPhysics);
        arrayList1.add(SolidStatePhysics);
        arrayList1.add(ModuleII);
        arrayList1.add(ModuleIII);
        //arrayList.add(Electronics);
        //arrayList.add(EnglishI);
        PhysicsNotesAdapter physicsNotesAdapter=new PhysicsNotesAdapter(getApplicationContext(),R.layout.activity_view_layout1,arrayList1);
        gridView.setAdapter(physicsNotesAdapter);
         gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final Intent intent=new Intent();
                switch (position) {
                    case 0:
                        Intent intent0 = new Intent(view.getContext(), InterferenceActivity.class);
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1 = new Intent(view.getContext(), DiffractionActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(view.getContext(), PolarisationActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(view.getContext(), RelativisticPhysicsActivity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(view.getContext(), SolidStatePhysicsActivity.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(view.getContext(), ModuleIIActivity.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(view.getContext(), ModuleIIIActivity.class);
                        startActivity(intent6);
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


