package com.example.shubham.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubeStandalonePlayer;
import com.google.android.youtube.player.YouTubeThumbnailLoader;
import com.google.android.youtube.player.YouTubeThumbnailView;

/**
 * Created by shubham on 15-Oct-18.
 */

public class RecyclerAdapter15 extends RecyclerView.Adapter<RecyclerAdapter15.VideoInfoHolder15> {
    String[] Title={"TRUSSES: DEFINITION AND MATHEMATICAL CONDITIONS",
    "BASIC ASSUMPTIONS TO SOLVE TRUSS PROBLEMS",
    "CONCEPT TO SOLVE TRUSS PROBLEMS",
    "PROBLEMS ON TRUSSES USING METHOD OF JOINTS( P1)",
    "PROBLEMS ON TRUSSES USING METHOD OF JOINTS( P2)",
    "PROBLEMS ON TRUSSES USING METHOD OF JOINTS( P3)",
    "PROBLEMS ON TRUSSES USING METHOD OF SECTION( P2)",
    "PROBLEMS ON TRUSSES USING METHOD OF SECTION( P2)",
    "PROBLEMS ON TRUSSES USING METHOD OF SECTION( P3)",
    "KINETICS OF RIGID BODIES",
    "PROBLEMS OF KINETICS OF RIGID BODIES( P1)",
    "PROBLEMS OF KINETICS OF RIGID BODIES(P2)",
    "THEORY OF RECTILINEAR MOTION",
    "RECTILINEAR MOTION WITH VARIABLE ACCELERATION (P1)",
    "RECTILINEAR MOTION WITH VARIABLE ACCELERATION (P2)",
    "RECTILINEAR MOTION WITH VARIABLE ACCELERATION (P3)",
    "PROJECTILE MOTION(P1)",
    "PROJECTILE MOTION(P2)",
    "PROJECTILE MOTION(P3)",
    "MOTION UNDER GRAVITY(P1)",
    "MOTION UNDER GRAVITY(P2)",
    "INTRODUCTION TO RELATIVE MOTION",
    "PROBLEMS ON RELATIVE MOTION(P1)",
    "PROBLEMS ON RELATIVE MOTION(P2)",
    "PROBLEMS ON RELATIVE MOTION(P3)",
    "PROBLEMS ON RELATIVE MOTION(RIVER PROBLEM)",
    "PROBLEMS ON RELATIVE MOTION(RAINFALL PROBLEM)",
    "D'ALEMBERT'S PRINCIPLE(P1)",
    "D'ALEMBERT'S PRINCIPLE(P2)",
    "D'ALEMBERT'S PRINCIPLE(P3)",
    "WORK, POWER AND ENERGY",
    "WORK DONE BY VARIABLE FORCE",
    "WORK, ENERGY AND POWER (P1)",
    "ENERGY AND ITS TYPES",
    "WORK-ENERGY THEOREM",
    "CONSERVATIVE AND NON-CONSERVATIVE FORCES",
    "PROBLEMS ON WORK AND ENERGY",
    "WORK-ENERGY EQUATIONS FOR RIGID BODIES",
    "CONSERVATIVE AND NON-CONSERVATIVE FORCES"};
    String[] VideoID = {"HLMQbX_EjwQ","rE2oqkhGMh0","2nVIMvY3JJs","ct12g5xH25g","HPu0PhALdbE","UzKca-4fi2g","WXduqOZNUCY","AGEcaCh_RpY","u0CfawvQfRk","0TaXcG32Pss",
            "uZTzcd-_q3M","HBkG56v6BC8","027ns4voOWw","9svVUizTurQ","6gTYC8kYJRA","M-oEmSERVYI","lFr9OFTma8M","oyE3csiIhwE","JWY5ygqs1YQ","JTiMUhs9eZY","JQugpsRCPTo","PVA1jQgngBE","-Ur7VjxseRQ","Lbpfafqnfow","0t_AfR6nYhI","t5EfWdPT-JU",
    "f7wJbcgPc7Y","z5gYAeQz4Jc","pC8ATuG_n3s","PPkFkqkhrRI","WEriI0hK0lc","5fenCV_tUHw","GeZQT3D9XZg","JUb6_f9XnnY","uvNZu1yy9Co","btLwepfCyyY","JDHXK0Os9Zc","WhbbmqOyF1U","btLwepfCyyY"};
    String KEY15="AIzaSyD_BGSgaZ-gtpPtsWP_Y1yk-loNGBj8hAE";
    Context ctx15;
    public RecyclerAdapter15(Context context) {
        this.ctx15 = context;
    }
    @Override
    public RecyclerAdapter15.VideoInfoHolder15 onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new RecyclerAdapter15.VideoInfoHolder15(itemView);
    }
    @Override
    public void onBindViewHolder(final RecyclerAdapter15.VideoInfoHolder15 holder, final int position) {
        holder.videoTittle.setText(Title[position]);


        final YouTubeThumbnailLoader.OnThumbnailLoadedListener  onThumbnailLoadedListener = new YouTubeThumbnailLoader.OnThumbnailLoadedListener(){
            @Override
            public void onThumbnailError(YouTubeThumbnailView youTubeThumbnailView, YouTubeThumbnailLoader.ErrorReason errorReason) {

            }
            @Override
            public void onThumbnailLoaded(YouTubeThumbnailView youTubeThumbnailView, String s) {
                youTubeThumbnailView.setVisibility(View.VISIBLE);
                //holder.relativeLayoutOverYouTubeThumbnailView.setVisibility(View.VISIBLE);
            }
        };

        holder.youTubeThumbnailView.initialize(KEY15, new YouTubeThumbnailView.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubeThumbnailView youTubeThumbnailView, YouTubeThumbnailLoader youTubeThumbnailLoader) {

                youTubeThumbnailLoader.setVideo(VideoID[position]);
                youTubeThumbnailLoader.setOnThumbnailLoadedListener(onThumbnailLoadedListener);
                //youTubeThumbnailLoader.setPlaylist(Name[position]);

            }
            @Override
            public void onInitializationFailure(YouTubeThumbnailView youTubeThumbnailView, YouTubeInitializationResult youTubeInitializationResult) {
                //write something for failure
            }
        });
    }

    @Override
    public int getItemCount() {
        return VideoID.length;
    }

    public class VideoInfoHolder15 extends RecyclerView.ViewHolder implements View.OnClickListener {

        protected RelativeLayout relativeLayoutOverYouTubeThumbnailView;
        YouTubeThumbnailView youTubeThumbnailView;
        protected Button button;
        TextView videoTittle;
        //protected TextView textView;
        //protected ImageView playButton;

        public VideoInfoHolder15(View itemView) {
            super(itemView);
            //textView=(TextView) itemView.findViewById(R.id.textView);
            button=(Button) itemView.findViewById(R.id.button);
            //  playButton=(ImageView)itemView.findViewById(R.id.btnYoutube_player);
            //String KEY=new String("KEY");
            button.setOnClickListener(this);
            //relativeLayoutOverYouTubeThumbnailView = (RelativeLayout) itemView.findViewById(R.id.relativeLayout_over_youtube_thumbnail);
            youTubeThumbnailView = (YouTubeThumbnailView) itemView.findViewById(R.id.youtube_thumbnail);
            videoTittle = (TextView) itemView.findViewById(R.id.videoTittle);
        }

        @Override
        public void onClick(View v) {

            Intent intent = YouTubeStandalonePlayer.createVideoIntent((Activity) ctx15 ,KEY15 ,VideoID[getLayoutPosition()]);
            ctx15.startActivity(intent);
        }
    }
}

