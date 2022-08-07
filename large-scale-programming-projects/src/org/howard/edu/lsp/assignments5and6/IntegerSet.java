package org.howard.edu.lsp.assignments5and6;

import java.util.ArrayList;
import java.util.List; 


/**
 * 
 * @author anniamatthews
 * @version 04/ 06/2022
 * 
 * IntegerSet is a class that performs different operations on a set of integers
 * 
 *
 */
public class IntegerSet {

	
	

	/**
	 * ArrayList of integers called set 
	 */

	private List<Integer> set = new ArrayList<Integer>();
	
	


	
	/**
	 * Default constructor for integerSet
	 */
	public IntegerSet() {
		
	}
	
	

	/**
	 * Clears the internal representation of the set
	 */
	public void clear() {
		this.set.clear();
		
	};
	
	
	/**
	 * 
	 * @return the length of the set 
	 */
	public int length() {
		return this.set.size();
	}; // returns the length
	

	
	
	/**
	 * 
	 * @param b another integer Arraylist
	 * @return true if the two sets are equal, regardless of order
	 * False if otherwise
	 * 
	 * 
	 */
	public boolean equals(IntegerSet b) {
		boolean isEqual = true;
		if (b.length() != length()) {
			return false;
			
		}
		
		for (int i = 0; i < length(); i++) {
			Integer currentNumber = this.set.get(i);
			if (!b.contains(currentNumber)) {
				isEqual = false;
				break;
			}
		}
		return isEqual;
		
				
	}
	

	/**
	 * 
	 * @param value is the integer the method checks for in the set 
	 * @return true if it contains the value, false if otherwise
	 */
	public boolean contains(int value) {
		return this.set.contains(value);
			
	};
	

	/**
	 * 
	 * @return the largest number in the set
	 * @throws IntegerSetException if set is empty
	 */
	public int largest() throws IntegerSetException {
		Integer largestNumber = Integer.MIN_VALUE;
		if (isEmpty()) {
			throw new IntegerSetException("Set is empty");
		}
		
		for (Integer num : this.set) {
			if (num > largestNumber) {
				largestNumber = num;
			}
		}
		
		return largestNumber.intValue();
								
	};
	

 
	
	/**
	 * 
	 * @return the smallest number in the set
	 * @throws IntegerSetException if set is empty
	 */
	public int smallest() throws IntegerSetException{
		Integer smallestNumber = Integer.MAX_VALUE;
		if (isEmpty()) {
			throw new IntegerSetException("Set is empty");

		}
		
	for (Integer num : this.set) {
		if (num < smallestNumber) {
			smallestNumber = num;
		}
	}
	
	return smallestNumber.intValue();

	};
	


	
	/**
	 * Adds an item to the set or does nothing if already there 
	 * @param item is integer being added to set 
	 */
	public void add(int item) {
		
		if (!this.set.contains(item)) {
			this.set.add(item);
			
		}
			
	}; 
	

	
	/**
	 * Removes item from set 
	 * @param item is the integer being removed 
	 * @throws IntegerSetException if set is empty
	 * 
	 * 
	 */
	public void remove(int item) throws IntegerSetException  {
		if (this.set.contains(new Integer(item))) {
			int index = this.set.indexOf(item);
			this.set.remove(index);
			}
		else if (this.set.isEmpty()) {
			throw  new IntegerSetException("Set is empty"); 
		}
		}; 
	

	
	/**
	 * Finds union of two sets
	 * @param localSet other set used for union
	 * @throws IntegerSetException if set is empty
	 */
	public void union(IntegerSet localSet) throws IntegerSetException {
		
		if (set.isEmpty() || localSet.isEmpty()) {
			throw new IntegerSetException("Empty set in Union"); 
		}
			
		IntegerSet newIntegerSet = new IntegerSet();
		for (Integer num : this.set) {
			newIntegerSet.add(num.intValue());
		}
		for (Integer num : localSet.set) {
			newIntegerSet.add(num.intValue());
		}
		System.out.println(newIntegerSet.toString());
		
	};
	



	
	/**
	 * finds intersection/similarities between two sets 
	 * @param intSetb other set being used
	 */
	public void intersect(IntegerSet intSetb) {
		IntegerSet newIntegerSet = new IntegerSet();
		
		for (Integer num : this.set) {
			if (intSetb.contains(num.intValue())) {
				newIntegerSet.add(num.intValue());
			}
		}
		System.out.println(newIntegerSet.toString());		
		
	};
	
	

	/**
	 * Difference between 2 sets 
	 * @param intSetb another IntegerSet, being compared to original one
	 */
	public void diff(IntegerSet intSetb)   {
		IntegerSet newIntegerSet = new IntegerSet();

		for (Integer num : this.set) {
			newIntegerSet.add(num.intValue());
		}

		for (Integer num : intSetb.set) {
			try {
				newIntegerSet.remove(num.intValue());
			} catch (IntegerSetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(newIntegerSet.toString());
	};
	


	
	/**
	 * 
	 * @return true if set is empty, false if not
	 */
	boolean isEmpty() {
		return set.isEmpty();  	
		
	}
	

	
	/**
	 * prints the set as a string
	 */
	public String toString() {
		return this.set.toString();
	}
	
}
