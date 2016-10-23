package sg.edu.nus.iss.vmcs.store;

/**
 * interface class for iterator
 * @author Ha
 *
 */
public interface Iterator<T> {
	/**
	 * check the item still can loopable
	 * @return true = still can travel
	 */
	public boolean hasNext();
	/**
	 * method to get the current item from the loop
	 * @return an item
	 */
	public <T> T next();
	
	public <T> T first();
	
	public <T> T currentItem();
}
