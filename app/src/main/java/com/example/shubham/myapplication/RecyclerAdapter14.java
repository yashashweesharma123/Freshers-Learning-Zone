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

public class RecyclerAdapter14 extends RecyclerView.Adapter<RecyclerAdapter14.VideoInfoHolder14> {
    String[] Title={"CENTROID AND CENTRE OF GRAVITY",
    "CENTROID OF SOME PLANE FIGURES",
    "PROBLEMS ON CENTROID",
    "CENTROID FOR T-SECTION",
    "CENTROID OF A I-SECTION",
    "CENTROID FOR CHANNEL SECTION( PART 1)",
    "CENTROID FOR CHANNEL SECTION( PART 2)",
    "PROBLEMS ON CENTROID",
    "PROBLEMS ON CENTROID CUT-OUT SECTION( P1)",
    "PROBLEMS ON CUT-OUT SECTION(P2)",
    "CENTRE OF GRAVITY FOR SOME SOLIDS",
    "CENTROID AND COG FOR COMPOSITE SOLIDS",
    "CONCEPT AND DEFINITION OF MOMENT OF INERTIA",
    "RADIUS OF GYRATION",
    "MOI FOR PLANE FIGURES",
    "PARALLEL AXIS THEOREM",
    "PERPENDICULAR AXIS THEOREM",
    "MOI OF HOLLOW CIRCLE",
    "MOI OF SEMI-CIRCLE",
    "PROBLEM OF MOI IN SYMMETRICAL I-SECTION",
    "PROBLEM OF MOI IN SYMMETRICAL I-SECTION",
    "MOI FOR CUT-OUT SECTION( P1)",
    "MOI FOR CUT-OUT SECTION( P2)",
    "CONCEPT OF SHEAR FORCE AND BENDING MOMENT",
    "TYPES OF BEAMS",
    "PROBLEMS ON SHEAR FORCE AND BENDING MOMENT(P1)",
    "PROBLEMS ON SHEAR FORCE AND BENDING MOMENT(P2)",
    "PROBLEMS ON SHEAR FORCE AND BENDING MOMENT(P3)",
    "PROBLEMS ON SHEAR FORCE AND BENDING MOMENT(P4.1)",
    "PROBLEMS ON SHEAR FORCE AND BENDING MOMENT(P4.2)",
    "BEAM REACTION (P1)",
    "BEAM REACTION (P2)",
    "BEAM REACTION (P3)",
    "BEAM REACTION (P4)",
    "BEAM REACTION (P5)"};



    String[] VideoID = {"6E7hq1Ipq9U","umXye72SkMY","syAwvdK6wmA","1bt52bsf5lI","zOBjurNOoY8","RSCwiJhtuv4","2LNe2s4RO94","CulCvb72eUE","TKN6FmSbgaI","LUpP-PBIKBA",
            "ihe0Fz5rqbk","7uvPjg-IL_g","-ycm-87c50g","Rci05NEd23o","mvxi3cXoT-0","4M94dgM8OCk","ABBGeZsH5Gw","Sima6lQw_48","H_LjOwWS9Ag","4vFgDXPhZ04","Kp6vhLmYD2k","tpv2SzduxJc","bZ3Ne2mSEQ0","UahfUvcS24o","LWuEdZPGbI4",
    "7WD3fCnA2jY","frH1mN8K3mQ","l5YZu1DdFu8","zCxXRdgZcLA","Y-kY3NUecwU","wZdqtXp-trg","qzSJx7hgKiM","p5Cj58zHSHs","0fgo1u2LHh0","tWO4xBo6BXU"};
    String KEY14="AIzaSyD_BGSgaZ-gtpPtsWP_Y1yk-loNGBj8hAE";
    Context ctx14;
    public RecyclerAdapter14(Context context) {
        this.ctx14 = context;
    }
    @Override
    public RecyclerAdapter14.VideoInfoHolder14 onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new RecyclerAdapter14.VideoInfoHolder14(itemView);
    }
    @Override
    public void onBindViewHolder(final RecyclerAdapter14.VideoInfoHolder14 holder, final int position) {
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

        holder.youTubeThumbnailView.initialize(KEY14, new YouTubeThumbnailView.OnInitializedListener() {
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

    public class VideoInfoHolder14 extends RecyclerView.ViewHolder implements View.OnClickListener {

        protected RelativeLayout relativeLayoutOverYouTubeThumbnailView;
        YouTubeThumbnailView youTubeThumbnailView;
        protected Button button;
        TextView videoTittle;
        //protected TextView textView;
        //protected ImageView playButton;

        public VideoInfoHolder14(View itemView) {
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

            Intent intent = YouTubeStandalonePlayer.createVideoIntent((Activity) ctx14 ,KEY14 ,VideoID[getLayoutPosition()]);
            ctx14.startActivity(intent);
        }
    }
}

