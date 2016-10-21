package sg.edu.nus.iss.vmcs.util.components;

import java.awt.Color;

/**
 * This boundary object displays an updateable label next to a fixed label.
 * @author Pengcheng Zhao
 */
public interface LabelledValue {
	
	/**
	 * This method set the value to the text field in the LabelledValue&#46;
	 * @param i the value to be set to the text field&#46;
	 */
	public void setValue(String i);

	/**
	 * This method set the value to the text field in the LabelledValue&#46;
	 * @param i the value to be set to the text field&#46;
	 */
	public void setValue(int i);
	
	/**
	 * This method returns the value in the updatable label.
	 * @return the value in the updatabale lable.
	 */
	public String getValue();
	
	/**
	 * This method sets the text field background color in the LabelledValue.
	 * @param c the color of the background.
	 */
	public void setTextBackground(Color c);

	/**
	 * This method sets the text field foreground in the LabelledValue.
	 * @param c the color of the foreground.
	 */
	public void setTextForeground(Color c);
}
