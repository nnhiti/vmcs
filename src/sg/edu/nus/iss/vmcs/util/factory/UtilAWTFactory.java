package sg.edu.nus.iss.vmcs.util.factory;

import java.awt.Color;

import sg.edu.nus.iss.vmcs.util.awt.AWTLabelledValue;
import sg.edu.nus.iss.vmcs.util.awt.AWTWarningDisplay;
import sg.edu.nus.iss.vmcs.util.components.LabelledValue;
import sg.edu.nus.iss.vmcs.util.components.WarningDisplay;

/**
 * This is the concrete factory for ui components implemented with AWT API.
 * @author Pengcheng Zhao
 *
 */
public class UtilAWTFactory extends UtilAbstractFactory{

	private UtilAWTFactory(){
	}
	
	private static class FactoryHolder{
		private static UtilAWTFactory instance = new UtilAWTFactory();
	}
	
	public static UtilAWTFactory getInstance(){
		return FactoryHolder.instance;
	}
	
	@Override
	public LabelledValue getLabelledValue( String name, String value, int width ) {
		// TODO Auto-generated method stub
		return new AWTLabelledValue(name, value, width);
	}

	@Override
	public WarningDisplay getWarningDisplay(String label) {
		// TODO Auto-generated method stub
		return new AWTWarningDisplay(label);
	}

	@Override
	public WarningDisplay getWarningDisplay(String label, Color onFg, Color onBg) {
		// TODO Auto-generated method stub
		return new AWTWarningDisplay(label, onFg, onBg);
	}

	@Override
	public WarningDisplay getWarningDisplay(String label, Color onFg, Color onBg, Color offFg, Color offBg) {
		// TODO Auto-generated method stub
		return new AWTWarningDisplay(label, onFg, onBg, offFg, offBg);
	}

}
