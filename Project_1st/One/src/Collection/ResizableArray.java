package Collection;

public interface ResizableArray {

	int initialCap = 10 ;
	double loadFactor = 0.75 ;
	
	boolean add(E o) ;
	boolean add(int index,Object o) ;
	boolean addAll(ResizableArray ar) ;
	boolean addAll(int index,ResizableArray ar) ;
	boolean remove(Object o) ;
	boolean remove(int index) ;
	boolean removeAll(ResizableArray ar) ;
	boolean retainAll(ResizableArray ar) ;
	void clear() ;
	int size() ;
	boolean contains(Object o) ;
	boolean containsAll(ResizableArray ar) ;
	boolean isEmpty() ;
	Object get(int index) ;
	Object [] toArray() ;
	boolean equals(Object o) ;
	int hashCode() ;
	String toString() ;

	
}
