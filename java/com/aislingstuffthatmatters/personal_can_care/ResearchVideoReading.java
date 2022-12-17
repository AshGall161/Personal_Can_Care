package com.aislingstuffthatmatters.personal_can_care;

public class ResearchVideoReading {

    private String video;
    private String videoLocation;

    public ResearchVideoReading() {

    }

    public ResearchVideoReading(String video, String videoLocation) {
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
