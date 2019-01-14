package com.example.shubham.myapplication;

/**
 * Created by shubham on 18-Oct-18.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyPracticalAdapter extends ArrayAdapter {
    Context context;
    int Resource;
    int[] images={R.drawable.books,R.drawable.books,R.drawable.books,R.drawable.books,R.drawable.books,R.drawable.books,R.drawable.books,R.drawable.books,R.drawable.books};
    public MyPracticalAdapter(Context context,int resource,ArrayList<MyPracticalActivity> objects){
        super(context,resource,objects);
        this.context=context;
        Resource=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String language= ((MyPracticalActivity)getItem(position)).getLanguage();
        String languageListImageurl=((MyPracticalActivity)getItem(position)).getLanguageListImageurl();
        MyPracticalActivity myPracticalActivity=new MyPracticalActivity(language,languageListImageurl);
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = (inflater.inflate(Resource, parent, false));
        ImageView imageView=(ImageView)convertView.findViewById(R.id.imageview);
        TextView textView=(TextView)convertView.findViewById(R.id.textview);
        textView.setText(language);
        imageView.setImageResource(images[position]);
        return convertView;
    }

}

