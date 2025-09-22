package Collection;

public class ArrayList {
	
	Object [] ar;
	int count = 0;
	
	int intialCap = ResizableArray.initialCap;
	
	ArrayList() {

		ar = new Object[intialCap];
	}
	
	ArrayList(int initalCap)
	{
		this.intialCap = intialCap;
		ar = new Object[initalCap];
	}

	public boolean add(Object o)
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
	
	public boolean add(int index, Object o)
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
		
		throw new ArrayIndexOutOfBoundsException("Cannot insert whatever index you want to insert");
	}
	
	public boolean remove(Object o)
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
	
	public boolean contains(Object o)
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
	
	
}
