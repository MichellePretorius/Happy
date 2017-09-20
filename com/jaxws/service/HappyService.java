package com.jaxws.service;

import com.jaxws.bean.Store;

/**
 * This is a Swing program that updates a counter each time the Happy button
 * is clicked. Mangers are able to read from this data store (In the form of a Map)
 * to compare their store with the top Store to see how their store is performing. 
 * 
 * @author Michelle Pretorius
 * @version September 2017
 *
 */

public interface HappyService {
	
	public boolean addStore(Store s);
	
	public boolean deleteStore(int id);
	
	public Store getStore(int id);
	
	public Store[] getAllStores();
	
	public int addHappiness(Store s, int i);
	
	

}
