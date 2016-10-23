package sg.edu.nus.iss.vmcs.customer.strategy;

public class StrategyFactory {

	public TransactionStrategy getStrategy( String s )
	{
		switch (s) {
		case "Common":
			return CommonStrategy.getInstance();

		default:
			return CommonStrategy.getInstance();
		}
	}
}
