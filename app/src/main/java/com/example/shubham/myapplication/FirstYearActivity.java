package com.example.shubham.myapplication;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by shubham on 06-Oct-18.
 */

public class FirstYearActivity extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout dLayout;
    Button button;
    Button button1;
    Button button2;
    ProgressDialog pd;
    private static final int REQUEST_SIGNUP = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        pd=new ProgressDialog(FirstYearActivity.this);
        pd.setTitle("Loading Activity");
        pd.setMessage("Please Wait ...");
        pd.setMax(5);
        pd.setIndeterminate(false);
        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        button=(Button) findViewById(R.id.button);
        button1=(Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isConnectedWithInternet(FirstYearActivity.this)) {
                    Intent intent=new Intent(getApplicationContext(),TheorySubjectsActivity.class);
                    startActivityForResult(intent, REQUEST_SIGNUP);

                }else {
                    Toast.makeText(FirstYearActivity.this,"Please check your internet connection!",Toast.LENGTH_LONG).show();
                }
                //Intent intent=new Intent(getApplicationContext(),TheorySubjectsActivity.class);
                //startActivity(intent);
            }
        });
        button1=(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isConnectedWithInternet(FirstYearActivity.this)) {
                    Intent intent=new Intent(getApplicationContext(),PracticalSubjectsActivity.class);
                    startActivityForResult(intent, REQUEST_SIGNUP);

                }else {
                    Toast.makeText(FirstYearActivity.this,"Please check your internet connection!",Toast.LENGTH_LONG).show();
                }
                //Intent intent=new Intent(getApplicationContext(),PracticalSubjectsActivity.class);
                //startActivity(intent);
            }
        });
        //button2=(Button) findViewById(R.id.button2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
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
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected( final MenuItem menuItem) {
                new  AsyncTask<Integer, Long, Boolean>() {


                    @Override
                    protected Boolean doInBackground(Integer... params) {

                        publishProgress(0L);
                        long start = System.currentTimeMillis();
                        long waitTime = params[0] * 1000;
                        try {
                            while (System.currentTimeMillis() - start < waitTime) {
                                Thread.sleep(500);
                                publishProgress(System.currentTimeMillis() - start);
                            }
                        } catch (Exception e) {
                            return false;
                        }
                        return true;

                    }

                    @Override
                    protected void onProgressUpdate(Long... values) {
                        if (values[0] == 0) {
                            pd.show();
                        } else {
                            pd.setProgress((int) (values[0] / 1000));
                        }
                    }
                    @Override
                    protected void onPostExecute(Boolean result) {
                        pd.dismiss();

                        int itemId=menuItem.getItemId();
                        switch (itemId) {
                            case R.id.first:
                                //if (isConnectedWithInternet(MainActivity.this){
                                if(isConnectedWithInternet(FirstYearActivity.this)) {
                                    Intent intent=new Intent(getApplicationContext(),PreviousPaper.class);
                                    startActivityForResult(intent, REQUEST_SIGNUP);
                                    break;

                                }else {
                                    Toast.makeText(FirstYearActivity.this,"Please check your internet connection!",Toast.LENGTH_LONG).show();
                                }
                                //Intent intent = new Intent(getApplicationContext(), PreviousPaper.class);
                                //startActivity(intent);
                                //break;
                            case R.id.second:
                                if(isConnectedWithInternet(FirstYearActivity.this)) {
                                    Intent intent=new Intent(getApplicationContext(),Quiz.class);
                                    startActivityForResult(intent, REQUEST_SIGNUP);

                                }else {
                                    Toast.makeText(FirstYearActivity.this,"Please check your internet connection!",Toast.LENGTH_LONG).show();
                                }
                            //case R.id.third:
                            //Intent intent2 = new Intent(getApplicationContext(), PreviousPaper.class);
                            //startActivity(intent2);
                            // break;
                            //case R.id.fourth:
                            //Intent intent3 = new Intent(getApplicationContext(), Quiz.class);
                            //startActivity(intent3);
                            // break;

                        }}}.execute(5);return false;}});
    }


    public static boolean isConnectedWithInternet(Context context) {
        boolean _isNetAvailable = false;
        ConnectivityManager cm = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo wifiNetwork = cm
                .getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        if (wifiNetwork != null) {
            _isNetAvailable = wifiNetwork.isConnectedOrConnecting();
        }

        NetworkInfo mobileNetwork = cm
                .getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
        if (mobileNetwork != null) {
            _isNetAvailable = mobileNetwork.isConnectedOrConnecting();
        }

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        if (activeNetwork != null) {
            _isNetAvailable = activeNetwork.isConnectedOrConnecting();
        }
        return _isNetAvailable;
    }
}// initia// nitiate a Navigation View

//


// i


