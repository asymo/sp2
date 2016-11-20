package pair;

public class Pair<T> {
	private T obj1;
	private T obj2;
	
	public Pair(T obj1, T obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	/*public Pair(Pair<T> pair){
		this.obj1 = pair.getFirst();
		this.obj2 = pair.getSecond();
	}*/
	
	public T getFirst(){
		return obj1;
	}
	
	public T getSecond(){
		return obj2;
	}
}
