package com.example.shubham.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by shubham on 21-Oct-18.
 */

public class ElectricalPaper extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout dLayout;
    ListView listView;
    String syllabusList[] = {"SECOND-YEAR:",
            "THIRD SEMESTER",
            "FOURTH SEMESTER",
            "THIRD-YEAR:",
            "FIFTH SEMESTER",
            "SIXTH SEMESTER",
            "FOURTH-YEAR:",
            "SEVENTH SEMESTER",
            "EIGHTH SEMESTER"};

    int flags[] = {R.drawable.ic_lens_black_24dp};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psyllabus);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        ListView listView=(ListView) findViewById(R.id.listview) ;
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), syllabusList, flags);
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final Intent intent=new Intent();
                WebView webView=(WebView) findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                switch (position){
                    case 0:
                        Toast.makeText(getApplicationContext(),"PLEASE SELECT THE VALID SEMESTER",Toast.LENGTH_SHORT).show();
                        break;

                    case 1:
                        Intent intent2=new Intent(ElectricalPaper.this,ElectricalFirstSemester.class);
                        //intent2.putExtra("URL","https://drive.google.com/open?id=13HJr-zQthCyHwUiKzDqxVkNdVGJFY9hk");
                        startActivity(intent2);
                        break;

                    case 2:
                        Intent intent3=new Intent(ElectricalPaper.this,ElectricalSecondSemester.class);
                        //intent3.putExtra("URL","https://drive.google.com/open?id=13HJr-zQthCyHwUiKzDqxVkNdVGJFY9hk");
                        startActivity(intent3);
                        break;
                    case 3:
                        Toast.makeText(getApplicationContext(),"PLEASE SELECT THE VALID SEMESTER",Toast.LENGTH_SHORT).show();

                        break;
                    case 4:
                        Intent intent5=new Intent(ElectricalPaper.this,Electrical3.class);
                        //intent5.putExtra("URL","https://drive.google.com/open?id=1uLr08_lFVxzwjgpRdEhPoN9CQtiH_CTj");
                        startActivity(intent5);
                        break;

                    case 5:
                        Intent intent6=new Intent(ElectricalPaper.this,Electrical4.class);
                        //intent6.putExtra("URL","https://drive.google.com/open?id=1W0HEmhHChEmR9hMjKJMajhYA_7TTjjLu");
                        startActivity(intent6);
                        break;
                    case 6:
                        Toast.makeText(getApplicationContext(),"PLEASE SELECT THE VALID SEMESTER",Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Intent intent7=new Intent(ElectricalPaper.this,Electrical5.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8=new Intent(ElectricalPaper.this,Electrical6.class);
                        startActivity(intent8);




                        //case 3:
                        // webView3=(WebView) findViewById(R.id.webview);
                        //webView3.getSettings().setJavaScriptEnabled(true);
                        //webView.loadUrl("https://drive.google.com/open?id=1to0lDswA6wFX4fJAayHmdhoqsE74YUVu");
                        //case 4:
                        //WebView webView4=(WebView) findViewById(R.id.webview);
                        //webView4.getSettings().setJavaScriptEnabled(true);
                        //webView.loadUrl("https://drive.google.com/open?id=1nfRr2eIyHYsUXVYmfn_9Ho4ry1FSit88");
                        //case 5:
                        //WebView webView5=(WebView) findViewById(R.id.webview);
                        //webView5.getSettings().setJavaScriptEnabled(true);
                        //webView.loadUrl("https://drive.google.com/open?id=16vM9_dWOgiOOMLl7WcVt0niE8gjLm9Mj");
                        //case 6:
                        //WebView webView6=(WebView) findViewById(R.id.webview);
                        //webView6.getSettings().setJavaScriptEnabled(true);
                        //webView.loadUrl("https://drive.google.com/open?id=12VD5mNHgjWEg6IPAZMvkgS0ghOlL95Ni");
                        //case 7:
                        //WebView webView7=(WebView) findViewById(R.id.webview);
                        //webView7.getSettings().setJavaScriptEnabled(true);
                        //webView.loadUrl("https://drive.google.com/open?id=1wm65JkZcssi-CaIG0ZNaKnM9vmIFL8ZV");
                        //case 8:
                        //WebView webView8=(WebView) findViewById(R.id.webview);
                        //webView8.getSettings().setJavaScriptEnabled(true);
                        //webView.loadUrl("https://drive.google.com/open?id=1En07FyStCKuDXeFdsx_1M_sr_jJ7aOrX");
                        //case 9:
                        //WebView webView9=(WebView) findViewById(R.id.webview);
                        //webView9.getSettings().setJavaScriptEnabled(true);
                        //webView.loadUrl("https://drive.google.com/open?id=13R5Vu5GKbK4uQdozGamYqVU4pV2waRNf");

                }
            }
        });
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


