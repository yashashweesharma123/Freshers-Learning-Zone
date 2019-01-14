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

public class SyllabusActivityApplied extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout dLayout;
    ListView listView;
    String syllabusList[] = {"MODULE-I\n" +
            "Engineering Mechanics:Idealization of bodies, Concept of Rigid Bodies\n" +
            "Concept of Rigid Bodies\n" +
            "External Forces and Equilibrium\n" +
            "Moment and Couples\n" +
            "Laws of Mechanics\n" +
            "DIFFRConcurrent forces in palne\n" +
            "Concurrent Forces in Palne\n" +
            "Free Body Diagram\n" +
            "Equations of Equilibrium and Applications\n" +
            "Concepts of Friction\n" +
            "Dry Friction\n" +
            "Laws of Friction and their Applications\n" +
            "Rolling Frictions","MODULE-II\n" +
            "Centroid of Composite Figures\n" +
            "Area Moment of Inertia\n" +
            "Polar Moment of Inertia\n" +
            "Parallel Axis Theorem\n" +
            "Perpendicular Axis Theorem\n" +
            "Principle Moment of Inertia\n" +
            "Mass Moment of Inertia\n" +
            "MOI of Cylinder about their symmetry\n" +
            "MOI of Cone about their symmetry\n" +
            "Beams: Different Supports and Load Conditions\n" +
            "Shear Force and Bending Moment diagrams for Point Load\n" +
            "Uniformly Distributed Load\n" +
            "Uniformly Varying Load","MODULE-III\n" +
            "Analysis of plane truss:Engineering structures\n" +
            "Perfect Truss\n" +
            "Determination of Axial Force in members\n" +
            "Method of Joint\n" +
            "Method of Sections\n" +
            "Plane motion of rigid bodies\n" +
            "Velocity and Acceleration under Translation and Rotational motion\n" +
            "Absolute motion\n" +
            "Relative motion\n" +
            "Kinematics of rigid bodies\n" +
            "Forces, Mass and Acceleration\n" +
            "Work,power and Energy\n" +
            "Impulse and Momentum\n" +
            "D'Alemberts Principle and Dynamic Equilibrium"};
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


