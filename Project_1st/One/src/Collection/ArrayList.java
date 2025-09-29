package Collection;

public class ArrayList<E> {
	
	Object [] ar;
	int count = 0;
	
	int intialCap = ResizableArray.initialCap;
	
	ArrayList() {

		ar = new Object[intialCap];
	}
	
	ArrayList(int initalCap) throws WrongInitialCapacity
	{
		if (intialCap>0) {
			
			this.intialCap = intialCap;
			ar = new Object[initalCap];
		}
		else {
			throw new WrongInitialCapacity("intial capacity cannot be wrong");
		}
	}

	public boolean add(E o)
	{
		if (count< ar.length*ResizableArray.loadFactor) {
			
			ar[count] = o;
			count++;
		}
		else 
		{
			Object [] temp = new Object[ar.length*2];
			
			for (int i = 0; i < count; i++) {
				
				temp[i] = ar[i];
			}
			ar = temp;
			ar[count] = o;
			count++;
		}
		
		return true;
	}
	
	public boolean add(int index, E o)
	{
		if (index <= count) {
			
			if (count+1 < ar.length*ResizableArray.loadFactor) {
				
				rightShift(index);
				
				ar[index] = o;
				
				count++;
				
				return true;
			}
			else
			{
				Object [] temp = new Object[ar.length*2];
				
				for (int i = 0; i < count+1; i++) // bcoz we are adding at an index inside an array 
				{
					if (i<index) {
						temp[i] = ar[i] ;
					}
					else if (i==index) {
						temp[i] = o ;
					}
					else {
						temp[i] = ar[i-1] ;
					}
				}
				ar = temp;
				count++;
				return true;
			}
		}
		
		throw new ArrayIndexOutOfBoundsException("Cannot insert element wherever you want to insert");
	}
	
	public boolean remove(E o)
	{
		int index = indexOf(o);
		
		if (index!=-1) {
			
			leftShift(index);
			count--;
			
			return true;
		}
		
		return false;
	}
	
	public boolean remove(int index)
	{
		if (index<count) {
			
			leftShift(index);
			count--; 
			
			return true;
		}
		
		return false;
	}
	
	public String toString()
	{
		String op = "[";
		
		for (int i = 0; i < count; i++) {
			
			if (i<count-1) {
				
				op = op + ar[i] +  ", ";
			}
			else {
				op = op + ar[i];
			}
		}
		
		return op +"]";
	}
	
	public void leftShift(int index)
	{
		for (int i = index; i < count; i++) {
			
			ar[i] = ar[i+1];
		}
	}
	
	public void rightShift(int index)
	{
		for (int i = count; i > index; i--) {
			
			ar[i] = ar[i-1];
			
		}
	}
	
	public boolean contains(E o)
	{
		return indexOf(o)!=-1;
	}
	
	public int indexOf(Object o)
	{
		for (int i = 0; i < count; i++) {
			
			if (ar[i].equals(o)) {
				
				return i;
			}
		}
		
		return -1;
	}
	
	public int size()
	{
		return count;
	}
	
	public void clear()
	{
		for (int i = 0; i < count; i++) {
			
			ar[i] = null;
		}
		count = 0;
	}
	
	public boolean isEmpty()
	{
		return count==0;
	}
	
	public boolean equals(Object o) {
		
		if (o==null) {
			
			return false;
		}
		else if (this==o) {
			return true;
		}
		else
		{
			ArrayList<E> a = (ArrayList<E>) o;
			if (this.count==a.count) 
			{
				for (int i = 0; i < count; i++) {
					
					if (!this.ar[i].equals(a.ar[i])) {
						return false;
					}
				}
				return true;
			}
		}
		return false;
		
	}
	
	public E get(int index)
	{
		if (index>=0 && index<count) {
			
			return (E) ar[index];
		}
		throw new IndexOutOfRangeExceptiion("cannot find element out of range");
	}
	
	public Object[] toArray()
	{
		Object [] nw = 	new Object[count];
		
		for (int i = 0; i < nw.length; i++) {
			
			nw[i] = ar[i];
		}
		
		return nw;
				
	}


	public boolean addAll(ResizableArray<E> ref)
	{
		ArrayList<E> a = (ArrayList<E>) ref;
		
		for (int i = 0; i < a.count; i++) {
			
			this.add((E)a.get(i));
		}
		
		return true;
	}
	
	public boolean addAll(int index, ResizableArray<E> ar)
	{
		if (index>=0 && index<count && ar!=null && ((ArrayList<E>)ar).count!=0 )
		{
			ArrayList<E> list = (ArrayList<E>) ar;
			
			for (int i = 0; i < this.size(); i++) {
				
				this.add(index, list.get(i));
				
				index++;
			}
			
			return true;
			
		}
		
		return false;
	}
	
	public boolean removeAll(ResizableArray<E> ar)
	{
		ResizableArray<E> list = (ResizableArray<E>) ar;
		
		if (list.size()==0) {
			
			return false;
		}
		else {
			
			for (int i = 0; i < list.size(); i++) {
				
				remove((E) list.get(i));
			}
			
			return true;
		}
	}


	public boolean 	retainAll(ResizableArray<E> ar)
	{
		if (ar!=null || ((ArrayList<E>)ar).count!=0) 
		{
			ArrayList<E> list = (ArrayList<E>)ar;
			ArrayList<E> a = new ArrayList<E>();
			
			for (int i = 0; i < list.size(); i++) {
				
				if (this.contains(list.get(i))) {
					
					a.add(list.get(i));
				}
			}
			
			this.ar = a.ar;
			
			this.count = a.count;
		
			return true;
		}
		
		return false;
	}
	
	public boolean containsAll(ResizableArray<E> ar)
	{
		if (ar!=null && ((ArrayList<E>)ar).count!=0) {
			
			ArrayList<E> list = (ArrayList<E>)ar;	
			
			for (int i = 0; i < list.size(); i++) {
				
				if (!this.contains(list.get(i))) {
					
					return false;
				}
				
				return true;
			}
			
		}
		return false;
	}
















}
