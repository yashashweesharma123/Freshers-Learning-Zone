package com.example.shubham.myapplication;

/**
 * Created by shubham on 06-Oct-18.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PhysicsNotesAdapter extends ArrayAdapter {
    Context context;
    int Resource;
    int[] images={R.drawable.notes,R.drawable.notes,R.drawable.notes,R.drawable.notes,R.drawable.notes,R.drawable.notes,R.drawable.notes};
    public PhysicsNotesAdapter(Context context,int resource,ArrayList<PhysicsNotesActivity> objects){
        super(context,resource,objects);
        this.context=context;
        Resource=resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String Notes= ((PhysicsNotesActivity)getItem(position)).getNotes();
        String Notesurl =((PhysicsNotesActivity)getItem(position)).getNotesurl();
        PhysicsNotesActivity physicsNotesActivity=new PhysicsNotesActivity(Notes,Notesurl);
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = (inflater.inflate(Resource, parent, false));
        ImageView imageView=(ImageView)convertView.findViewById(R.id.imageview);
        TextView textView=(TextView)convertView.findViewById(R.id.textview);
        textView.setText(Notes);
        imageView.setImageResource(images[position]);
        return convertView;
    }

}
