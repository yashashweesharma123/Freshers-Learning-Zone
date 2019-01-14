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

public class RecyclerAdapter10  extends RecyclerView.Adapter<RecyclerAdapter10.VideoInfoHolder10> {
    String[] Title={"BASICS OF THERMODYNAMICS",
    "THERMODYNAMICS SYSTEM",
    "THERMODYNAMICS SURROUNDINGS",
    "MICROSCOPIC AND MACROSCOPIC POINT OF VIEW",
    "PROPERTY OF SYSTEM",
    "THERMODYNAMICS EQUILIBRIUM",
    "QUASI-STATIC PROCESS",
    "TYPE OF PROCESS",
    "PATH AND POINT FUNCTION",
    "ZEROTH LAW OF THERMODYNAMICS",
    "LIQUID IN GLASS THERMOMETER",
    "CONSTANT VOLUME GAS THERMOMETER",
    "THERMO COUPLE",
    "WORK AND HEAT TRANSFER",
    "DISPLACEMENT WORK",
    "FIRST LAW ",
    "ISOBARIC PROCESS",
    "ISOTHERMAL PROCESS",
    "ADIABATIC PROCESS",
    "FLOW PROCESS",
    "BALANCE IN STEADY FLOW PROCESS",
    "SFEE APPLICATIONS ON NOZZLES",
    "SFEE APPLICATIONS ON STEAM",
    "SFEE APPLICATIONS ON COMPRESSOR"};
    String[] VideoID = {"CiXDXpw9HyM","s72u-N-4FNE","wcRthycM6kg","ejjdqXXAu_8","EEWU6TdyOCE","cEO8efOojPk","W-SGenm9PZc","LRDvrXTpwfo","9CjPDXujjBY","u7odAbrUYHw",
            "6SbmWQORc0Q","UMkGwzrsYs0","7Sjn_QGduUs","1qI7Ys1Of6o","l0USlOHJJDE","C6VVk7Imosw","MKm04FOwz38","Nw_VJMTUU0o","8p6WwZ1OpFQ","kCG0WaW01-k","EaHpii3VZBg","tgi1l2tYxv4","3RK_QFHC00Q","Ny_yuf5QsZY"};
    String KEY10="AIzaSyD_BGSgaZ-gtpPtsWP_Y1yk-loNGBj8hAE";
    Context ctx10;
    public RecyclerAdapter10(Context context) {
        this.ctx10 = context;
    }
    @Override
    public RecyclerAdapter10.VideoInfoHolder10 onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new RecyclerAdapter10.VideoInfoHolder10(itemView);
    }
    @Override
    public void onBindViewHolder(final RecyclerAdapter10.VideoInfoHolder10 holder, final int position) {
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

        holder.youTubeThumbnailView.initialize(KEY10, new YouTubeThumbnailView.OnInitializedListener() {
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

    public class VideoInfoHolder10 extends RecyclerView.ViewHolder implements View.OnClickListener {

        protected RelativeLayout relativeLayoutOverYouTubeThumbnailView;
        YouTubeThumbnailView youTubeThumbnailView;
        protected Button button;
        TextView videoTittle;
        //protected TextView textView;
        //protected ImageView playButton;

        public VideoInfoHolder10(View itemView) {
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

            Intent intent = YouTubeStandalonePlayer.createVideoIntent((Activity) ctx10 ,KEY10 ,VideoID[getLayoutPosition()]);
            ctx10.startActivity(intent);
        }
    }
}

