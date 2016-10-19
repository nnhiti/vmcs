/*
 * Copyright 2003 ISS.
 * The contents contained in this document may not be reproduced in any
 * form or by any means, without the written permission of ISS, other
 * than for the purpose for which it has been supplied.
 *
 */
package sg.edu.nus.iss.vmcs.store;

import java.io.IOException;

import sg.edu.nus.iss.vmcs.system.CashPropertyLoader;
import sg.edu.nus.iss.vmcs.system.DrinkPropertyLoader;
import sg.edu.nus.iss.vmcs.system.FilePropertyLoader;

/**
 * This class will create factory for property loader

 * @version 1.0 19/10/2016
 * @author Ha
 */
public class PropertyLoaderFactory {
	public PropertyLoader getPropertyLoader(String type, String name) {
		if (type == null) {
			return null;
		}
		if (type.equalsIgnoreCase("CASH_FILE")) {
			FilePropertyLoader fileLoader = new FilePropertyLoader(name);
			try {
				fileLoader.initialize();
			} catch (IOException e) {
				e.printStackTrace();
			}
			CashPropertyLoader cash = new CashPropertyLoader();
			cash.setPropertyLoaderImpl(fileLoader);
			return cash;
		} else if (type.equalsIgnoreCase("DRINK_FILE")) {
			FilePropertyLoader fileLoader = new FilePropertyLoader(name);
			try {
				fileLoader.initialize();
			} catch (IOException e) {
				e.printStackTrace();
			}
			DrinkPropertyLoader drink = new DrinkPropertyLoader();
			drink.setPropertyLoaderImpl(fileLoader);
			return drink;
		}
		return null;
	}
}
