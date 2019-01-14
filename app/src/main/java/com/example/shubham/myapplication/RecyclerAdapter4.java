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

public class RecyclerAdapter4 extends RecyclerView.Adapter<RecyclerAdapter4.VideoInfoHolder4> {
    String[] Title={"CHEMICAL BONDING",
    "MOLECULAR ORBITAL THEORY",
    "MOLECULAR ORBITAL THEORY(HOMO ATOMIC MOLECULE)",
    "MOLECULAR ORBITAL THEORY(HETERO ATOMIC MOLECULE)",
    "HYDROGEN BONDING",
    "METALLIC BONDING",
    "SEMICONDUCTORS",
    "REACTION INTERMEDIATE",
    "ISOMERISM",
    "OPTICAL ISOMERISM",
    "GEOMETRICAL ISOMERISM",
    "CHIRALITY",
    "RS CONFIGURATION",
    "EZ CONFIGURATION",
    "ENANTIOMERS AND DIASTEREOMERS",
    "BOMB CALORIE METER",
    "SYNTHETIC PETROL",
    "LUBRICANTS",
    "FUELS",
    "CALORIFIC VALUE",
    "CALORIFIC VALUE(NUMERICAL)"};
    String[] VideoID = {"OhMLKSg9KBQ", "_vtMsnIeeZw", "H3QPImW9dpE","iYvT3PNsOfo","fobLjk-Mfvg","-Euc6SOAu8E","5ZNeDxfgYAE","zUlPXky1GcQ","ZTT5dKrdCP8","7dEXbZSs4tc","9DlutZBQWVk","0IA794o_BqI" ,"cY44Rwb0IhA","qGeMpxRe2yc","onR5Xgz7eKc","9suiA6EWQ18","-I_UtU7zYs0","CLMdkexbt3E","jRVg4ue-_lc","UfzS7djnj4M","Unn_GRLrs_A"};
    String KEY4="AIzaSyD_BGSgaZ-gtpPtsWP_Y1yk-loNGBj8hAE";
    Context ctx4;
    public RecyclerAdapter4(Context context) {
        this.ctx4 = context;
    }
    @Override
    public RecyclerAdapter4.VideoInfoHolder4 onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new RecyclerAdapter4.VideoInfoHolder4(itemView);
    }
    @Override
    public void onBindViewHolder(final RecyclerAdapter4.VideoInfoHolder4 holder, final int position) {
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

        holder.youTubeThumbnailView.initialize(KEY4, new YouTubeThumbnailView.OnInitializedListener() {
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

    public class VideoInfoHolder4 extends RecyclerView.ViewHolder implements View.OnClickListener {

        protected RelativeLayout relativeLayoutOverYouTubeThumbnailView;
        YouTubeThumbnailView youTubeThumbnailView;
        protected Button button;
        TextView videoTittle;
        //protected TextView textView;
        //protected ImageView playButton;

        public VideoInfoHolder4(View itemView) {
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

            Intent intent = YouTubeStandalonePlayer.createVideoIntent((Activity) ctx4 ,KEY4 ,VideoID[getLayoutPosition()]);
            ctx4.startActivity(intent);
        }
    }
}
