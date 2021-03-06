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

public class RecyclerAdapter5 extends RecyclerView.Adapter<RecyclerAdapter5.VideoInfoHolder5> {
    String[] Title={"POLYMERS:INTRODUCTION",
    "CLASSIFICATION OF POLYMERS",
    "MODES OF POLYMERISATION",
    "RUBBER:INTRODUCTION",
    "BIODEGRADABLE POLYMER",
    "TYPES OF POLYMERISATION",
    "WATER TREATMENT",
    "LIME SODA PROCESS",
    "CALGON PROCESS",
    "ZEOLITE PROCESS",
    "REVERSE OSMOSIS",
    "IMPURITIES IN WATER",
    "BOILER FEED WATER AND ITS REMEDIES",
    "BIO MATERIALS",
    "SMART MATERIALS",
    "ADVANCE MATERIALS",
    "GLASS:INTRODUCTION\n"};
    String[] VideoID = {"2pPzi02Re04", "cureePyQgIc", "DxpxhYX7ewU","ijlp5Z1aSPI","rLPawsgZg7E","fMGHlLcTjOw","p4j8-EQG9nc","05gITL4lnaw","JfJ9fqPNZS0","1boFl-CLtMs","aVdWqbpbv_Y","NEuBunNhTgY" ,"is5wdVgPOkI","XqFSlG6WKO0","yXHlIowQntk","wMLvodIVYNI","LAFdoTw_xpk"};
    String KEY5="AIzaSyD_BGSgaZ-gtpPtsWP_Y1yk-loNGBj8hAE";
    Context ctx5;
    public RecyclerAdapter5(Context context) {
        this.ctx5 = context;
    }
    @Override
    public RecyclerAdapter5.VideoInfoHolder5 onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new RecyclerAdapter5.VideoInfoHolder5(itemView);
    }
    @Override
    public void onBindViewHolder(final RecyclerAdapter5.VideoInfoHolder5 holder, final int position) {
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

        holder.youTubeThumbnailView.initialize(KEY5, new YouTubeThumbnailView.OnInitializedListener() {
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

    public class VideoInfoHolder5 extends RecyclerView.ViewHolder implements View.OnClickListener {

        protected RelativeLayout relativeLayoutOverYouTubeThumbnailView;
        YouTubeThumbnailView youTubeThumbnailView;
        protected Button button;
        TextView videoTittle;
        //protected TextView textView;
        //protected ImageView playButton;

        public VideoInfoHolder5(View itemView) {
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

            Intent intent = YouTubeStandalonePlayer.createVideoIntent((Activity) ctx5 ,KEY5 ,VideoID[getLayoutPosition()]);
            ctx5.startActivity(intent);
        }
    }
}
