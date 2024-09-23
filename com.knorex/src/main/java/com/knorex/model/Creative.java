package com.knorex.model;

import java.util.List;

public class Creative {
	
	private List<CompanionBanner> companionBanners;
    private String clickThroughUrl;
    private String duration;
    private List<TrackingEvent> trackingEvents;
    private List<VideoClick> videoClicks;
    private List<MediaFile> mediaFiles;
    
    public Creative() {
    	super();
    }

	public Creative(List<CompanionBanner> companionBanners, String clickThroughUrl, String duration,
			List<TrackingEvent> trackingEvents, List<VideoClick> videoClicks, List<MediaFile> mediaFiles) {
		super();
		this.companionBanners = companionBanners;
		this.clickThroughUrl = clickThroughUrl;
		this.duration = duration;
		this.trackingEvents = trackingEvents;
		this.videoClicks = videoClicks;
		this.mediaFiles = mediaFiles;
	}

	public List<CompanionBanner> getCompanionBanners() {
		return companionBanners;
	}

	public void setCompanionBanners(List<CompanionBanner> companionBanners) {
		this.companionBanners = companionBanners;
	}

	public String getClickThroughUrl() {
		return clickThroughUrl;
	}

	public void setClickThroughUrl(String clickThroughUrl) {
		this.clickThroughUrl = clickThroughUrl;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public List<TrackingEvent> getTrackingEvents() {
		return trackingEvents;
	}

	public void setTrackingEvents(List<TrackingEvent> trackingEvents) {
		this.trackingEvents = trackingEvents;
	}

	public List<VideoClick> getVideoClicks() {
		return videoClicks;
	}

	public void setVideoClicks(List<VideoClick> videoClicks) {
		this.videoClicks = videoClicks;
	}

	public List<MediaFile> getMediaFiles() {
		return mediaFiles;
	}

	public void setMediaFiles(List<MediaFile> mediaFiles) {
		this.mediaFiles = mediaFiles;
	}

	@Override
	public String toString() {
		return "Creative [clickThroughUrl=" + clickThroughUrl + ", duration=" + duration + "]";
	}
   
}
