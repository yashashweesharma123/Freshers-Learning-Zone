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

public class RecyclerAdapter8 extends RecyclerView.Adapter<RecyclerAdapter8.VideoInfoHolder8> {
    String[] Title={"Arrays in C Programming",
    "One Dimensional Array in C",
    "Two and Multi Dimensional Array in C",
    "Array of Pointers in C",
    "Array within Structure in C",
    "Array of Structure in C",
    "Pointers and Arrays in C",
    "Passing Array to a function",
    "Passing Structure as a Function Argument in C",
    "Addition and Multiplication of Two Array in C",
    "Program to Merge Two Arrays and Sort It In Third Array in C",
    "Arrays of Strings in C",
    "Intro to C Functions",
    "Function Declaration and Call in C",
    "Function Definition in C",
    "Return Type and Arguments in Function in C",
    "Category of Functions in C",
    "Function with No Arguments and No Return Value in C",
    "Function with Arguments and No Return Value in C",
    "Function with No Arguments and Return Value in C",
    "Function with Arguments and Return Value",
    "Nesting of Functions in C",
    "Recursion in C",
    "Passing Structure as a Function Argument in C",
    "Introduction to pointers in C",
    "Working with pointers",
    "Pointer types, pointer arithmetic, void pointers",
    "Pointers to Pointers in C",
    "Pointers as function arguments - call by reference",
    "Pointers and arrays",
    "Character arrays and pointers - part 1",
    "Pointers and multidimensional arrays"};
    String[] VideoID = {"ixLHwaWAtdM","cscUPrRWnmQ","vNfWeXMafqo","9sWQ5Jds1jQ","_pybIn1yuY4","2PjtV9-QyOE","6dRoZqbW4vM","CoSEjV-2Yu0","YeOC6ZCCo7A","aOlW_Un6_n4","cJpvEcUdtOo","x6cUOyzzjKU","rsHFHOilCU0","ZyTmWjWc5Eg","Zw6vzekBuys",
    "tdvnkqc308w","mg5BclpRSXE","Dt9q3qiaqiA","qVaCC7eUPxc","w0EyaGCbYw8","a_SMgTBehLU","GHFBAN5R9v8","HSRM1w1BWqg","YeOC6ZCCo7A","h-HBipu_1P0","X1DcpcgSUXw","JTttg85xsbo","d3kd5KbGB48","LW8Rfh6TzGg","ASVB8KAFypk","Bf8a6IC1dE8","_j5lhHWkbnQ"};
    String KEY8="AIzaSyD_BGSgaZ-gtpPtsWP_Y1yk-loNGBj8hAE";
    Context ctx8;
    public RecyclerAdapter8(Context context) {
        this.ctx8 = context;
    }
    @Override
    public RecyclerAdapter8.VideoInfoHolder8 onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new RecyclerAdapter8.VideoInfoHolder8(itemView);
    }
    @Override
    public void onBindViewHolder(final RecyclerAdapter8.VideoInfoHolder8 holder, final int position) {
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

        holder.youTubeThumbnailView.initialize(KEY8, new YouTubeThumbnailView.OnInitializedListener() {
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

    public class VideoInfoHolder8 extends RecyclerView.ViewHolder implements View.OnClickListener {

        protected RelativeLayout relativeLayoutOverYouTubeThumbnailView;
        YouTubeThumbnailView youTubeThumbnailView;
        protected Button button;
        TextView videoTittle;
        //protected TextView textView;
        //protected ImageView playButton;

        public VideoInfoHolder8(View itemView) {
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

            Intent intent = YouTubeStandalonePlayer.createVideoIntent((Activity) ctx8 ,KEY8 ,VideoID[getLayoutPosition()]);
            ctx8.startActivity(intent);
        }
    }
}

