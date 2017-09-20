package com.jaxws.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.jaxws.bean.Store;

/**
 * This program that updates a counter each time the Happy button
 * is clicked. Mangers are able to read from this data store (In the form of a Map)
 * to compare their store with the top Store
 * to see how their store is performing. 
 * 
 * @author Michelle Pretorius
 * @version September 2017
 *
 */

public class HappyServiceImpl implements HappyService {
	

	private static Map<Integer, Store> stores = new HashMap<Integer, Store>();
	

	@Override
	public boolean addStore(Store s) {
		if (stores.get(s.getId()) != null) return false;
		stores.put(s.getId(), s);
		return true;
	}
	
	@Override
	public boolean deleteStore(int id) {
		if (stores.get(id) == null ) return false;
		stores.remove(id);
		return true;
		
	}

	@Override
	public Store getStore(int id) {
		return stores.get(id);
	}

	@Override
	public Store[] getAllStores() {
		Set<Integer> ids = stores.keySet();
		Store[] s = new Store[ids.size()];
		int i=0;
		for(Integer id : ids) {
			s[i] = stores.get(id);
			i++;
		}
		
		return s;
	}

	@Override
	public int addHappiness(Store s, int i) {
		return s.getHappinessCounter() + i;
	}

	
}
