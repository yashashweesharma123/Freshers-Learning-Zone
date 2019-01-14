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

/**
 * Created by shubham on 18-Oct-18.
 */

public class ExperimentsActivityElectrical extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout dLayout;
    ListView listView;
    String syllabusList[] = {"EXPERIMENT NO-1:To verify Thevenin's Theorem.",
            "EXPERIMENT NO-2:To verify the maximum power transfer theorem (DC circuits).",
            "EXPERIMENT NO-3:To verify Superposition Theorem..",
            "EXPERIMENT NO-4:To study the phenomenon of resonance in R-L-C series circuit.",
            "EXPERIMENT NO-5:To study VI characteristics of a semi-conductor diode..",
            "EXPERIMENT NO-6:To study the working of full wave and half wave (Bridge type) rectifier.",
            "EXPERIMENT NO-7:To study the operations of basic Logic Gates such as AND, OR, NOT, NAND, NAND, NOR gates and also to verify their truth table..",
            "EXPERIMENT NO-8:To determine the efficiency of a Single Phase Transformer..",
            "EXPERIMENT NO-9:To study and calibrate single phase (induction type) energy meter and also compare it with digital energy meter.",};
            //"EXPERIMENT NO-10:Show that the Hydrolysis of an Easter in the presence of Acid is an example of First Order Reaction.",};
    //"EXPERIMENT NO-11:To calibrate the voltmeter using potentiometer."};
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
                        Intent intent1=new Intent(ExperimentsActivityElectrical.this,WebViewActivity.class);
                        intent1.putExtra("URL","https://drive.google.com/open?id=1m_5YCB5xjU44w6psahoyvUlBqfhYy8LM");
                        startActivity(intent1);
                        break;

                    case 1:
                        Intent intent2=new Intent(ExperimentsActivityElectrical.this,WebViewActivity.class);
                        intent2.putExtra("URL","https://drive.google.com/open?id=1h9Shu6jzSoEg8i7egYSAmzbW_u03KCZi");
                        startActivity(intent2);
                        break;

                    case 2:
                        Intent intent3=new Intent(ExperimentsActivityElectrical.this,WebViewActivity.class);
                        intent3.putExtra("URL","https://drive.google.com/open?id=1do43imtCOfyFd2wGa77gEXZLdPBYp9dz");
                        startActivity(intent3);
                        break;
                    case 3:
                        Intent intent4=new Intent(ExperimentsActivityElectrical.this,WebViewActivity.class);
                        intent4.putExtra("URL","https://drive.google.com/open?id=1QflmvYaA_TApa1iE_XnjSbm3dCahZNcW");
                        startActivity(intent4);
                        break;
                    case 4:
                        Intent intent5=new Intent(ExperimentsActivityElectrical.this,WebViewActivity.class);
                        intent5.putExtra("URL","https://drive.google.com/open?id=18NbioKOBeHajfcfNzyzPrvWdD9LZNnpL");
                        startActivity(intent5);
                        break;

                    case 5:
                        Intent intent6=new Intent(ExperimentsActivityElectrical.this,WebViewActivity.class);
                        intent6.putExtra("URL","https://drive.google.com/open?id=15zXtEHqImGtJBSn0S5zJR344l4vwfaRl");
                        startActivity(intent6);
                        break;

                    case 6:
                        Intent intent7=new Intent(ExperimentsActivityElectrical.this,WebViewActivity.class);
                        intent7.putExtra("URL","https://drive.google.com/open?id=1L4EybWgtlW_wr6CJk7qeqyQH0YrAm6SZ");
                        startActivity(intent7);
                        break;
                    case 7:
                        Intent intent8=new Intent(ExperimentsActivityElectrical.this,WebViewActivity.class);
                        intent8.putExtra("URL","https://drive.google.com/open?id=1fwpODALjJPfiAFFTXxGHKCfQaZW_CkqT");
                        startActivity(intent8);
                        break;
                    case 8:
                        Intent intent9=new Intent(ExperimentsActivityElectrical.this,WebViewActivity.class);
                        intent9.putExtra("URL","https://drive.google.com/open?id=1GHTf9paud8fmy-cOYdRuZ9l-8P4zqK0a");
                        startActivity(intent9);
                        break;

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


