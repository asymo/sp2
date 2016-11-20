package pair;

/*public class Pair{
	private Object obj1;
	private Object obj2;
	
	public Pair(Object obj1, Object obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	public Pair(Pair pair){
		this.obj1 = pair.getFirst();
		this.obj2 = pair.getSecond();
	}
	
	public Object getFirst(){
		return obj1;
	}
	
	public Object getSecond(){
		return obj2;
	}
	
	public Pair swap(){
		return new Pair(obj2, obj1);
	}
}*/

public class Pair<T>{
	private T obj1;
	private T obj2;
	
	public Pair(T obj1, T obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	/*public Pair(T pair){
		this.obj1 = pair.getFirst();
		this.obj2 = pair.getSecond();
	}*/
	
	public T getFirst(){
		return obj1;
	}
	
	public T getSecond(){
		return obj2;
	}
	
	/*public Pair swap(){
		return new Pair(obj2, obj1);
	}*/
}
