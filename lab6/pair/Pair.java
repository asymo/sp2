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

public class Pair<T,D>{
	private T obj1;
	private D obj2;
	
	public Pair(T obj12, D obj21){
		this.obj1 = obj12;
		this.obj2 = obj21;
	}
	
	public Pair(Pair<? extends T, ? extends D> pair){
		/*this.obj1 = pair.getFirst();
		this.obj2 = pair.getSecond();*/
		this.obj1 = pair.obj1;
		this.obj2 = pair.obj2;
	}
	
	public T getFirst(){
		return obj1;
	}
	
	public D getSecond(){
		return obj2;
	}
	
	public Pair<D,T> swap(){
		return new Pair<D,T>(obj2, obj1);
	}
}
