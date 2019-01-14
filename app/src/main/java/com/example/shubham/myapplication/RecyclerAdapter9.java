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

public class RecyclerAdapter9 extends RecyclerView.Adapter<RecyclerAdapter9.VideoInfoHolder9> {
    String[] Title={"Accessing Members of Structue in C",
    "An Example Program for Structure in C",
    "Array of Structure in C",
    "Structure within Structure in C",
    "Program for Nested Structure in C",
    "Passing Structure as a Function Argument in C",
    "Pointer to Structure in C",
    "Files Handling in c",
    "FILE - fopen() AND fclose() function",
    "FGETS FUNCTION",
    "FPUTS FUNCTION",
    "PROGRAM TO COUNT NO OF CHARACTERS IN A TEXT FILE",
    "PROGRAM TO COPY CONTENT OF ONE TEXT FILE TO ANOTHER",
    "CREATE RECORDS IN FILE IN C",
    "WORKING ON MULTIPLE FILE IN C",
    "PROGRAM TO UPDATE the RECORDS IN FILE",
    "DELETE RECORDS FROM A FILE USING C"};
    String[] VideoID = {"ZVoRQf2EXPo","v_dHbPJi8o4","2PjtV9-QyOE","0x9EVpv1V0k","0bdLNewNxis","YeOC6ZCCo7A","25uPAfiinWc","goYvNgdB90k","clocidDNFoY","W9vSokMoHk0",
    "KO9PXfrB67k","77ax7UIuowc","IftYEICtkOI","W7iWkXkbD-Q","1ZtmpFgFHrw","_b0YnORZnIk","X7gWnvIDsoU"};
    String KEY9="AIzaSyD_BGSgaZ-gtpPtsWP_Y1yk-loNGBj8hAE";
    Context ctx9;
    public RecyclerAdapter9(Context context) {
        this.ctx9 = context;
    }
    @Override
    public RecyclerAdapter9.VideoInfoHolder9 onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new RecyclerAdapter9.VideoInfoHolder9(itemView);
    }
    @Override
    public void onBindViewHolder(final RecyclerAdapter9.VideoInfoHolder9 holder, final int position) {
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

        holder.youTubeThumbnailView.initialize(KEY9, new YouTubeThumbnailView.OnInitializedListener() {
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

    public class VideoInfoHolder9 extends RecyclerView.ViewHolder implements View.OnClickListener {

        protected RelativeLayout relativeLayoutOverYouTubeThumbnailView;
        YouTubeThumbnailView youTubeThumbnailView;
        protected Button button;
        TextView videoTittle;
        //protected TextView textView;
        //protected ImageView playButton;

        public VideoInfoHolder9(View itemView) {
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

            Intent intent = YouTubeStandalonePlayer.createVideoIntent((Activity) ctx9 ,KEY9 ,VideoID[getLayoutPosition()]);
            ctx9.startActivity(intent);
        }
    }
}

