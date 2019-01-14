package com.example.shubham.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeApiServiceUtil;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubeStandalonePlayer;
import com.google.android.youtube.player.YouTubeThumbnailLoader;
import com.google.android.youtube.player.YouTubeThumbnailView;

import static com.google.android.gms.internal.zzt.TAG;

/**
 * Created by shubham on 15-Oct-18.
 */

public class RecyclerAdapter21 extends RecyclerView.Adapter<RecyclerAdapter21.VideoInfoHolder21> {
    String[] Title={"INTRODUCTION TO NUMBER SYSTEM",
    "BINARY NUMBER SYSTEM",
    "BINARY ADDITION",
    "BINARY SUBTRACTION",
    "INTRODUCTION TO BOOLEAN ALZEBRA(PART-1)",
    "INTRODUCTION TO BOOLEAN ALZEBRA(PART-2)",
    "1's AND 2's COMPLEMENT",
    "BINARY SUBTRACTION USING 2's COMPLEMENT",
    "LOGIC GATES(PART-1)",
    "LOGIC GATES(PART-2)",
    "LOGIC GATES(PART-3)",
    "LOGIC GATES(PART-4)",
    "LOGIC GATES(PART-5)",
    "LOGIC GATES(PART-6)",
    "NAND GATE AS A UNIVERSAL GATE(PART-1)",
    "NAND GATE AS A UNIVERSAL GATE(PART-2)",
    "NOR GATE AS A UNIVERSAL GATE",
    "CANONICAL FORM-SUM OF PRODUCT(PART-1)",
    "CANONICAL FORM-SUM OF PRODUCT(PART-2)",
    "CANONICAL FORM-PRODUCT OF SUM(PART-1)",
    "CANONICAL FORM-PRODUCT OF SUM(PART-2)",
    "BOOLEAN ALGEBRA AND SIMPLIFICATION",
    "K-MAP(SOP,POS AND DONT CARE BIT)",
    "OPERATIONAL AMPLIFIER",
    "BLOCK DIAGRAM AND DISCRIPTION OF OPERATIONAL AMPLIFIER",
    "OPERATIONAL AMPLIFIER(OPEN LOOP,INVERTING,NON-INVERTING & DIFFERENTIAL MODE)",
    "OPERATIONAL AMPLIFIER INTEGRATOR CIRCUIT",
    "OPERATIONAL AMPLIFIER DIFFERENTIATOR CIRCUIT"};
    String[] VideoID = {"crSGS1uBSNQ","w7ZLvYAi6pY","Ri0VhKhw7dY","31N9tjaWZbs","WW-NPtIzHwk","OjWmVCG8PLA","S_fPMrrIA30","L_m7jBvtzpQ","xDARFvArIpc","iogRGu7nbJw",
            "TbV2lVIdfEM","1kLbY1-f4rs","9VKHu3V4wEE","bd16TkFCDjM","ChtmE09BSy0","MZ_Pd40F4MU","Z6Nds10n7rs","xnLBbOYYnHM","NGgNoa0_zns","nXsiLPJfDZ4","ihTH1C6qCYI","AnQsznjccUw","CCmf8wdc8cU","kiiA6WTCQn0","c5XDuaNSIMs","TVpHXnPL1hg","GVEIk0B3ky0","Yx6e_70NBnY"};
    String KEY21="AIzaSyD_BGSgaZ-gtpPtsWP_Y1yk-loNGBj8hAE";
    Context ctx21;
    //private boolean readyForLoadingYoutubeThumbnail = true;
    public RecyclerAdapter21(Context context) {
        this.ctx21 = context;
    }
    @Override
    public RecyclerAdapter21.VideoInfoHolder21 onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new RecyclerAdapter21.VideoInfoHolder21(itemView);
    }
    @Override
    public void onBindViewHolder(final RecyclerAdapter21.VideoInfoHolder21 holder, final int position) {
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

        holder.youTubeThumbnailView.initialize(KEY21, new YouTubeThumbnailView.OnInitializedListener() {
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

    public class VideoInfoHolder21 extends RecyclerView.ViewHolder implements View.OnClickListener {

        protected RelativeLayout relativeLayoutOverYouTubeThumbnailView;
        YouTubeThumbnailView youTubeThumbnailView;
        protected Button button;
        TextView videoTittle;
        //protected TextView textView;
        //protected ImageView playButton;

        public VideoInfoHolder21(View itemView) {
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

            Intent intent = YouTubeStandalonePlayer.createVideoIntent((Activity) ctx21 ,KEY21 ,VideoID[getLayoutPosition()]);
            ctx21.startActivity(intent);
        }
    }
}

