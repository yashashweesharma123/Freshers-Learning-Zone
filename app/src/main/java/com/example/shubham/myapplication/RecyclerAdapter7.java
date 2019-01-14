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

import org.w3c.dom.Text;

/**
 * Created by shubham on 15-Oct-18.
 */

public class RecyclerAdapter7 extends RecyclerView.Adapter<RecyclerAdapter7.VideoInfoHolder7> {
    //String[] Title={"yash","vaibhav","sanchit","apoorv","bata"};

    String[] Title = {"Introduction to C Program",
            "Variables and Keywords",
            "First C program",
            "Data Type and Operators",
            "Data Type Conversion",
            "Associativity of Operators",
            "printf() and scanf()",
            "Difference between Assignment and Comaprison Operator",
            "Post Increment and Pre Increment",
            "Decision Control -if Statement",
            "Programs on If-Else and Nested If",
            "Logical Operators",
            "Programs on Logical Operators and Ternary Operators",
            "Introduction to Looping",
            "For Loop Introduction",
            "Some Conclusions of For Loop",
            "While Loop",
            "Nested For Loop",
            "Nested Loop Programs (Pattern 1)",
            "Nested Loop Programs (Pattern 2)",
            "Prime number Program & Break Statement",
            "Continue Statement",
            "Do while Loop (Introduction)",
            "Do while Loop (Programs)",
            "Difference b/w while and do while loop",
            "Dynamic Structure of For Loop",
            "Difference b/w For loop and while Loop"
           };
    String[] VideoID = {"5KKgA50wS1s","-emudKEY4PM","XsxIe973pQk","K3FcTsIYuto","0cVuM18bF9w","LUAMDo9iAu0","FNJzxrRn1fA","HxyhgVE3Ewo","cQm_qz2868I","8KTTrVJSQzk","OcUMpigR71g","hUhOn4gXsf8","igd39cj3dKQ",
    "3woKgCd2oHg","M2o6gTrn5Ic","cBlOMWRq11k","LdExSly9pCI","LoVm2eyIIPs","4Bl0ALfLNeE","CRGvOOSsmS8","799RcLo8x6w","qt9GTqnksxY","ZglIGjGodHs","hG-5_rBK0QM","be-DRUTybpg","asB0hulEAAo","5Wx2UqIFBxw"};
    String KEY7="AIzaSyD_BGSgaZ-gtpPtsWP_Y1yk-loNGBj8hAE";
    Context ctx7;
    public RecyclerAdapter7(Context context) {
        this.ctx7 = context;
    }
    @Override
    public RecyclerAdapter7.VideoInfoHolder7 onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new RecyclerAdapter7.VideoInfoHolder7(itemView);
    }
    @Override
    public void onBindViewHolder(final RecyclerAdapter7.VideoInfoHolder7 holder, final int position) {

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

        holder.youTubeThumbnailView.initialize(KEY7, new YouTubeThumbnailView.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubeThumbnailView youTubeThumbnailView, YouTubeThumbnailLoader youTubeThumbnailLoader) {
                //youTubeThumbnailLoader.setPlaylist(Title[position]);

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

    public class VideoInfoHolder7 extends RecyclerView.ViewHolder implements View.OnClickListener {

        protected RelativeLayout relativeLayoutOverYouTubeThumbnailView;
        //TextView textView;
        YouTubeThumbnailView youTubeThumbnailView;
        protected Button button;
        TextView videoTittle;
        //protected TextView textView;
        //protected ImageView playButton;

        public VideoInfoHolder7(View itemView) {
            super(itemView);
            //textView=(TextView) itemView.findViewById(R.id.textview);
            //textView=(TextView) itemView.findViewById(R.id.textView);
            button=(Button) itemView.findViewById(R.id.button);
            //  playButton=(ImageView)itemView.findViewById(R.id.btnYoutube_player);
            //String KEY=new String("KEY");
            button.setOnClickListener(this);
            //relativeLayoutOverYouTubeThumbnailView = (RelativeLayout) itemView.findViewById(R.id.relativeLayout_over_youtube_thumbnail);
            youTubeThumbnailView = (YouTubeThumbnailView) itemView.findViewById(R.id.youtube_thumbnail);
            // this is for the video tittle
            videoTittle = (TextView) itemView.findViewById(R.id.videoTittle);
        }

        @Override
        public void onClick(View v) {

            Intent intent = YouTubeStandalonePlayer.createVideoIntent((Activity) ctx7 ,KEY7 ,VideoID[getLayoutPosition()]);
            ctx7.startActivity(intent);
        }
    }
}


