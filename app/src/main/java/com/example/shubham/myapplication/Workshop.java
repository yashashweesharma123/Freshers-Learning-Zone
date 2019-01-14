package com.example.shubham.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by shubham on 18-Oct-18.
 */

public class Workshop extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interference);
        //pdfView=(PDFView) findViewById(R.id.pdf1);
        //pdfView.fromAsset("S1.pdf").load();
        webView=(WebView) findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        //String pdf = "https://drive.google.com/open?id=1lcKcBUznMth-_SwgdIQspbIYKuBTwwpb";
        webView.loadUrl("https://drive.google.com/open?id=1oFXxr2uR0GUYdwxQ4S88tOEgjF2MKL7Y");
        //webView.loadUrl("https://drive.google.com/file/d/1wrt9hnoX0XfT8Zcwk-lX2gUbav1pljx2/view");
    }}

