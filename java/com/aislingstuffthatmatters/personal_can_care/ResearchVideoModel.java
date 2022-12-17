package com.aislingstuffthatmatters.personal_can_care;

public class ResearchVideoModel {

    String video;
    String videoLocation;

    public ResearchVideoModel() {

    }

    public ResearchVideoModel(String video, String videoLocation){
        this.video = video;
        this.videoLocation = videoLocation;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getVideoLocation() {
        return videoLocation;
    }

    public void setVideoLocation(String videoLocation) {
        this.videoLocation = videoLocation;
    }

}
