/*
 * Copyright 2003 ISS.
 * The contents contained in this document may not be reproduced in any
 * form or by any means, without the written permission of ISS, other
 * than for the purpose for which it has been supplied.
 *
 */
package sg.edu.nus.iss.vmcs.store;

/**
 * This interface provides the generic functionality required to initialize the stores.
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
public abstract class PropertyLoader {

	private PropertyLoaderImpl propertyLoaderImpl;

	/**
	 * This method reads the data from the hash table and creates a StoreItem.
	 * @param index the index of the store item.
	 * @return StoreItem the store item of the given index.
	 */
	public abstract StoreItem getItem (int index);

	/**
	 * This method updates the hash table with the data from the StoreItem.
	 * @param index the index of the item.
	 * @param item the item to be saved.
	 */
	public abstract void setItem (int index, StoreItem item);

	public PropertyLoaderImpl getPropertyLoaderImpl() {
		return propertyLoaderImpl;
	}

	public void setPropertyLoaderImpl(PropertyLoaderImpl propertyLoaderImpl) {
		this.propertyLoaderImpl = propertyLoaderImpl;
	}
}//End of interface PropertyLoader
