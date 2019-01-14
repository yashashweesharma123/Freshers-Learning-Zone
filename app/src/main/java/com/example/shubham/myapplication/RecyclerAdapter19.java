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

public class RecyclerAdapter19 extends RecyclerView.Adapter<RecyclerAdapter19.VideoInfoHolder19> {
    String[] Title={"SEMICONDUCTOR MATERIALS",
    "INTRENSIC AND EXTRENSIC SEMICONDUCTOR",
    "MASS ACTION LAW",
    "DRIFT AND DIFFUSION CURRENT",
    "PN JUNCTION DIODE",
    "BARRIER POTENTIAL",
    "WIDTH OF DEPLETION LAYER",
    "PN JUNCTION DIODE(FORWARD BIASED CONDITION)",
    "PN JUNCTION DIODE(REVERSED BIASED CONDITION)",
    "VI CHARACTERSTICS OF PN JUNCTION DIODE",
    "EFFECT OF TEMP ON V-I CHARACTERSTICS",
    "IDEAL VS PRACTICAL DIODE",
    "INTRODUCTION TO ZENER DIODE",
    "ZENER DIODE AS A VOLTAGE REGULATOR(PART-1)",
    "ZENER DIODE AS A VOLTAGE REGULATOR(PART-2)",
    "ZENER DIODE AS A VOLTAGE REGULATOR(PART-3)",
    "P-N JUNCTION DIODE(REVERSE BREAKDOWN)",
    "DC OR STATIC RESISTANCE OF DIODE",
    "AC OR DYNAMIC RESISTANCE OF DIODE",
    "PHOTODIODE",
    "LED",
    "RECTIFIER-HALF AND FULL WAVE RECTIFIER",
    "FULL WAVE CENTER TAPPED RECTIFIER",
    "FULL WAVE BRIDGE RECTIFIER",
    "FILTERS",
    "INTRODUCTION TO CLAMPERS",
    "POSITIVE AND NEGATIVE CLAMPERS CIRCUIT",
    "BIASED CLAMPER",
    "INTRODUCTION TO CLIPPERRS",
    "UNBIASED SERIES CLIPPER",
    "BIASED SERIES CLIPPERS",
    "UNBIASED PARALLEL CLIPPER",
    "BIASED PARALLEL CLIPPER",
    "COMBINATION CLIPPER",
    "VOLTAGE MULTIPLIER CIRCUIT(HALF WAVE VOLTAGE DOUBLER)",
    "VOLTAGE MULTIPLIER CIRCUIT(FULL WAVE VOLTAGE DOUBLER)",
    "VOLTAGE MULTIPLIER(VOLTAGE TRIPLER AND QUADRUPLER)",
    "REGULATED POWER SUPPLY"};
    String[] VideoID = {"7jaa1rlW7Ak","z3MlkNUuq9w","yu8xvHHTij0","jhZiEon3nx4","cAu_Qv6rsM8","itL2MQqZtqA","d3VIDO0S7xk","yvH4tgqqu2U","QJnzPNGIu08","_vKeaPHXF9U",
            "ApFMXUzc7OM","WX0xQWRTPjs","JdL3DnnFHXw","6xGCOrPBL4s","LtWMuoQKMIc","HBaddgGeIrM","TLgALezzVFI","-oiAFHI6SWg","6QlFxif-JfQ","lg1AKT8hp3E",
    "eWu6yWhMYeE","yaUMBKjkOjg","CGZ0yHaAmjs","Kl8IOESVWlM","GgZ1nJH7hWU","LA7c7jenkd0","zFdy23F-pEM","kLRuU3VcXPA","ttSxAdPM5XU","lTTbcCADOIY","pieY6wUEGbU","foafJEF0rw4","RkPGtBhayUg","Mvmfqg28ZnY","r-295fIw0mI","u9UlkmEPgqA","JTJXdTTM8iU","KE5QJtU6ZA8"};
    String KEY19="AIzaSyD_BGSgaZ-gtpPtsWP_Y1yk-loNGBj8hAE";
    Context ctx19;
    public RecyclerAdapter19(Context context) {
        this.ctx19 = context;
    }
    @Override
    public RecyclerAdapter19.VideoInfoHolder19 onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new RecyclerAdapter19.VideoInfoHolder19(itemView);
    }
    @Override
    public void onBindViewHolder(final RecyclerAdapter19.VideoInfoHolder19 holder, final int position) {
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

        holder.youTubeThumbnailView.initialize(KEY19, new YouTubeThumbnailView.OnInitializedListener() {
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

    public class VideoInfoHolder19 extends RecyclerView.ViewHolder implements View.OnClickListener {

        protected RelativeLayout relativeLayoutOverYouTubeThumbnailView;
        YouTubeThumbnailView youTubeThumbnailView;
        protected Button button;
        TextView videoTittle;
        //protected TextView textView;
        //protected ImageView playButton;

        public VideoInfoHolder19(View itemView) {
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

            Intent intent = YouTubeStandalonePlayer.createVideoIntent((Activity) ctx19 ,KEY19 ,VideoID[getLayoutPosition()]);
            ctx19.startActivity(intent);
        }
    }
}

