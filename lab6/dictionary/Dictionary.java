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
 
public interface Dictionary<K,V> {
	char get();
	char put();
	boolean isEmpty();
	
	K keys(Object value);
	V values(Object key);
}


/*
 * correct ansswer
 */
public interface Dictionary<K,V> {
	V get(K key);
	void put(K key, V value);
	/* 
	 * could also have a boolean if something changed,
	 * or return the old value of key/value
	 */
	boolean isEmpty();
	
	/*
	 * asked to return a Collection
	 */
	Collection<K> keys(Object value); 
	/* not using ? extends K so the Collection is as specific as possible
	 * and that the keys returned are the same type as the ones that were used to create the dictionary 
	 */
	Collection<V>	 values(Object key);
}