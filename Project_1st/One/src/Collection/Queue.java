package Collection;

public interface Queue<E> {

	int initalCap = 16;
	
	double loadFactor = 0.75;
	
	boolean add(E ele);
	
	E element();
	
	boolean offer(E ele);
	
	E peek();
	
	E poll();
	
	E remove();
	
	int size();
	
	boolean isEmpty();
}
