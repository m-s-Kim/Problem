package array;

import java.util.Arrays;

public class MyArray<E> {
	private static final int INIT_CAPACITY = 10;
	private E [] theData;
	private int size;
	private int capacity = INIT_CAPACITY;
	
	public MyArray() {
		theData = (E [])new Object[INIT_CAPACITY];
		size = 0;
	}
	
	
	public void add(int index, E anEntry) {
		if(index < 0 || index > size ) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		if(size >= capacity) {
			reallocate();
		}
		
		for(int i = size-1; i >= index; i--) {
			theData[i+1] = theData[i];
		}

		System.out.println("index : "+index);
		System.out.println("index : "+anEntry);
		theData[index] = anEntry;
		size++;
	}
	private void reallocate() {
		capacity *= 2;
		theData = Arrays.copyOf(theData, capacity);
	}
	
	
	public void add(E anEntry) {
		add(size(),anEntry);
	}
	
	public int indexOf(E anEntry) {
		for(int i = 0; i < size; i++) {
			if(theData[i].equals(anEntry)) {
				return i;
			}
		}
		return -1;
	}
	
	public int size() {
		return size;
	}
	
	public E get(int index) {
		if(index < 0 || index>= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		return theData[index];
	}
	
	public E set(int index, E newValue) {
		if(index < 0 || index>= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		E oldValue = theData[index];
		theData[index] = newValue;
		return oldValue;
	}
	
	public E remove(int index) {
		if(index < 0 || index>= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		E returnValue = theData[index];
		for(int i = index+1; i < size; i++) {
			theData[i-1]= theData[i];
		}
		size--;
		return returnValue;
	}
	
	
	@Override
	public String toString() {
		return Arrays.toString(theData);
	}
	
	
	public static void main(String[] args) {
		MyArray<String> test = new MyArray<>();
		test.add("dddd");
		test.add("3");
		System.out.println(test.toString());
	}
}
