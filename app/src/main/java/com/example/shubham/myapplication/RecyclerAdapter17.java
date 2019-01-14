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

public class RecyclerAdapter17 extends RecyclerView.Adapter<RecyclerAdapter17.VideoInfoHolder17> {
    String[] Title={"GENERATION OF 3-PHASE SUPPLY",
    "NEED OF 3-PHASE SUPPLY",
    "DELTA TO STAR CONVERSION",
    "STAR TO DELTA CONNECTION",
    "LINE CURRENT,LINE VOLTAGE,PHASOR CURRENT AND PHASOR VOLTAGE",
    "RELATIONSHIP BETWEEN LINE AND PHASE QUANTITIES",
    "FARADAY'S LAW OF ELECTRO-MAGNETIC INDUCTION",
    "LENZ LAW",
    "Hysteresis Curve(B-H Characteristics)",
    "MAGNETIC CIRCUIT(PART-1)",
    "MAGNETICS CIRCUIT(Part -2)",
    "SINGLE PHASE TRANSFORMER",
    "BASIC PRINCIPLE OF SINGLE PHASE TRANSFORMER",
    "CONSTRUCTION OF SINGLE PHASE TRANSFORMER",
    "EMF EQUATION OF TRANSFORMER",
    "EFFICIENCY OF TRANSFORMER",
    "LOSSES OF TRANSFORMER"};
    String[] VideoID = {"CbcU5xS-OS8","ZYfZYl2ssyE","OV0qi7yzKAM","9b17eqCT4-g","NDcCuvc8NLU","WmTqTLv3uvY","lXenWgHznlE","AhC-jocpPG4","qNVWdI79FN4","2ZwQZgyYkIE",
            "GcBg5jrXDM8","mx3J9wdbJ30","xuIADO0LJfM","-j3W_RpiWoo","BqetOHEhAGE","GgckE4H5AJE","HBl2IIFtctI"};
    String KEY17="AIzaSyD_BGSgaZ-gtpPtsWP_Y1yk-loNGBj8hAE";
    Context ctx17;
    public RecyclerAdapter17(Context context) {
        this.ctx17 = context;
    }
    @Override
    public RecyclerAdapter17.VideoInfoHolder17 onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new RecyclerAdapter17.VideoInfoHolder17(itemView);
    }
    @Override
    public void onBindViewHolder(final RecyclerAdapter17.VideoInfoHolder17 holder, final int position) {
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

        holder.youTubeThumbnailView.initialize(KEY17, new YouTubeThumbnailView.OnInitializedListener() {
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

    public class VideoInfoHolder17 extends RecyclerView.ViewHolder implements View.OnClickListener {

        protected RelativeLayout relativeLayoutOverYouTubeThumbnailView;
        YouTubeThumbnailView youTubeThumbnailView;
        protected Button button;
        TextView videoTittle;
        //protected TextView textView;
        //protected ImageView playButton;

        public VideoInfoHolder17(View itemView) {
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

            Intent intent = YouTubeStandalonePlayer.createVideoIntent((Activity) ctx17 ,KEY17 ,VideoID[getLayoutPosition()]);
            ctx17.startActivity(intent);
        }
    }
}


