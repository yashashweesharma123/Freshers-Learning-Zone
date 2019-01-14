package com.example.shubham.myapplication;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Paint;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import de.hdodenhof.circleimageview.CircleImageView;
import android.content.Intent;

import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by shubham on 28-Sep-18.
 */

public class YashActivity extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout dLayout;
    ImageView imageView;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ProgressDialog pd;
    TextView text;
    private static final int REQUEST_SIGNUP = 0;
    //TextView txt;
    //TextView txt;
    //TextView textView2;
    //TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //TextView text=(TextView) findViewById(R.id.firstyear);
        //text.setPaintFlags(text.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        //textView=(TextView) findViewById(R.id.firstyear) ;
        //textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        //textView1=(TextView) findViewById(R.id.secondyear);
        //textView1.setPaintFlags(textView1.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        //textView2=(TextView) findViewById(R.id.thirdyear) ;
        //textView2.setPaintFlags(textView2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        //textView3=(TextView) findViewById(R.id.fourthyear);
        //textView3.setPaintFlags(textView3.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);


        pd=new ProgressDialog(YashActivity.this);
        pd.setTitle("Loading Activity");
        pd.setMessage("Please Wait ...");
        pd.setMax(5);
        pd.setIndeterminate(false);
        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        CircleImageView imageView=(CircleImageView) findViewById(R.id.circle);
        CircleImageView imageView1=(CircleImageView) findViewById(R.id.circle1);
        CircleImageView imageView2=(CircleImageView) findViewById(R.id.circle2);
        CircleImageView imageView3=(CircleImageView) findViewById(R.id.circle3);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isConnectedWithInternet(YashActivity.this)) {
                    Intent intent=new Intent(getApplicationContext(),FirstYearActivity.class);
                    startActivityForResult(intent, REQUEST_SIGNUP);

                }else {
                    Toast.makeText(YashActivity.this,"Please check your internet connection!",Toast.LENGTH_LONG).show();
                }
                //Intent intent=new Intent(getApplicationContext(),FirstYearActivity.class);
                //startActivity(intent);

            }
        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(getApplicationContext(),"We are still working on it",Toast.LENGTH_LONG);
                toast.setMargin(50,50);
                toast.show();
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(getApplicationContext(),"We are still working on it",Toast.LENGTH_LONG);
                toast.setMargin(50,50);
                toast.show();

            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast=Toast.makeText(getApplicationContext(),"We are still working on it",Toast.LENGTH_LONG);
                toast.setMargin(50,50);
                toast.show();
            }
        });
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
                                if(isConnectedWithInternet(YashActivity.this)) {
                                    Intent intent=new Intent(getApplicationContext(),PreviousPaper.class);
                                    startActivityForResult(intent, REQUEST_SIGNUP);
                                    break;

                                }else {
                                    Toast.makeText(YashActivity.this,"Please check your internet connection!",Toast.LENGTH_LONG).show();
                                }
                                //Intent intent = new Intent(getApplicationContext(), PreviousPaper.class);
                                //startActivity(intent);
                                //break;
                            case R.id.second:
                                if(isConnectedWithInternet(YashActivity.this)) {
                                    Intent intent=new Intent(getApplicationContext(),Quiz.class);
                                    startActivityForResult(intent, REQUEST_SIGNUP);

                                }else {
                                    Toast.makeText(YashActivity.this,"Please check your internet connection!",Toast.LENGTH_LONG).show();
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
}// initiate a Navigation View

// i

