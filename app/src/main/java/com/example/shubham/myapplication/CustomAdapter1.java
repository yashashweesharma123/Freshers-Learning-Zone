package com.example.shubham.myapplication;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by shubham on 17-Nov-18.
 */

public class CustomAdapter1 extends RecyclerView.Adapter {
    ArrayList<String> itemNames;
    ArrayList<Integer> itemImages;
    Context context;
    //ProgressDialog pd;
    public CustomAdapter1(Context context,ArrayList itemNames,ArrayList<Integer> itemImages){
        this.context=context;
        this.itemNames=itemNames;
        this.itemImages=itemImages;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout,parent,false);
        MyViewHolder vh=new MyViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((MyViewHolder) holder).name.setText(itemNames.get(position));
        ((MyViewHolder) holder).image.setImageResource(itemImages.get(position));
       /* holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,ThirdActivity.class);
                context.startActivity(intent);
            }
        });*/
    }
    @Override
    public int getItemCount(){
        return itemNames.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        ImageView image;
        CardView card_view;
        ProgressDialog pd;

        public MyViewHolder(View itemView) {
            super(itemView);
            name=(TextView) itemView.findViewById(R.id.textview);
            image=(ImageView) itemView.findViewById(R.id.imageview);
            card_view=(CardView) itemView.findViewById(R.id.card_view);
            pd = new ProgressDialog(context);
            pd.setTitle("Loading Activity");
            pd.setMessage("Please Wait ...");
            pd.setMax(5);
            pd.setIndeterminate(false);
            pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            // final int position = getLayoutPosition();

            card_view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

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
                            callAct(getLayoutPosition());
                        }}.execute(5);}});}



        private void callAct(int pos){
            switch (pos){
                case 0:
                    if(isConnectedWithInternet(context)){
                        Intent intent=new Intent(context,CStartingScreenActivity.class);
                        context.startActivity(intent);
                        break;

                    }
                    else{
                        Toast.makeText(context,"Please check your internet connection!",Toast.LENGTH_LONG).show();
                    }

                    //Intent intent=new Intent(context,CStartingScreenActivity.class);
                    //context.startActivity(intent);
                    //break;
                case 1:
                    if(isConnectedWithInternet(context)){
                        Intent intent1=new Intent(context,JavaStartingScreenActivity.class);
                        context.startActivity(intent1);
                        break;

                    }
                    else{
                        Toast.makeText(context,"Please check your internet connection!",Toast.LENGTH_LONG).show();

                    }

                    //Intent intent1=new Intent(context,JavaStartingScreenActivity.class);
                    //context.startActivity(intent1);
                    //break;
                case 2:
                    if(isConnectedWithInternet(context)){
                        Intent intent2=new Intent(context,PythonStartingScreenActivity.class);
                        context.startActivity(intent2);

                    }
                    else{
                        Toast.makeText(context,"Please check your internet connection!",Toast.LENGTH_LONG).show();
                    }
                    //Intent intent2=new Intent(context,PythonStartingScreenActivity.class);
                    // context.startActivity(intent2);





            }
        }}
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
}//

