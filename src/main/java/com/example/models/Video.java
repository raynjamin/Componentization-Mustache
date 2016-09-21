package com.example.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ben on 9/21/16.
 */
public class Video {
    private String src;
    private String thumbnail;
    private String title;
    private List<Video> relatedVideos;

    public Video() {
        relatedVideos = new ArrayList<>();
    }

    public Video(String src, String thumbnail, String title) {
        this();
        this.src = src;
        this.thumbnail = thumbnail;
        this.title = title;
    }

    public List<Video> getRelatedVideos() {
        return relatedVideos;
    }

    public void setRelatedVideos(List<Video> relatedVideos) {
        this.relatedVideos = relatedVideos;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
