package com.example.shubham.myapplication;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Button;
import android.view.Gravity;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;


public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TextView textView;
    Button button;
    TextView textView1;
    DrawerLayout dLayout;
    Bitmap bitmap;
    ProgressDialog pd;
    private static final int REQUEST_SIGNUP = 0;
    //ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textView = (TextView) findViewById(R.id.textview);
        pd=new ProgressDialog(MainActivity.this);
        pd.setTitle("Loading Activity");
        pd.setMessage("Please Wait ...");
        pd.setMax(5);
        pd.setIndeterminate(false);
        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isConnectedWithInternet(MainActivity.this)) {
                    Intent intent=new Intent(getApplicationContext(),YashActivity.class);
                    startActivityForResult(intent, REQUEST_SIGNUP);

                }else {
                    Toast.makeText(MainActivity.this,"Please check your internet connection!",Toast.LENGTH_LONG).show();
                }
            }
        });


                //Intent intent=new Intent(getApplicationContext(),YashActivity.class);

        textView.setText("Education Simplified");
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
                                if(isConnectedWithInternet(MainActivity.this)) {
                                    Intent intent=new Intent(getApplicationContext(),PreviousPaper.class);
                                    startActivityForResult(intent, REQUEST_SIGNUP);
                                    break;

                                }else {
                                    Toast.makeText(MainActivity.this,"Please check your internet connection!",Toast.LENGTH_LONG).show();
                                }
                                //Intent intent = new Intent(getApplicationContext(), PreviousPaper.class);
                                //startActivity(intent);
                                //break;
                            case R.id.second:
                                if(isConnectedWithInternet(MainActivity.this)) {
                                    Intent intent=new Intent(getApplicationContext(),Quiz.class);
                                    startActivityForResult(intent, REQUEST_SIGNUP);

                                }else {
                                    Toast.makeText(MainActivity.this,"Please check your internet connection!",Toast.LENGTH_LONG).show();
                                }
                                //Intent intent1 = new Intent(getApplicationContext(), Quiz.class);
                                //startActivity(intent1);
                                //break;
                            //case R.id.third:
                                //Intent intent2 = new Intent(getApplicationContext(), PreviousPaper.class);
                                //startActivity(intent2);
                               // break;
                            //case R.id.fourth:
                                //Intent intent3 = new Intent(getApplicationContext(), Quiz.class);
                                //startActivity(intent3);
                               // break;

                        }}}.execute(5);return false;}});}
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
}


 //initiate a Navigation View
// implement setNavigationItemSelectedListener event on NavigationView
        //textView1=(TextView) findViewById(R.id.textview1);
        //ImageView imageView=(ImageView) findViewById(R.id.imageview);




