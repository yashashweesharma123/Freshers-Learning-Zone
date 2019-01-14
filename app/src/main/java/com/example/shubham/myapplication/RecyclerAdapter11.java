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

public class RecyclerAdapter11  extends RecyclerView.Adapter<RecyclerAdapter11.VideoInfoHolder11> {
    String[] Title={"SECOND LAW OF THERMODYNAMICS",
    "HEAT ENGINE",
    "HEAT PUMP AND REFRIGERATOR",
    "CARNOT CYCLE",
    "EFFICIENCY OF CARNOT ENGINE",
    "KELVIN PLANK'S STATEMENT",
    "INTRODUCTION TO ENTROPY",
    "ENTROPY AS A SYSTEM PROPERTY",
    "CHANGE OF ENTROPY IN REVERSIBLE PROCESS",
    "CLAUSIUS INEQUALITY",
    "CLAUSIUS THEOREM",
    "ENTROPY CHANGE IN IRREVERSIBLE PROCESS",
    "4 STROKE PETROL ENGINE",
    "4 STROKE DIESEL ENGINE",
    "CASTING AND GATING SYSTEM",
    "PATTERN ALLOWANCES IN CASTING PROCESS",
    "FORGING",
    "ROLLING"};
    String[] VideoID = {"D9KvIT47csY","tyr6vNII3Bk","uEErWdtkRUM","77EIce2Nu8Y","zD2XDeBu8sI","kNNwrp7tHPU","KOEJ4UvlnAc","vRuSgtNb-lE","aMfEfOma0z4","0Cn--CqXals",
            "tJAH_cgXc3Q","c2zfhbYj6YM","ghk8F1aJgHY","auNsAzAh9qU","BkYfrs6KxpU","Yf-71Yl_FPI","DlCP4OD1R4A","ZD8gW_OzkCQ"};
    String KEY11="AIzaSyD_BGSgaZ-gtpPtsWP_Y1yk-loNGBj8hAE";
    Context ctx11;
    public RecyclerAdapter11(Context context) {
        this.ctx11 = context;
    }
    @Override
    public RecyclerAdapter11.VideoInfoHolder11 onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new RecyclerAdapter11.VideoInfoHolder11(itemView);
    }
    @Override
    public void onBindViewHolder(final RecyclerAdapter11.VideoInfoHolder11 holder, final int position) {
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

        holder.youTubeThumbnailView.initialize(KEY11, new YouTubeThumbnailView.OnInitializedListener() {
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

    public class VideoInfoHolder11 extends RecyclerView.ViewHolder implements View.OnClickListener {

        protected RelativeLayout relativeLayoutOverYouTubeThumbnailView;
        YouTubeThumbnailView youTubeThumbnailView;
        protected Button button;
        TextView videoTittle;
        //protected TextView textView;
        //protected ImageView playButton;

        public VideoInfoHolder11(View itemView) {
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

            Intent intent = YouTubeStandalonePlayer.createVideoIntent((Activity) ctx11 ,KEY11 ,VideoID[getLayoutPosition()]);
            ctx11.startActivity(intent);
        }
    }
}

