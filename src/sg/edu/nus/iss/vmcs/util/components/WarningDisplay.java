package sg.edu.nus.iss.vmcs.util.components;

/**
 * This interface object class implements a generic display label&#46; It provides for setting
 * the background and foreground colors for display labels, and to set their state to on or off&#46;
 *
 * @author Pengcheng Zhao
 */
public interface WarningDisplay {
	
	/**
	 * This method sets the state of the WarningDisplay to On or Off.
	 * @param isOn TRUE to set the warning display to On, otherwise, to Off.
	 */
	public void setState(boolean isOn);

}
