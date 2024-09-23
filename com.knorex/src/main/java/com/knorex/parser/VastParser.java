package com.knorex.parser;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.swing.text.Document;
import javax.swing.text.Element;

import org.jdom2.input.SAXBuilder;

import com.knorex.model.VastModel;

public class VastParser {
	
	public VastModel parseVastXml(String filePath) throws IOException {
        VastModel vastModel = new VastModel();
        SAXBuilder saxBuilder = new SAXBuilder();
        try {
            Document document = saxBuilder.build(new File(filePath));
            Element rootElement = document.getRootElements();
            vastModel.setVersion(rootElement.getAttributeValue("version"));
            Element adElement = rootElement.getChild("Ad");
            Element inLineElement = adElement.getChild("InLine");

            vastModel.setId(adElement.getAttributeValue("id"));
            vastModel.setTitle(inLineElement.getChildText("AdTitle"));
            vastModel.setDescription(inLineElement.getChildText("Description"));

            Element impressionElement = inLineElement.getChild("Impression");
            VastModel.Impression impression = new VastModel.Impression();
            impression.setId(impressionElement.getAttributeValue("id"));
            impression.setUrl(impressionElement.getText());
            vastModel.setImpression(impression);

            List<VastModel.Creative> creatives = new ArrayList<>();
            for (Element creativeElement : inLineElement.getChildren("Creative")) {
                VastModel.Creative creative = new VastModel.Creative();
                // Parse companion banners, tracking events, video clicks, and media files
                creatives.add(creative);
            }
            vastModel.setCreatives(creatives);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return vastModel;
    }
}
