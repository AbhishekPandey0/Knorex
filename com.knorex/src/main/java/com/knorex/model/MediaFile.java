package com.knorex.model;

public class MediaFile {

    private String type;
    private int bitrate;
    private int width;
    private int height;
    private String source;
    
    public MediaFile() {
    	super();
    }

	public MediaFile(String type, int bitrate, int width, int height, String source) {
		super();
		this.type = type;
		this.bitrate = bitrate;
		this.width = width;
		this.height = height;
		this.source = source;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getBitrate() {
		return bitrate;
	}

	public void setBitrate(int bitrate) {
		this.bitrate = bitrate;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "MediaFile [type=" + type + ", bitrate=" + bitrate + ", width=" + width + ", height=" + height
				+ ", source=" + source + "]";
	}
}
