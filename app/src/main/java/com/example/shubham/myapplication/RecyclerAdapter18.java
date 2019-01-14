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

public class RecyclerAdapter18 extends RecyclerView.Adapter<RecyclerAdapter18.VideoInfoHolder18> {
    String[] Title={"DC MACHINE",
    "PRINCIPLE OF OPERATION OF DC MOTOR",
    "EMF EQUATION OF DC MACHINES",
    "TORQUE SLIP CHARACTERISTICS",
    "CONSTRUCTION OF 3-PHASE INDUCTION MOTOR",
    "SINGLE PHASE INDUCTION MOTOR",
    "NMR-SPECTROSCOPY",
    "WORKING OF INDUCTION MOTOR(VISUAL",
    "DIFFERENCE BETWEEN INDUCTION AND SYNCHRONOUS MOTOR",
    "SYNCHRONOUS MOTOR WORKING(VISUAL)",
    "SYNCHRONOUS MOTOR(TUTORIAL)",
    "Why does single phase induction motor does not self start?"};
    String[] VideoID = {"xsWNGcZ-jds","0gWJ8OqkpHM","S8VIewhwqZs","bqCmaRsl6fk","Mle-ZvYi8HA","F4ld_IV0Qf4","H6_GgJN39vY","AQqyGNOP_3o","OWsUXBsqGL4","Vk2jDXxZIhs",
            "gSsblyU07Zg","I_U3cA3owyQ"};
    String KEY18="AIzaSyD_BGSgaZ-gtpPtsWP_Y1yk-loNGBj8hAE";
    Context ctx18;
    public RecyclerAdapter18(Context context) {
        this.ctx18 = context;
    }
    @Override
    public RecyclerAdapter18.VideoInfoHolder18 onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new RecyclerAdapter18.VideoInfoHolder18(itemView);
    }
    @Override
    public void onBindViewHolder(final RecyclerAdapter18.VideoInfoHolder18 holder, final int position) {
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

        holder.youTubeThumbnailView.initialize(KEY18, new YouTubeThumbnailView.OnInitializedListener() {
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

    public class VideoInfoHolder18 extends RecyclerView.ViewHolder implements View.OnClickListener {

        protected RelativeLayout relativeLayoutOverYouTubeThumbnailView;
        YouTubeThumbnailView youTubeThumbnailView;
        protected Button button;
        TextView videoTittle;
        //protected TextView textView;
        //protected ImageView playButton;

        public VideoInfoHolder18(View itemView) {
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

            Intent intent = YouTubeStandalonePlayer.createVideoIntent((Activity) ctx18 ,KEY18 ,VideoID[getLayoutPosition()]);
            ctx18.startActivity(intent);
        }
    }
}


