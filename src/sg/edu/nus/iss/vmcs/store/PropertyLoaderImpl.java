/*
 * Copyright 2003 ISS.
 * The contents contained in this document may not be reproduced in any
 * form or by any means, without the written permission of ISS, other
 * than for the purpose for which it has been supplied.
 *
 */
package sg.edu.nus.iss.vmcs.store;

import java.io.IOException;
import java.util.Properties;

/**
 * This implementor provides the generic functionality required to initialize the stores.
 * 
 * @see CashStore
 * @see CashStoreItem
 * @see Coin
 * @see DrinksBrand
 * @see DrinksStore
 * @see DrinksStoreItem
 * @see Store
 * @see StoreController
 * @see StoreItem
 * @see StoreObject
 * 
 * @version 3.0 5/07/2003
 * @author Olivo Miotto, Pang Ping Li
 */
public abstract class PropertyLoaderImpl {

	private static final String PROP_NUM_ITEMS = "NumOfItems";
	
	protected Properties prop;
	
	/**
	 * This method reads the properties file into a hash table.
	 * @throws IOException if fail to read properties from properties file.
	 */
	public abstract void initialize() throws IOException;
	
	/**
	 * This method writes the properties from the hash table to the file.
	 * @throws IOException if fail to save properties to properties file.
	 */
	public abstract void saveProperty() throws IOException; 
	
	/**
	 * This method returns the number of items (either CashStoreItem or DrinkStoreItem)
	 * stored in the hash table.
	 * @return the number of items.
	 */
	public int getNumOfItems() {
		String nm = prop.getProperty(PROP_NUM_ITEMS);
		int nmi;
		nmi = Integer.parseInt(nm);
		return nmi;
	}
	
	/**
	 * This method sets the number of items (either CashStoreItem or DrinkStoreItem) stored in the hash table.
	 * @param vl the number of items.
	 */
	public void setNumOfItems(int numItems) {
		prop.setProperty(PROP_NUM_ITEMS, String.valueOf(numItems));
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}
	
	/**
	 * This method retrieve the value from the hash table.
	 * @param key the key.
	 * @return the value of the given key.
	 */
	public String getValue(String key) {
		return prop.getProperty(key);
	}

	/**
	 * The method sets a value into the hash table.
	 * @param key the key.
	 * @param value the value.
	 */
	public void setValue(String key, String value) {
		prop.setProperty(key, value);
	}
}//End of interface PropertyLoader
