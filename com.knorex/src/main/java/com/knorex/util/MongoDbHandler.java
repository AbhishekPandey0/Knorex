package com.knorex.util;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import java.util.stream.Collectors;

import org.bson.Document;
import org.bson.types.ObjectId;

public class MongoDbHandler {
	private MongoDatabase database;

	public MongoDBHandler(String uri, String dbName) {
		MongoClient mongoClient = MongoClients.create(uri);
	    this.database = mongoClient.getDatabase(dbName);
	    }
	public void insertVastData(VastModel vastModel) {
		MongoCollection<Document> collection = database.getCollection("vastData");
		Document doc = new Document("version", vastModel.getVersion()).append("id", vastModel.getId())
	                .append("title", vastModel.getTitle())
	                .append("description", vastModel.getDescription())
	                .append("impression", new Document("id", vastModel.getImpression().getId())
	                        .append("url", vastModel.getImpression().getUrl()))
	                .append("creatives", vastModel.getCreatives().stream().map(creative -> new Document()
	                        // Add creative fields here
	                ).collect(Collectors.toList()));
	        collection.insertOne(doc);
	    }

	    public Document getVastDataById(String id) {
	        MongoCollection<Document> collection = database.getCollection("vastData");
	        return collection.find(new Document("_id", new ObjectId(id))).first();
	    }
	}

}
