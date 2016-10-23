package sg.edu.nus.iss.vmcs.customer.strategy;

import sg.edu.nus.iss.vmcs.store.DrinksBrand;

public class CommonStrategy extends TransactionStrategy{

	private CommonStrategy() {
		// TODO Auto-generated constructor stub
	}
	
	private static class StrategyHolder{
		private static CommonStrategy instance = new CommonStrategy();
	}
	
	public static CommonStrategy getInstance()
	{
		return StrategyHolder.instance;
	}
	
	@Override
	public int calculate( DrinksBrand drinksBrand ){
		return drinksBrand.getPrice();
	}
}
