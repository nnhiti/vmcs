package sg.edu.nus.iss.vmcs.customer.strategy;

import sg.edu.nus.iss.vmcs.store.DrinksBrand;

/**
 * 
 * @author Tang Ting
 *
 */
public abstract class TransactionStrategy {
	
	public abstract int calculate( DrinksBrand drinksBrand );

}
