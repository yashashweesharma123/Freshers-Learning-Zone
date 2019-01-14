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

public class RecyclerAdapter13 extends RecyclerView.Adapter<RecyclerAdapter13.VideoInfoHolder13> {
    String[] Title={"LAW OF PARALLELOGRAM",
    "DEFINITION OF EQUILIBRIUM",
    "EQUILIBRIUM SYSTEM OF COPLANAR FORCES",
    "EQUILIBRIUM SYSTEM OF COPLANAR FORCES(PROBLEM 2)",
    "EQUILIBRIUM SYSTEM OF COPLANAR FORCES(PROBLEM 3)",
    "EQUILIBRIUM SYSTEM OF COPLANAR FORCES(PROBLEM 4)",
    "EQUILIBRIUM SYSTEM OF COPLANAR FORCES(PROBLEM 11)",
    "LAMI'S THEOREM (PROBLEM 1)",
    "LAMI'S THEOREM (PROBLEM 2)",
    "LAMI'S THEOREM (PROBLEM 3)",
    "LAMI'S THEOREM (PROBLEM 4)",
    "LAMI'S THEOREM (PROBLEM 5)",
    "VARIGNON'S THEOREM",
    "COPLANAR AND NON-COPLANAR FORCES( PROBLEM 1)",
    "COPLANAR AND NON-COPLANAR FORCES( PROBLEM 2)",
    "COPLANAR AND NON-COPLANAR FORCES( PROBLEM 3)",
    "NON-CONCURRENT FORCES OF SYSTEM",
    "RESOLUTION AND COMPOSITION OF FORCES( PROBLEM 1)",
    "RESOLUTION AND COMPOSITION OF FORCES( PROBLEM 2)",
    "RESOLUTION AND COMPOSITION OF FORCES( PROBLEM 3)",
    "RESOLUTION AND COMPOSITION OF FORCES( PROBLEM 4)",
    "FUNDAMENTAL LAWS OF MOTION",
    "CONCURRENT FORCES IN PLANE",
    "CONCURRENT FORCES (FINDING RESULTANT)",
    "CONCURRENT FORCES( SPHERE AND CYLINDER)",
    "CONCURRENT FORCES( SPHERE AND CYLINDER) PROBLEM 2",
    "FREE BODY DIAGRAM",
    "FREE BODY DIAGRAM (PROBLEM 1)",
    "FREE BODY DIAGRAM( PROBLEM 2)",
    "UNDERSTANDING FRICTION",
    "CONE OF FRICTION AND ANGLE OF REPOSE",
    "LAWS OF FRICTION",
    "FRICTION( PROBLEM 1)",
    "FRICTION( PROBLEM 2)",
    "FRICTION( PROBLEM 3)",
    "FRICTION( PROBLEM 4)",
    "FRICTION( PROBLEM 5)",
    "LADDER FRICTION( PROBLEM 1)",
    "LADDER FRICTION (PROBLEM 2)"};
    String[] VideoID = {"-M3gm3MpbvM","7kt9AoxZlLo","8lOEeGZ1Ipg","hoURHZUCI3o","8eiERcG7zWk","fWK3JZfpR-Y","Os0iikG6F-c","rCmbbAsxo6Q","v558uRunpPE","TathCSGJNaU",
            "plFvmhnOhAI","plXLQSaHi68","ThRrY9zt-dw","N1sb99S7YmU","9vaSjN-1hUI","twJpayvP7Kk","lSVlbsyBx1g","2-R0erl1cVw","8nn_rgqsIjk","twJpayvP7Kk","XLSCg-lkxC0","WTGcznMADZc","B5boa1MmvBg",
    "r26BBb2ScPM","lKLAJFpHhMg","ELupesdRrxs","_u-AXe51nCI","oKeex9vkQVs","Ar5uHdpV9eg","8x59va9CaPI","uEk6qjy3QR0","tz34tDQ2t6A","PbQWbx32uak","IiiWgjTg8WI","OGLBgemerVQ","0qzFDuN4BhM","myCGlBK_WJ4","W8XyMIglceA","W8XyMIglceA"};
    String KEY13="AIzaSyD_BGSgaZ-gtpPtsWP_Y1yk-loNGBj8hAE";
    Context ctx13;
    public RecyclerAdapter13(Context context) {
        this.ctx13 = context;
    }
    @Override
    public RecyclerAdapter13.VideoInfoHolder13 onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new RecyclerAdapter13.VideoInfoHolder13(itemView);
    }
    @Override
    public void onBindViewHolder(final RecyclerAdapter13.VideoInfoHolder13 holder, final int position) {
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

        holder.youTubeThumbnailView.initialize(KEY13, new YouTubeThumbnailView.OnInitializedListener() {
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

    public class VideoInfoHolder13 extends RecyclerView.ViewHolder implements View.OnClickListener {

        protected RelativeLayout relativeLayoutOverYouTubeThumbnailView;
        YouTubeThumbnailView youTubeThumbnailView;
        protected Button button;
        TextView videoTittle;
        //protected TextView textView;
        //protected ImageView playButton;

        public VideoInfoHolder13(View itemView) {
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

            Intent intent = YouTubeStandalonePlayer.createVideoIntent((Activity) ctx13 ,KEY13 ,VideoID[getLayoutPosition()]);
            ctx13.startActivity(intent);
        }
    }
}

