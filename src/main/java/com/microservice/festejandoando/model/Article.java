package com.microservice.festejandoando.model;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "Article")
public class Article extends PersistentObject {

	private String name;
	private String image;
	@ManyToOne
	@JoinColumn(name = "topic_id")// foreing_key column name
	private Topic topic;
	

	public Article() {
	}

	public Article(Long id, Boolean active, String name, String image, Topic topic) {
		super(id, active);
		this.name = name;
		this.image = image;
		this.topic = topic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "Article [name=" + name + ", image=" + image + ", topic=" + topic + "]";
	}

}
