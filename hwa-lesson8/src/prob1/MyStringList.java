package prob1;

import java.util.Arrays;

public class MyStringList {
	private final int INITIAL_LENGTH = 4;
	private String[] strArray;
	private int size;

	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}

	// Add an element in last
	public void add(String s) {
		 if(s==null) return;// throw new NullPointerException();
		 //Check for Array is Full
		 if (size == strArray.length)
			resize(); // Array is full
		// Add at the end of the list.
		strArray[size] = s;
		size++; // Increment index to insert the new elements
		// strArray[size++] = s;
	}

	public String get(int i) {
		if (i < 0 || i > size - 1) {
			// throw new IndexOutOfBoundsException("Invalid index i" + i);
			return null;
		}
		return strArray[i];
	}

	public boolean find(String s) {
		if (s == null)
			return false;
		for (int i = 0; i < size; i++)// for (String test: strArray)
		{
			if (s.equals(strArray[i]))
				return true;

		}
		return false; // The element is not in the list
	}

	/* 1. Using System.arrayopy()
	  public void insert(String s, int pos){
	     if(pos > size-1 || pos<0 )
	         return;//allowed to add 0 to size-1
	  if(s==null) return;
	  if(pos == strArray.length) {
	      resize();
	   }
	  String[] temp = new String[strArray.length];
	   System.arraycopy(strArray,0,temp,0,pos); // src, spos,des,dspos,number of elements temp[pos] = s;
	    temp[pos] = s;
	  System.arraycopy(strArray,pos,temp,pos+1, strArray.length - pos);// count =size - pos

	  strArray = temp;
	  ++size;
	   }
	 */
	/* 2. Without Temp array
	// Shift elements to the right to make space for the new element
        for (int i = size; i > pos; i--) {
            array[i] = array[i - 1];
        }
        // Insert the new element
        array[pos] = s;
        size++;
    }

	 */
	// can insert the elements 0 to size position
	public void insert(String s, int pos) {
		if (pos < 0 || pos > size)
			return;
		// If the array gets full
		if (size == strArray.length) {
			resize();
		}
		String[] temp = new String[strArray.length];

		for (int i = 0; i < pos; i++)
			temp[i] = strArray[i];
		temp[pos] = s;

		for (int i = pos + 1; i < size; i++)
			temp[i] = strArray[i - 1];

		strArray = temp;
		++size;
	}

	public boolean remove(String s) {
		if (size == 0)
			return false; // the list is empty
		if (s == null)
			return false;
		int index = -1;
		for (int i = 0; i < size; ++i) {
			if (strArray[i].equals(s)) {
				index = i;
				break;
			}
		}
		if (index == -1)
			return false; // s is not found in the list
		String[] temp = new String[strArray.length];
		System.arraycopy(strArray, 0, temp, 0, index);
		System.arraycopy(strArray, index + 1, temp, index,
				strArray.length - (index + 1));
		strArray = temp;
		--size;
		return true;
	}

	private void resize() {
		System.out.println("resizing");
		int len = strArray.length;// Original array length
		int newlen = 2 * len; // Twice the original length
		// String[] temp = new String[newlen];
		// System.arraycopy(strArray,0,temp,0,len);
		// strArray = temp;
		strArray = Arrays.copyOf(strArray, newlen);

	}

	@Override
	public String toString() {
//		if (size == 0){
//			return "[]";
//		}
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(strArray[i] + ", ");
		}
		if (size > 0) {
			sb.append(strArray[size - 1]);
		}
		sb.append("]");
		return sb.toString();
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		/*
		 * if(size==0) return false; else return true;
		 */
		return (size == 0);
	}

//	Method 1: public int indexOf(String s);
	public int indexOf(String s) {
		if (s == null)
			return -1;
		for (int i = 0; i < size; i++)
			if (strArray[i].equals(s))
				return i;
		return -1;
	}

//	Method 2: public String removeAt(int index);
	public String removeAt (int index){
		if (index < 0 || index >= size)
			return null;
		for (int i = index; i < size - 1; i++){
			strArray[i] = strArray[i + 1];
		}
		strArray[size - 1] = null;
		--size;
		return strArray[size - 1];
	}

	//	Method 3: public void clear()
	public void clear() {
//		Way 1
//		Arrays.fill(strArray, null);

//		Way 2
		for (int i = 0; i < size; i++)
			strArray[i] = null;
		size = 0;
	}

//	Method 4: public void set(int index, String s);
	public String[] set (int index, String s) {
		if (index < 0 || index >= size)
			return null;
		String[] tmp = strArray;
		tmp[index] = s;
		return tmp;
	}

//	Method 5: public boolean containsAll(MyStringList other);
	public boolean containsAll(MyStringList other) {
		if (other == null)
			return false;
		for (int j = 0; j < other.size; j++) {
			boolean found = false;
			for (int i = 0; i < size; i++)
				if (other.strArray[j].equals(strArray[i])) {
					found = true;
					break;
				}
			if (!found)
				return false;
		}
		return true;
	}

	//	Method 6: public MyStringList subList(int start, int end);
	public MyStringList subList(int start, int end) {
		if (start < 0 || end > size || start >= end)
			return null;
		MyStringList result = new MyStringList();
		for (int i = start; i <= end; i++)
			result.add(strArray[i]);
		return result;
	}

	public static void main(String[] args) {
		MyStringList l = new MyStringList();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.insert("Renuka", 4); // Position reached the length
		l.insert("Mohanraj", 5); // Position reached the length
		System.out.println(l);
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.insert("Richard", 3);
		System.out.println("The list of size " + l.size() + " after inserting Richard into pos 3 is " + l);
		l.insert("Tonya", 0);
		System.out.println("The list of size " + l.size() + " after inserting Tonya into pos 0 is " + l);
		System.out.println(l.find("Susan"));
		// String[] x = (String[]) l.clone();
		// System.out.println(Arrays.toString(x));

//	Method 1: public int indexOf(String s);
		System.out.println(l);
		System.out.println("The position of Steve: " + l.indexOf("Steve"));

//	Method 2: public String removeAt(int index);
		System.out.println("Array Before remove at index = 1" + ", array l is: " + l);
		l.removeAt(1);
		System.out.println("Array After remove at index = 1" + ", array l is: " + l);

//	Method 3: public void clear()
//		System.out.println("Array Before remove at index = 1" + ", array l is: " + l);
//		l.clear();
//		System.out.println("Size = " + l.size());
//		System.out.println("Array after clear : " + l);

//	Method 4: public void set(int index, String s);
		System.out.println("Array Before update array: " + l);
		l.set(1, "Phuong");
		System.out.println("Array After update array: " + l);

//	Method 5: public boolean containsAll(MyStringList other);
		MyStringList l1 = new MyStringList();
		l1.add("Phuong");
		l1.add("Richard");
		System.out.println( "l contains l1 : " + l.containsAll(l1));

//	Method 6: public MyStringList subList(int start, int end);
		System.out.println("Current array: " + l);
		System.out.println( "subString(0,2) : " + l.subList(0,2));
	}
}
