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

public class RecyclerAdapter16 extends RecyclerView.Adapter<RecyclerAdapter16.VideoInfoHolder16> {
    String[] Title={"INTRODUCTION TO CIRCUIT PARAMETERS",
    "KIRCHOFF'S CURRENT LAW",
    "KIRCHOFF'S VOLTAGE LAW",
    "MESH ANALYSIS",
    "NORTON THEOREM",
    "THEVENINS THEOREM",
    "MAX POWER TRANSFER THEOREM",
    "SUPERPOSITION THEOREM",
    "STAR AND DELTA CONNECTION",
    "THREE PHASE CIRCUIT(STAR CONNECTION)",
    "THREE PHASE CIRCUIT(DELTA CONNECTION)",
    "RMS AND AVG VALUE OF AC SIGNALS",
    "PHASOR AND PHASOR DIAGRAM",
    "CONCEPT OF PHASOR DIAGRAM(BEST EXPLAINED)",
    "PHASOR DIAGRAM(RL,RC AND RLC CIRCUIT)",
    "AC CIRCUIT ANALYSIS"};
    String[] VideoID = {"777WPL-bx8w","n__cezo9R1U","dlROTnDbULo","3DDm2wR1MF8","qw0QExrzoYg","-jqmPMy8hHM","-jqmPMy8hHM","mfFh3c-b07w","RRUL7vCHelo","P-mXM1Gvn4g",
            "jPFWb_4bf2s","qDHsokTcgck","zlmwmvijn1Y","lWteL-v7bpw","HaFrY0qQ-NU","FE9QNX6O6kk"};
    String KEY16="AIzaSyD_BGSgaZ-gtpPtsWP_Y1yk-loNGBj8hAE";
    Context ctx16;
    public RecyclerAdapter16(Context context) {
        this.ctx16 = context;
    }
    @Override
    public RecyclerAdapter16.VideoInfoHolder16 onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new RecyclerAdapter16.VideoInfoHolder16(itemView);
    }
    @Override
    public void onBindViewHolder(final RecyclerAdapter16.VideoInfoHolder16 holder, final int position) {
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

        holder.youTubeThumbnailView.initialize(KEY16, new YouTubeThumbnailView.OnInitializedListener() {
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

    public class VideoInfoHolder16 extends RecyclerView.ViewHolder implements View.OnClickListener {

        protected RelativeLayout relativeLayoutOverYouTubeThumbnailView;
        YouTubeThumbnailView youTubeThumbnailView;
        protected Button button;
        TextView videoTittle;
        //protected TextView textView;
        //protected ImageView playButton;

        public VideoInfoHolder16(View itemView) {
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

            Intent intent = YouTubeStandalonePlayer.createVideoIntent((Activity) ctx16 ,KEY16 ,VideoID[getLayoutPosition()]);
            ctx16.startActivity(intent);
        }
    }
}


