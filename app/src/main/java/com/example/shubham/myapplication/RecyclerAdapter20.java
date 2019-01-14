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

public class RecyclerAdapter20 extends RecyclerView.Adapter<RecyclerAdapter20.VideoInfoHolder20> {
    String[] Title={"FIELD EFFECT TRANSISTOR(FET)",
    "CONSTRUCTION AND WORKING OF JFET",
    "WORKING OF JFET(NEGATIVE VOLTAGE AT GATE)",
    "WORKING OF JFET(ZERO VOLTAGE AT GATE)",
    "OUTPUT OR DRAIN CHARACTERSTICS OF JFET",
    "TRANSFER CHARACTERSTICS OF JFET",
    "PINCH OF VOLTAGE",
    "JFET AS A CURRENT SOURCE",
    "CONSTRUCTION AND WORKING OF ENHANSEMENT TYPE MOSFET(PART-1)",
    "CONSTRUCTION AND WORKING OF ENHANSEMENT TYPE MOSFET(PART-2)",
    "DRAIN CHARACTERSTICS OF ENHANSEMENT TYPE MOSFET",
    "TRANSFER CHARACTERSTICS & SYMBOL OF ENHANSMENT TYPE MOSFET",
    "CONSTRUCTION OF DEPLETION TYPE MOSFET",
    "WORKING OF DEPLETION TYPE MOSFET",
    "BIASING IN JFET FIXED BIASED(MATHEMATICALLY)",
    "BIASING IN JFET FIXED BIASED(GRAPHICALLY)",
    "BIASING IN JFET SELF BIASED(MATHEMATICALLY)",
    "BIASING IN JFET SELF BIASED(GRAPHICALLY)",
    "VOLTAGE DIVIDER BIASED",
    "INTRODUCTION TO DEPLETION type MOSFET(BIASING)",
    "DEPLETION type MOSFET(SELF-BIASING)",
    "DEPLETION type MOSFET(VOLTAGE DIVIDER CONFUGRATION)",
    "INTRODUCTION TO ENHANCMENT TYPE MOSFET"};
    String[] VideoID = {"PMOaS967Yus","_DZ7baOhNFQ","HufsM7Q4sEs","szXElVSlJmk","Dd4im8TMAk0","Vw4V0hRg0oE","-o39YVNMYVs","NRBBRbhsiqc","4_nGFY7zgDM","ybPQ1IDfTb8",
            "CwFc6rRMg24","H7Gdz4QTvUU","42CzwgCAX9A","XbVybFiL69s","mgUW942Xc_M","SlkCroHogcM","RDkxwYA2skE","HIa9hymisJA","j9KVzVGZXE8","T5tciiZ0TCU","OdJZ9-PHvjE","tksm6v905aM","pokW6f9z6Io"};
    String KEY20="AIzaSyD_BGSgaZ-gtpPtsWP_Y1yk-loNGBj8hAE";
    Context ctx20;
    public RecyclerAdapter20(Context context) {
        this.ctx20 = context;
    }
    @Override
    public RecyclerAdapter20.VideoInfoHolder20 onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new RecyclerAdapter20.VideoInfoHolder20(itemView);
    }
    @Override
    public void onBindViewHolder(final RecyclerAdapter20.VideoInfoHolder20 holder, final int position) {
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

        holder.youTubeThumbnailView.initialize(KEY20, new YouTubeThumbnailView.OnInitializedListener() {
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

    public class VideoInfoHolder20 extends RecyclerView.ViewHolder implements View.OnClickListener {

        protected RelativeLayout relativeLayoutOverYouTubeThumbnailView;
        YouTubeThumbnailView youTubeThumbnailView;
        protected Button button;
        TextView videoTittle;
        //protected TextView textView;
        //protected ImageView playButton;

        public VideoInfoHolder20(View itemView) {
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

            Intent intent = YouTubeStandalonePlayer.createVideoIntent((Activity) ctx20 ,KEY20 ,VideoID[getLayoutPosition()]);
            ctx20.startActivity(intent);
        }
    }
}
