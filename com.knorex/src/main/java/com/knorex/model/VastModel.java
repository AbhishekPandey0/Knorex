package com.knorex.model;

import java.util.List;

public class VastModel {
	
	private String version;
    private String id;
    private String title;
    private String description;
    private Impression impression;
    private List<Creative> creatives;
    
	public VastModel() {
		super();
	}

	public VastModel(String version, String id, String title, String description, Impression impression,
			List<Creative> creatives) {
		super();
		this.version = version;
		this.id = id;
		this.title = title;
		this.description = description;
		this.impression = impression;
		this.creatives = creatives;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Impression getImpression() {
		return impression;
	}

	public void setImpression(Impression impression) {
		this.impression = impression;
	}

	public List<Creative> getCreatives() {
		return creatives;
	}

	public void setCreatives(List<Creative> creatives) {
		this.creatives = creatives;
	}

	@Override
	public String toString() {
		return "VastModel [version=" + version + ", id=" + id + ", title=" + title + ", description=" + description
				+ "]";
	}

}
