package dictionary;

import java.util.Collection;

/*
public interface Dictionary<T> {
	char get();
	char put();
	boolean isEmpty();
	T keys();
	T values();
}
*/

/*
 * solution after looking at the Map collection
 */
public interface Dictionary<K,V> {
	char get();
	char put();
	boolean isEmpty();
	
	K keys(Object value);
	V values(Object key);
}