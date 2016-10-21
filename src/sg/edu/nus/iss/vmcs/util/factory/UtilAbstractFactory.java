package sg.edu.nus.iss.vmcs.util.factory;

import java.awt.Color;

import sg.edu.nus.iss.vmcs.util.components.LabelledValue;
import sg.edu.nus.iss.vmcs.util.components.WarningDisplay;

/**
 * This is the abstract factory for ui components such as labelledValue and WarningDisplay.
 * @author Pengcheng Zhao
 *
 */
public abstract class UtilAbstractFactory {

	public static UtilAbstractFactory getAbstractFactory( String category )
	{
		switch ( category ) {
		case "AWT":
			return new UtilAWTFactory();
		default: 
			return new UtilAWTFactory();
		}
	}
	
	/**
	 * Get LabelledValue instance.
	 * @param name
	 * @param value
	 * @param width
	 * @return
	 */
	public abstract LabelledValue getLabelledValue( String name, String value, int width );
	
	/**
	 * Get WarningDisplay instance.
	 * @param label
	 * @return
	 */
	public abstract WarningDisplay getWarningDisplay( String label );
	
	/**
	 * Get WarningDisplay instance.
	 * @param label
	 * @param onFg
	 * @param onBg
	 * @return
	 */
	public abstract WarningDisplay getWarningDisplay( String label, Color onFg, Color onBg );
	
	/**
	 * Get WarningDisplay instance.
	 * @param label
	 * @param onFg
	 * @param onBg
	 * @param offFg
	 * @param offBg
	 * @return
	 */
	public abstract WarningDisplay getWarningDisplay( String label,Color onFg,Color onBg,Color offFg,Color offBg );
	
}
