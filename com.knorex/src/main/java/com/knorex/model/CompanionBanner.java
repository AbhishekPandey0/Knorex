package com.knorex.model;

public class CompanionBanner {

    private String id;
    private int width;
    private int height;
    private String type;
    private String source;
    
    public CompanionBanner() {
    	super();
    }

	public CompanionBanner(String id, int width, int height, String type, String source) {
		super();
		this.id = id;
		this.width = width;
		this.height = height;
		this.type = type;
		this.source = source;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "CompanionBanner [id=" + id + ", width=" + width + ", height=" + height + ", type=" + type + ", source="
				+ source + "]";
	}
}
