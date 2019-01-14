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

public class SyllabusActivityElectronics  extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout dLayout;
    ListView listView;
    String syllabusList[] = {"MODULE-I\n" +
            "Semiconductor materials\n" +
            "Intrinsic and Extrinsic Semi-conductors\n" +
            "MAss-Action law\n" +
            "Drift and Diffusion charge carriers\n" +
            "P-N Junction Diodes: Construction, Operation and Characteristics\n" +
            "Zener and Avanlanche breakdown mechanism\n" +
            "Diode resistance and Capacitance\n" +
            "Photo-diode and LEDs\n" +
            "Rectifiers: Full wave and Half wave\n" +
            "Centre-tap and Bridge Rectifiers\n" +
            "Filters\n" +
            "Clippers\n" +
            "Clampers\n" +
            "Voltage Multipliers\n" +
            "Zener Diode as Voltage Regulator\n" +
            "Regulated Power Supply","MODULE-II\n" +
            "Field Effect Transistor: Construction ,Operations and characteristics\n" +
            "JFET: Construction, Operations and Characteristics\n" +
            "Shockley Equation\n" +
            "Depletion and Enhancement type MOSFET\n" +
            "Biasing of JFET: Fixed Bias, Self Bias and Voltage Divider Bias\n" +
            "Biasing of Depletion type and Enhancement type MOSFET","MODULE-III\n" +
            "Digital Electronics:Number System\n" +
            "Binary Addition and Subtraction\n" +
            "1's and 2's Complements\n" +
            "Subtraction using 2's Compliments\n" +
            "Boolean Algebra\n" +
            "Logic Gates\n" +
            "Implementation of basic gates using Universal gates\n" +
            "Canonical Forms: SOP and POS\n" +
            "Simplification of Boolean functions using Boolean Postulates\n" +
            "Map upto 4 variables with Don't care conditions\n" +
            "Operational Amplifier\n" +
            "Block diagrams\n" +
            "Practical O-p Amplifier Characteristics\n" +
            "Inverting , Non-Inverting and Differntial Configuration(Open loop and Closed loop)\n" +
            "O-p Amplifier as Adder, Subtractor, Integrator and Differntiator"};
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


