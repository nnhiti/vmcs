/*
 * Copyright 2003 ISS.
 * The contents contained in this document may not be reproduced in any
 * form or by any means, without the written permission of ISS, other
 * than for the purpose for which it has been supplied.
 *
 */
package sg.edu.nus.iss.vmcs.system;


import sg.edu.nus.iss.vmcs.store.DrinksBrand;
import sg.edu.nus.iss.vmcs.store.DrinksStoreItem;
import sg.edu.nus.iss.vmcs.store.PropertyLoader;
import sg.edu.nus.iss.vmcs.store.StoreItem;

/**
 * This control object manages the initialization of the DrinksStore
 *
 * @version 3.0 5/07/2003
 * @author Olivo Miotto, Pang Ping Li
 */

public class DrinkPropertyLoader extends PropertyLoader {

	private static final String NAME_LABEL     = "Name";
	private static final String PRICE_LABEL    = "Price";
	private static final String QUANTITY_LABEL = "Quantity";
	
	@Override
	public StoreItem getItem(int index) {
		int idx = index + 1;
		DrinksBrand brand = new DrinksBrand();

		String name = new String(NAME_LABEL + idx);
		String value = getPropertyLoaderImpl().getValue(name);
		brand.setName(value);

		name = new String(PRICE_LABEL + idx);
		value = getPropertyLoaderImpl().getValue(name);
		brand.setPrice(Integer.parseInt(value));

		name = new String(QUANTITY_LABEL + idx);
		value = getPropertyLoaderImpl().getValue(name);
		int qty = Integer.parseInt(value);

		DrinksStoreItem item = new DrinksStoreItem(brand, qty);
		return item;
	}
	
	@Override
	public void setItem(int index, StoreItem drinksItem) {
		int idx = index + 1;

		DrinksStoreItem item = (DrinksStoreItem) drinksItem;
		DrinksBrand brand = (DrinksBrand) item.getContent();
		String itn = new String(NAME_LABEL + idx);
		getPropertyLoaderImpl().setValue(itn, brand.getName());

		itn = new String(PRICE_LABEL + idx);
		getPropertyLoaderImpl().setValue(itn, String.valueOf(brand.getPrice()));

		itn = new String(QUANTITY_LABEL + idx);
		getPropertyLoaderImpl().setValue(itn, String.valueOf(item.getQuantity()));
	}
}//End of class DrinkPropertyLoader