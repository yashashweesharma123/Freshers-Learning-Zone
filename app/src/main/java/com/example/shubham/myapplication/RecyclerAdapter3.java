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

public class RecyclerAdapter3 extends RecyclerView.Adapter<RecyclerAdapter3.VideoInfoHolder3> {
    String[] Title={"Refernce frames and Principle of relativity",
    "Galilean Transformation Equation",
    "Michelson-Morley Experiment",
    "Einstein's Theory of relativity",
    "Lorentz Transformation",
    "Length Contraction and Special Relativity",
    "Time dilation",
    "Galilean Transformation Equations for Velocity",
    "MassEnergy equivalence(Rest MassEnergy)",
    "Relativistic Momentum",
    "deBroglie Hypothesis",
    "Wave Particle Duality",
    "Relation between phase velocity and group velocity",
    "X-ray diffraction and Bragg's Law",
    "Cromptons Effect"};
    String[] VideoID = {"ng6ANMGNlpg", "QRKtQKCbEII", "Ui0WPRTVkNM","ev9zrt__lec","EhXWiAJBmzc","NdAE6TAP2t8","-OZzE_hr-j0","NH3_lIkSB9s","5nTQ7bnkarM","dwWm4ij85lQ","XCHHHdd0zG8","eYOcuYhnrCU" ,"FEV2Zhz3yY4","aFyjUhFCL5Q","3Jz0wGKgtAM"};
    String KEY3="AIzaSyD_BGSgaZ-gtpPtsWP_Y1yk-loNGBj8hAE";
    Context ctx3;
    public RecyclerAdapter3(Context context) {
        this.ctx3 = context;
    }
    @Override
    public RecyclerAdapter3.VideoInfoHolder3 onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new RecyclerAdapter3.VideoInfoHolder3(itemView);
    }
    @Override
    public void onBindViewHolder(final RecyclerAdapter3.VideoInfoHolder3 holder, final int position) {
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

        holder.youTubeThumbnailView.initialize(KEY3, new YouTubeThumbnailView.OnInitializedListener() {
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

    public class VideoInfoHolder3 extends RecyclerView.ViewHolder implements View.OnClickListener {

        protected RelativeLayout relativeLayoutOverYouTubeThumbnailView;
        YouTubeThumbnailView youTubeThumbnailView;
        protected Button button;
        TextView videoTittle;
        //protected TextView textView;
        //protected ImageView playButton;

        public VideoInfoHolder3(View itemView) {
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

            Intent intent = YouTubeStandalonePlayer.createVideoIntent((Activity) ctx3 ,KEY3 ,VideoID[getLayoutPosition()]);
            ctx3.startActivity(intent);
        }
    }
}


