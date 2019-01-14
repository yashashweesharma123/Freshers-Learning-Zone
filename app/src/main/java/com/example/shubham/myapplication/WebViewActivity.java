package com.example.shubham.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by shubham on 19-Oct-18.
 */

public class WebViewActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interference);

        webView = (WebView) findViewById(R.id.webview);

        //Retrieve the url that you put into your intent
        String url = getIntent().getStringExtra("URL");
        webView.loadUrl(url);
    }
}
