package sg.edu.nus.iss.vmcs.store;

/**
 * the container to create store iterator
 * @author Ha
 *
 */
public interface StoreIteratorContainer {
	public Iterator<?> createIterator();
}
