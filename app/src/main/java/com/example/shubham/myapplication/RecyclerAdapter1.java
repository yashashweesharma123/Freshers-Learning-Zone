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
 * Created by shubham on 10-Oct-18.
 */

public class RecyclerAdapter1 extends RecyclerView.Adapter<RecyclerAdapter1.VideoInfoHolder1> {
    String[] Title={"INTERFERENCE OF LIGHT",
    "INTERFERNCE AND DIFFRACTION",
    "COHERENT SOURCES OF LIGHT",
    "FRESNELS BIPRISM",
    "FRESNELS BIPRISM(EXP1)",
    "FRESNELS BIPRISM(EXP2)",
    "YDSE PART 1",
    "YDSE PART 2",
    "DIFFRACTION OF LIGHT",
    "DIFFRACTION GRATING",
    "DIFFRACITON DUE TO SINGLE SLIT",
    "Polarization of Light",
    "NEWTONS RINGS EXPERIMENT",
    "ORDINARY AND EXTRA ORDINARY RAYS",
    "Polarized light and optical acitivity"};
    String[] VideoID = {"CAe3lkYNKt8", "oYFEWoxuB1I", "Z6TQSVLMKE4","oKAsZIbOe0c","DfqaYpXYSDY","qUYU5WV0V5Q","MDX3qb_BMs4","Dze26GQK4o0","mNQW5OShMA","EUA8KYv-je4","h9xx3pXFW-g","6_C8KyU67RU" ,"dsociG2sXGM","iRwagObFrPM","q-YhdLDbe5o"};
    String KEY1="AIzaSyD_BGSgaZ-gtpPtsWP_Y1yk-loNGBj8hAE";
    Context ctx1;
    public RecyclerAdapter1(Context context) {
        this.ctx1 = context;
    }
    @Override
    public RecyclerAdapter1.VideoInfoHolder1 onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new RecyclerAdapter1.VideoInfoHolder1(itemView);
    }
    @Override
    public void onBindViewHolder(final RecyclerAdapter1.VideoInfoHolder1 holder, final int position) {
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

        holder.youTubeThumbnailView.initialize(KEY1, new YouTubeThumbnailView.OnInitializedListener() {
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

    public class VideoInfoHolder1 extends RecyclerView.ViewHolder implements View.OnClickListener {

        protected RelativeLayout relativeLayoutOverYouTubeThumbnailView;
        YouTubeThumbnailView youTubeThumbnailView;
        protected Button button;
        TextView videoTittle;
        //protected TextView textView;
        //protected ImageView playButton;

        public VideoInfoHolder1(View itemView) {
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

            Intent intent = YouTubeStandalonePlayer.createVideoIntent((Activity) ctx1 ,KEY1 ,VideoID[getLayoutPosition()]);
            ctx1.startActivity(intent);
        }
    }
}


