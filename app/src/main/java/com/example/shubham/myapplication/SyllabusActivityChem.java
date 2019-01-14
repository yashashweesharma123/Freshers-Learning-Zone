package com.example.shubham.myapplication;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by shubham on 15-Oct-18.
 */

public class SyllabusActivityChem extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout dLayout;
    ListView listView;
    String syllabusList[] = {"MODULE-I\n" +
            "Molecular Orbital Theory and Application\n" +
            "Hydrogen Bonding\n" +
            "Metallic Bond and its Application\n" +
            "Semiconductor\n" +
            "Carbocation, Carboanin and Free Radical\n" +
            "Types of Isomerism\n" +
            "Elements of Symmetary\n" +
            "Diastereomers\n" +
            "Optically Active Compounds\n" +
            "R-S confugration\n" +
            "E-Z geometarical isomers\n" +
            "Conformation of Ethane and n-butane\n" +
            "Fuels:Definition and Classification\n" +
            "Analysis of Coal and Determination of Calorific value by Bomb Calorimeter\n" +
            "Synthetic Petrol:Bergius and Frischer Tropschs method\n" +
            "Lubrication\n" +
            "Ceramics","MODULE-II\n" +
            "Polymerization and its classification\n" +
            "Thermoplastic(Polystyrene,Teflon and Nylon 6,6)\n" +
            "Thermosetting Polymer(Bakelite)\n" +
            "Bio-degradable Polymer(PLA, Poly-hydroxybutyrate)\n" +
            "Natural Rubber and its Vulcanisation\n" +
            "Synthetic Rubber(neoprene,buna-s,buna-n)\n" +
            "Molecular weight of Polymers\n" +
            "WATER TREATEMENT:Introduction,Hardness and its unit\n" +
            "L-S process\n" +
            "Calgon process\n" +
            "Zeolite and ion exchange processes\n" +
            "Reverse Osmosis process\n" +
            "Treatment of Municipal Water\n" +
            "Impurities in Water\n" +
            "Boiler Feed water\n" +
            "Boiler Troubles and Remedial Measures\n" +
            "CONTINUITY Functional Materials: Biomaterial,Smart material and Advanced material\n" +
            "Glass: Preparation, Variety and Uses","MODULE-III\n" +
            "Corrosion\n" +
            "Introduction and its types\n" +
            "Protection of Corrosion\n" +
            "Spectroscopy\n" +
            "UV rays\n" +
            "Infrared Rays\n" +
            "NMR Spectral Techniques\n" +
            "Chemical Kinetics\n" +
            "Order and Molecularity of Reaction\n" +
            "Zero Order\n" +
            "First Order\n" +
            "Second Order Reaction\n" +
            "Integrated Rate Equation\n" +
            "Theories of Reaction Rates\n" +
            "Factor affecting Rate of Reaction\n" +
            "pH\n" +
            "Buffer solution(Henderson equaton-Hasselbalch equation)\n" +
            "Introduction to Nano Science and Technology\n" +
            "Fullerens, Graphenes and Carbon Nanotubes\n" +
            "SEM and TEM Techniques\n" +
            "Applications of Nano Materials"};
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


