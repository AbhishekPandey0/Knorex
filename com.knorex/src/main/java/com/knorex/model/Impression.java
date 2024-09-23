package com.knorex.model;

public class Impression {
	
	private String id;
    private String url;
    
    public Impression() {
    	super();
    }

	public Impression(String id, String url) {
		super();
		this.id = id;
		this.url = url;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Impression [id=" + id + ", url=" + url + "]";
	}
}
