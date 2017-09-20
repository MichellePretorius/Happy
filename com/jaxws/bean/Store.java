package com.jaxws.bean;

import java.io.Serializable;

/**
 * This is a Swing program that updates a counter each time the Happy button
 * is clicked. This counter is then persisted to the data store. Mangers are
 * able to read from this data store to compare their store with the top Store
 * to see how their store is performing. 
 * 
 * @author Michelle Pretorius
 * @version September 2017
 *
 */

public class Store implements Serializable {

	private static final long serialVersionUID = -8692744303904007991L;
	
	private int id;
	private String name;
	private String manager;
	private int happinessCounter;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getManager() {
		return manager;
	}
	
	public void setManager(String manager) {
		this.manager = manager;
	}
	
	public int getHappinessCounter() {
		return happinessCounter;
	}
	
	public void setHappinessCounter(int happinessCounter) {
		this.happinessCounter = happinessCounter;
	}
	
	public String toString() {
		return id+"::"+name+"::"+manager+"::"+happinessCounter;
	}
	

}
