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
public class RecyclerAdapter6 extends RecyclerView.Adapter<RecyclerAdapter6.VideoInfoHolder6> {
    String[] Title={"CORROSION IN METALS",
    "OXIDATION AND REDUCTION REACTION",
    "PITTING CORROSION",
    "WET CORROSION",
    "PREVENTION OF CORROSION",
    "PROTECTION OF CORROSION",
    "NMR-SPECTROSCOPY",
    "UV RAYS",
    "CHEMICAL KINETIC(INTRODUCTION)",
    "RATE OF REACTION",
    "ORDER AND MOLICULARITY OF REACTION",
    "ZERO ORDER REACTION",
    "ZERO ORDER REACTION AND ITS HALF TIME",
    "FIRST ORDER REACTION",
    "SECOND ORDER REACTION",
    "SECOND ORDER REACTION(HALF LIFE PERIOD)",
    "INTEGRATED RATE EQUATION",
    "FACTORS AFFECTING RATE OF REACTION",
    "PH SOLUTION",
    "BUFFER SOLUTION",
    "NANO-SCIENCE PART-I",
    "NANO-SCIENCE(PART-II)",
    "SCANNING ELECTRON MICROSCOPY(SEM)",
    "TRANSMISSION ELECTRON MICROSCOPY(TEM)"};

    String[] VideoID = {"CZzczdNbnAU", "Ju1lNZxxo8M", "E8u2sdqlfew","uB9pdExeHws","gvoQdRScZWY","q3c-ig5G3bA","H6_GgJN39vY","MW4PwJxxyt0","3VZRSo0w6LU","p0rZSKL7m9A","7Y_96tZV4OY","mhLQA5qL_G4" ,"KwQhlJWQyOo","0FttnEAjiQM","pmu_b3wMflI","QeHc47bLPcQ","aEwo7hokhMM","wbYcMgrl-8o","JSP69BCytz0","o-fN3SK_62w","UzyVJ1tCodQ","11PynxAhebs","kdb6dHEHCA0","sCJxxkeOaGw"};
    String KEY6="AIzaSyD_BGSgaZ-gtpPtsWP_Y1yk-loNGBj8hAE";
    Context ctx6;
    public RecyclerAdapter6(Context context) {
        this.ctx6 = context;
    }
    @Override
    public RecyclerAdapter6.VideoInfoHolder6 onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new RecyclerAdapter6.VideoInfoHolder6(itemView);
    }
    @Override
    public void onBindViewHolder(final RecyclerAdapter6.VideoInfoHolder6 holder, final int position) {
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

        holder.youTubeThumbnailView.initialize(KEY6, new YouTubeThumbnailView.OnInitializedListener() {
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

    public class VideoInfoHolder6 extends RecyclerView.ViewHolder implements View.OnClickListener {

        protected RelativeLayout relativeLayoutOverYouTubeThumbnailView;
        YouTubeThumbnailView youTubeThumbnailView;
        protected Button button;
        TextView videoTittle;
        //protected TextView textView;
        //protected ImageView playButton;

        public VideoInfoHolder6(View itemView) {
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

            Intent intent = YouTubeStandalonePlayer.createVideoIntent((Activity) ctx6 ,KEY6 ,VideoID[getLayoutPosition()]);
            ctx6.startActivity(intent);
        }
    }
}

