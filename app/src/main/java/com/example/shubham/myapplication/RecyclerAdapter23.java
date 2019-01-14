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
 * Created by shubham on 18-Oct-18.
 */

public class RecyclerAdapter23 extends RecyclerView.Adapter<RecyclerAdapter23.VideoInfoHolder23> {
    String[] Title={"Standardize the solution of NAOH(N/10) by Oxalic acid",
    "Standardize the solution of NAOH(N/10)by Oxalic Acid(N/5).",
    "Proximate analysis of coal.",
    "to determine chloride ion content in a given water sample by Argentometric method",
    "To Determine the constituent amount of Alkalinity in a given water sample by HCL",
    "To determine the Ferrous ion content in the supplied iron ore.",
    "To determine the temporary, permanent and total hardness of water .",
    "To Determine the free CO2 in a given sample of water.",
    "To determine the viscosity and surface tension of a given liquid.",
    "Show that the Hydrolysis of an Easter is an example of First Order Reaction."};
    String[] VideoID = {"pzZK1sX1_1U","6u0DkS2KC9c","qu1v60L1Chk","Set3XdRshGo","QmiEXKzF6Jo","D2-iNRnPUJY","Q70PgxkjH5E","IOuKQqpUmnc","Gs3gfwG9a7k","fZBj4PKhDx4"};
    String KEY23="AIzaSyD_BGSgaZ-gtpPtsWP_Y1yk-loNGBj8hAE";
    Context ctx23;
    public RecyclerAdapter23(Context context) {
        this.ctx23 = context;
    }
    @Override
    public RecyclerAdapter23.VideoInfoHolder23 onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new RecyclerAdapter23.VideoInfoHolder23(itemView);
    }
    @Override
    public void onBindViewHolder(final RecyclerAdapter23.VideoInfoHolder23 holder, final int position) {
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

        holder.youTubeThumbnailView.initialize(KEY23, new YouTubeThumbnailView.OnInitializedListener() {
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

    public class VideoInfoHolder23 extends RecyclerView.ViewHolder implements View.OnClickListener {

        protected RelativeLayout relativeLayoutOverYouTubeThumbnailView;
        YouTubeThumbnailView youTubeThumbnailView;
        protected Button button;
        TextView videoTittle;
        //protected TextView textView;
        //protected ImageView playButton;

        public VideoInfoHolder23(View itemView) {
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

            Intent intent = YouTubeStandalonePlayer.createVideoIntent((Activity) ctx23 ,KEY23 ,VideoID[getLayoutPosition()]);
            ctx23.startActivity(intent);
        }
    }
}
