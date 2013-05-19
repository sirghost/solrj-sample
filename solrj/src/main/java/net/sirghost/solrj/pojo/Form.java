package net.sirghost.solrj.pojo;

import org.apache.solr.client.solrj.beans.Field;

public class Form {

	@Field("form_url")
	private String url;
	
	@Field("form_title")
	private String title;
	
	@Field("form_description")
	private String description;
	
	@Field("form_policy")
	private int policy;	

	public Form() {}

	public Form(String url, String title, String description, int policy) {
		this.url = url;
		this.title = title;
		this.description = description;
		this.policy = policy;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
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
	public int getPolicy() {
		return policy;
	}
	public void setPolicy(int policy) {
		this.policy = policy;
	}	
}