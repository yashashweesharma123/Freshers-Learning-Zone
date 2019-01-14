package com.example.shubham.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by shubham on 15-Oct-18.
 */

public class ElectronicsNotesAdapter extends ArrayAdapter {
    Context context;
    int Resource;
    int[] images={R.drawable.notes,R.drawable.notes,R.drawable.notes,R.drawable.notes,R.drawable.notes};
    public ElectronicsNotesAdapter(Context context,int resource,ArrayList<ElectronicsNotesActivity> objects){
        super(context,resource,objects);
        this.context=context;
        Resource=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String Notes= ((ElectronicsNotesActivity)getItem(position)).getNotes();
        String Notesurl =((ElectronicsNotesActivity)getItem(position)).getNotesurl();
        ElectronicsNotesActivity electronicsNotesActivity=new ElectronicsNotesActivity(Notes,Notesurl);
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = (inflater.inflate(Resource, parent, false));
        ImageView imageView=(ImageView)convertView.findViewById(R.id.imageview);
        TextView textView=(TextView)convertView.findViewById(R.id.textview);
        textView.setText(Notes);
        imageView.setImageResource(images[position]);
        return convertView;
    }

}

