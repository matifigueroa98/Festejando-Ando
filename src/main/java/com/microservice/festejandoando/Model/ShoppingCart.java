package com.microservice.festejandoando.Model;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "ShoppingCart")
public class ShoppingCart {

	ArrayList <Topic> topic = new ArrayList <> ();

	public ShoppingCart() {
	}
	
	public ShoppingCart(ArrayList<Topic> topic) {
		this.topic = topic;
	}

	public ArrayList<Topic> getTopic() {
		return topic;
	}

	public void setTopic(ArrayList<Topic> topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "ShoppingCart [topic=" + topic + "]";
	}
	
}
