package org.howard.edu.lsp.assignments5and6;

/**
 * 
 * @author anniamatthews
 *
 */
public class Driver {

	
	/**
	 * 
	 * @param args
	 * @throws IntegerSetException if a set is empty 
	 */
	public static void main(String[] args) throws IntegerSetException   {
		// TODO Auto-generated method stub
		IntegerSet set1 = new IntegerSet(); 
		IntegerSet set2 = new IntegerSet();
		
		System.out.println("Return true if both sets are empty");
		System.out.println(set1.isEmpty());
		System.out.println(set2.isEmpty());
		System.out.println("*************");
		
		System.out.println("Adding numbers to both sets...");
		
		set1.add(1);
		set1.add(3);
		set1.add(5);
		set1.add(7);
		set1.add(9);
		
		set2.add(2);
		set2.add(4);
		set2.add(6);
		set2.add(8);
		set2.add(10);
		
		System.out.println("*************");
		
		System.out.println("Printing sets as strings");
		System.out.println(set1.toString());
		System.out.println(set2.toString());
		System.out.println("*************");
		
		System.out.println("Clearing set 2, and checking length of both sets");
		set2.clear();
		
		System.out.println("Length of set 1: " + set1.length());
		System.out.println("Length of set 2: " + set2.length());
		System.out.println("*************");
		
		System.out.println("Checking if sets are equal: ");
		System.out.println("Will return true if they do");
		
		System.out.println(set1.equals(set2));
		System.out.println("*************");
		
		System.out.println("Does set 1 have 3 in it? " + set1.contains(3));
		System.out.println("Now does set 2 have 3 in it? " + set2.contains(3));
		System.out.println("*************");
		
		try {
			System.out.println("Largest, smallest of set 1: " +set1.largest() + ", " + set1.smallest());
		} catch (IntegerSetException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("Largest, smallest of set 2: ");
			System.out.println(set2.largest() + ", " + set2.smallest());
		} catch (IntegerSetException e) {
			e.printStackTrace();
		}
		
		System.out.println("*************");
		
		System.out.println("Altering both sets using add and remove methods...");
		set2.add(3);
		set2.add(6);
		set2.add(9);
		
		set1.remove(7);
		set1.remove(5);
		set1.remove(1);
		
		System.out.println("Set 1: " + set1.toString());
		System.out.println("Set 2: " + set2.toString());
		System.out.println("*************");

		System.out.println("Union of set 1 and set 2");
		set1.union(set2);
		System.out.println("*************");
		System.out.println("Intersection between both sets");
		set1.intersect(set2);
		System.out.println("*************");
		System.out.println("Difference between both sets");
		set1.diff(set2);
		System.out.println("Empyting Sets...");
		set1.clear();
		set2.clear();
		System.out.println("Set 1: " + set1.toString());
		System.out.println("Set 2: " + set2.toString());
		System.out.println("Goodbye");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		

	}

}


