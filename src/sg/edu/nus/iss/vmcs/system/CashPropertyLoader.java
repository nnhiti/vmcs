/*
 * Copyright 2003 ISS.
 * The contents contained in this document may not be reproduced in any
 * form or by any means, without the written permission of ISS, other
 * than for the purpose for which it has been supplied.
 *
 */
package sg.edu.nus.iss.vmcs.system;



import sg.edu.nus.iss.vmcs.store.CashStoreItem;
import sg.edu.nus.iss.vmcs.store.Coin;
import sg.edu.nus.iss.vmcs.store.PropertyLoader;
import sg.edu.nus.iss.vmcs.store.StoreItem;

/**
 * This control object manages the initialization of the CashStore&#46;
 *
 * @version 3.0 5/07/2003
 * @author Olivo Miotto, Pang Ping Li
 */
public class CashPropertyLoader extends PropertyLoader {

	private static final String NAME_LABEL     = "Name";
	private static final String WEIGHT_LABEL   = "Weight";
	private static final String VALUE_LABEL    = "Value";
	private static final String QUANTITY_LABEL = "Quantity";
	
	@Override
	public StoreItem getItem(int index) {
		int idx = index + 1;
		Coin coin = new Coin();

		String name = new String(NAME_LABEL + idx);
		String value = getPropertyLoaderImpl().getValue(name);
		coin.setName(value);

		name = new String(WEIGHT_LABEL + idx);
		value = getPropertyLoaderImpl().getValue(name);
		coin.setWeight(Double.parseDouble(value));

		name = new String(VALUE_LABEL + idx);
		value = getPropertyLoaderImpl().getValue(name);
		coin.setValue(Integer.parseInt(value));

		name = new String(QUANTITY_LABEL + idx);
		value = getPropertyLoaderImpl().getValue(name);
		int qty = Integer.parseInt(value);

		CashStoreItem item = new CashStoreItem(coin, qty);
		return item;
	}
	
	@Override
	public void setItem(int index, StoreItem cashItem) {
		int idx = index + 1;

		CashStoreItem item = (CashStoreItem) cashItem;
		Coin cn = (Coin) item.getContent();
		String itn = new String(NAME_LABEL + idx);

		getPropertyLoaderImpl().setValue(itn, cn.getName());

		itn = new String(WEIGHT_LABEL + idx);
		getPropertyLoaderImpl().setValue(itn, String.valueOf(cn.getWeight()));

		itn = new String(VALUE_LABEL + idx);
		getPropertyLoaderImpl().setValue(itn, String.valueOf(cn.getValue()));

		itn = new String(QUANTITY_LABEL + idx);
		getPropertyLoaderImpl().setValue(itn, String.valueOf(item.getQuantity()));
	}
}//End of class CashPropertyLoader