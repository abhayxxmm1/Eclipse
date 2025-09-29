package Collection;

public class ArrayQueue<E> implements Queue<E> {

	
	Object [] ar;
	
	int cap = Queue.initalCap;
	
	int ct = 0;
	
	public ArrayQueue() {
		
		ar = new Object[Queue.initalCap];
	}
	
	ArrayQueue(int cap)
	{
		if (cap>=0) {
			
			this.cap = cap;
			
			ar = new Object[cap];
		}
		else 
		{
			throw new WrongInitialCapacity("A queue cannot give a negative sized");	
		}
	}
	
	ArrayQueue(Queue<E> ref)
	{
		
	}
	
	public boolean add(E ele)
	{
		if (ct < ar.length*Queue.loadFactor) {
			
			ar[ct] = ele ;
			ct++ ;
			return true;
		}
		else {
			Object temp [] =  new Object[ar.length*2];
			
			for (int i = 0; i < ct; i++) {
				temp[i] =  ar[i];
			}
			ar= temp;
			
			ar[ct] = ele;
			ct++;
			
			return false;
		}
	}
	
	public E element()
	{
		if (ar[0]!=null) {
			
			return (E)ar[0];
		}
		return null;
	}
	
	public boolean offer(E ele)
	{
		return add(ele	);
	}
	
	public E remove()
	{
		E val = (E)ar[0];
		
		if (val!=null) {
			
			for (int i = 1; i < ct; i++) {
				
				ar[i-1] = ar[i];
				
			}
			
			ct--;
			return val;
			
		}
		return val;
	}
	
	public int size()
	{
		return ct;
	}
	
	public boolean equals(Object o)
	{
		ArrayQueue<E> ref = (ArrayQueue<E>) o;
		
		for (int i = 0; i < ct; i++) {
			
			if (this.ar[i]!=ref.ar[i]) {
				
				return false;
			}
		}
		
		return true;
	}
	
	public String toString()
	{
		String op = "{";
		
		for (int i = 0; i < ct; i++) {
			if (i<ct-1) {
				
				op = op + ar[i]+ ", ";
			}
			else {
				op = op +ar[i];
			}
		}
		
		op = op + "}";
		
		return op;
	}
	
	public E peek()
	{
		return element();
	}
	
	// Retrieves and removes the head of this queue, or returns null if this queue is empty.
	public E poll()
	{
		return remove();
	}
	
	public boolean isEmpty()
	{
		return ct==0;
	}
	
	
	
	
	
	
	
	
	
	
}
