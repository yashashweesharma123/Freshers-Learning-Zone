package com.example.shubham.myapplication;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.ListView;

/**
 * Created by shubham on 15-Oct-18.
 */

public class SyllabusActivityComp extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout dLayout;
    ListView listView;
    String syllabusList[] = {"MODULE-I\n" +
            "Introduction to C programs\n" +
            "Variables and keywords\n" +
            "First C program\n" +
            "Data Types and Operators\n" +
            "Types of Operators\n" +
            "Data Type Conversion\n" +
            "Associativity of Operators\n" +
            "Printf and scanf method\n" +
            "Post and Pre Increment\n" +
            "Decision Control (if,if-else,Nested if) Statement\n" +
            "Introduction to Looping (for loop, while loop, do while loop, Nested for loop)\n" +
            "Break and continue Statement","MODULE-II\n" +
            "Arrays in C\n" +
            "1-dimensional, 2-dimensional and multi-dimensional array\n" +
            "Introduction to Functions in C\n" +
            "Function Definition, Declaration and Calling\n" +
            "Return types and arguments in Functions\n" +
            "Functions with no argument and no return type\n" +
            "Functions with no argument and with return type\n" +
            "Functions with with argument and no return type\n" +
            "Functions with with argument and with return type\n" +
            "Nesting of functions in C\n" +
            "Recusion\n" +
            "Introduction to Pointers\n" +
            "Pointers types: Arithmetic and Void pointers\n" +
            "Pointers to Pointer\n" +
            "Pointers as Function-arguments : Call By Refernce\n" +
            "Pointers and Arrays\n" +
            "Character array and Pointers\n" +
            "Array of Pointers","MODULE-III\n" +
            "C Structures\n" +
            "Array of Structures\n" +
            "Structure within Structures\n" +
            "Passing Structure as a Function argument\n" +
            "Pointer to Structure\n" +
            "File Handling\n" +
            "File: fopen, fclose,fgets,fputs,fgetc functions\n" +
            "Create Records in File\n" +
            "Create, Delete and Update records in file"};
    int flags[] = {R.drawable.ic_lens_black_24dp};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psyllabus);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        ListView listView=(ListView) findViewById(R.id.listview) ;
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), syllabusList, flags);
        listView.setAdapter(customAdapter);
        // ModuleActivity MODULEI = new ModuleActivity("MODULEI","drawable://" + R.drawable.ic_lens_black_24dp);
        //ModuleActivity InterferenceofLight = new ModuleActivity("MODULEI","drawable://" + R.drawable.ic_lens_black_24dp);
        //ModuleActivity PrincipleofSuperposition  = new ModuleActivity("Principle of Superposition","drawable://" + R.drawable.ic_lens_black_24dp);
        //ModuleActivity CoherentSources = new ModuleActivity("Coherent Sources","drawable://" + R.drawable.ic_lens_black_24dp);
        //ModuleActivity InterferenceduetoDivisionofWavefront  = new ModuleActivity("Interference due to Division of Wavefront - ","drawable://" + R.drawable.ic_lens_black_24dp);
        //ModuleActivity BiprismExperiment = new ModuleActivity("Biprism Experiment","drawable://" + R.drawable.ic_lens_black_24dp);
        //ModuleActivity DivisionofAmplitudeinthinfilmNewton = new ModuleActivity("Division of Amplitude in thin film - Newton's ","drawable://" + R.drawable.ic_lens_black_24dp);
        //ModuleActivity RingExperiment = new ModuleActivity("Ring Experiment","drawable://" + R.drawable.ic_lens_black_24dp);
        //ModuleActivity DiffractionofLight = new ModuleActivity("Diffraction of Light","drawable://" + R.drawable.ic_lens_black_24dp);
        //ModuleActivity FresnelAndFraunofferDiffraction = new ModuleActivity("Fresnel And Fraunoffer Diffraction","drawable://" + R.drawable.ic_lens_black_24dp);
        //ModuleActivity DiffractionduetoSingleSlitandNSlit  = new ModuleActivity("Diffraction due to Single Slit and N Slit","drawable://" + R.drawable.ic_lens_black_24dp);
        //ModuleActivity Polarisation = new ModuleActivity("Polarisation","drawable://" + R.drawable.ic_lens_black_24dp);
        //ModuleActivity ConceptOfPolarisation = new ModuleActivity("Concept Of Polarisation","drawable://" + R.drawable.ic_lens_black_24dp);
        //ModuleActivity PhenomenonofDoubleRefraction = new ModuleActivity("Phenomenon of Double Refraction","drawable://" + R.drawable.ic_lens_black_24dp);
        //ModuleActivity SuperPositionofOrdinaryandExtraordinaryrays = new ModuleActivity("SuperPosition of Ordinary and Extra-ordinary rays","drawable://" + R.drawable.ic_lens_black_24dp);
        //ModuleActivity QuarterandHalfWavePlate = new ModuleActivity("Quarter and Half Wave Plate","drawable://" + R.drawable.ic_lens_black_24dp);
        //ModuleActivity OpticalActivity = new ModuleActivity("Optical Activity","drawable://" + R.drawable.ic_lens_black_24dp);
        //ModuleActivity FresneltheoryforOpticalRotation = new ModuleActivity("Fresnels theory for Optical Rotation","drawable://" + R.drawable.ic_lens_black_24dp);
        //ModuleActivity SpecificRotation = new ModuleActivity("Specific Rotation","drawable://" + R.drawable.ic_lens_black_24dp);
        //ModuleActivity BiquartzPolarimeter = new ModuleActivity("Biquartz Polarimeter","drawable://" + R.drawable.ic_lens_black_24dp);
        //final ArrayList<ModuleActivity> people = new ArrayList<>();




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

