package com.example.shubham.myapplication;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by shubham on 06-Oct-18.
 */

public class SyllabusActivity extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout dLayout;
    ListView listView;
    String syllabusList[] = {"MODULE-I\n" +
            "Interference of Light\n" +
            "Principle of Superposition\n" +
            "Coherent Sources\n" +
            "Interference due to Division of Wavefront - Biprism Experiment\n" +
            "Division of Amplitude in thin film - Newton's Ring Experiment\n" +
            "Diffraction of Light\n" +
            "Fresnel And Fraunoffer Diffraction\n" +
            "Diffraction due to Single Slit and N Slit\n" +
            "Polarisation\n" +
            "Concept Of Polarisation\n" +
            "Phenomenon of Double Refraction\n" +
            "SuperPosition of Ordinary and Extra-ordinary rays\n" +
            "Quarter and Half Wave Plate\n" +
            "Optical Activity\n" +
            "Fresnel's theory for Optical Rotation\n" +
            "Specific Rotation\n" +
            "Biquartz Polarimeter","MODULE-II\n" +
            "Solid State Physics and Super Conductivity\n" +
            "Bands in Solid\n" +
            "Bands formation in Solids/li>\n" +
            "Fermi Level and Fermi Energy\n" +
            "Temperature dependence of Conductivity and Semiconductor\n" +
            "Hall Effect\n" +
            "Temperature dependence of Resitivity in Super Conducting Materials\n" +
            "Meissner Effect : Type 1 and Type 2 Semiconductor\n" +
            "Temperature dependence of Critical Field\n" +
            "Application of Superconductor\n" +
            "NanoScience and Nano Technology\n" +
            "Electro Magnetic and Di-Electric\n" +
            "Gauss Law in Electrostatics\n" +
            "Ampere's Law\n" +
            "Faraday's Law\n" +
            "Maxwell's Equation (Integral and Diffrential form)\n" +
            "Equation of Continuity\n" +
            "Inconsistency in Ampere Circuital Law : Displacement Current\n" +
            "Propagation of E-M waves in Free Space and in Conducting Medium\n" +
            "Pointing Theorem and Pointing Vector\n" +
            "Dielectric Behaviour of Materials","MODULE-III\n" +
            "Relativistic Mechanics\n" +
            "Internal And Non Internal Frames\n" +
            "Galilean Transformation\n" +
            "Michelson and Morley Experiment\n" +
            "Einstein's Postulates\n" +
            "Lorentz's Transformation Equation\n" +
            "Length Contraction\n" +
            "Time Dilation\n" +
            "Addition of velocity\n" +
            "Variation of Mass with Velocity\n" +
            "Wave function and its Normalization\n" +
            "Mass Energy Equivalence\n" +
            "Mechanics and X-Ray Diffraction\n" +
            "Partial Duality\n" +
            "de-Broglie Hypothesis\n" +
            "Phase and Group Velocity : Wave Packets\n" +
            "Heisenber's Uncertainity Principle and Applications\n" +
            "Schrodinger's Wave Equations\n" +
            "Particle in one dimension Potential Box : Braggs Law\n" +
            "Cromptons effect"};
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

