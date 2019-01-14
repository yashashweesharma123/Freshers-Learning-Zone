package com.example.shubham.myapplication;

/**
 * Created by shubham on 07-Oct-18.
 */

public class YouTubeVideos {
    String videoUrl;
    public YouTubeVideos() {
    }
    public YouTubeVideos(String videoUrl) {
        this.videoUrl = videoUrl;
    }
    public String getVideoUrl() {
        return videoUrl;
    }
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}