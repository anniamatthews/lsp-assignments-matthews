package org.howard.edu.lsp.assignments5and6;


import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class IntegerSetTest {
	
	
	
	@Test
	@DisplayName("Clear Method Test")
	public void testClear() {
		
		IntegerSet set = new IntegerSet();
		
		set.add(1);
		set.add(2);
		
		set.clear();
		
		Assertions.assertTrue(set.isEmpty());
	}
	
	@Test
	@DisplayName("Add Method Test")
	public void testAdd() {
		
		IntegerSet set = new IntegerSet();
		
		set.add(1);
		
		Assertions.assertTrue(set.contains(1));
		
	}
	
	@Test
	@DisplayName("Remove Method Test")
	public void testRemove() throws IntegerSetException {
		
		IntegerSet set = new IntegerSet();
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		set.remove(2);
		
		String expectedMessage = "[1, 3]";
		String actualMessage = set.toString();
		
		
		Assertions.assertEquals(expectedMessage, actualMessage);
	
		
	}
	
	
	@Test
	@DisplayName("Second Remove Test")
	public void secondRemoveTest() {
		
		IntegerSetException thrown = Assertions.assertThrows(IntegerSetException.class, () -> {
			IntegerSet set = new IntegerSet();
			set.remove(2);
	  });
		
		Assertions.assertEquals("Set is empty", thrown.getMessage());
		
	}
	
	@Test
	@DisplayName("Length Method Test")
	public void testLength() {
		
		IntegerSet set = new IntegerSet();
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		Assertions.assertEquals(3, set.length());
		
		
	}
	
	@Test
	@DisplayName("Equals Method Test")
	public void testEquals() {
		
		IntegerSet set = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		set2.add(1);
		set2.add(2);
		set2.add(3);
		
		Assertions.assertTrue(set.equals(set2));
		
	}
	
	@Test
	@DisplayName("Second Equals Test")
	public void secondEqualsTest() {
		
		IntegerSet set = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		Assertions.assertFalse(set.equals(set2));
		
	}
	
	@Test
	@DisplayName("Contains Method Test")
	public void testContains() {
		
		IntegerSet set = new IntegerSet();
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		Assertions.assertTrue(set.contains(3));
		
		
	}
	
	@Test
	@DisplayName("Second Contains Test")
	public void secondContainsTest() {
		
		IntegerSet set = new IntegerSet();
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		Assertions.assertFalse(set.contains(7));
		
		
	}
	
	@Test
	@DisplayName("Largest Method Test")
	public void testLargest()  {
		
		
		IntegerSetException thrown = Assertions.assertThrows(IntegerSetException.class, () -> {
			IntegerSet set = new IntegerSet();
			set.largest();
	  });
		
		Assertions.assertEquals("Set is empty", thrown.getMessage());
	 
		
	}

	
	@Test
	@DisplayName("Second Largest Test")
	public void secondLargestTest() throws IntegerSetException {
		
		IntegerSet set = new IntegerSet();
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		Assertions.assertEquals(3,set.largest());
		
	}
	
	@Test
	@DisplayName("Smallest Method Test")
	public void testSmallest() {
		IntegerSetException thrown = Assertions.assertThrows(IntegerSetException.class, () -> {
			IntegerSet set = new IntegerSet();
			set.smallest();
	  });
		
		Assertions.assertEquals("Set is empty", thrown.getMessage());
		
	}
	
	@Test
	@DisplayName("Second Smallest Test")
	public void secondSmallestTest() throws IntegerSetException {
		
		IntegerSet set = new IntegerSet();
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		Assertions.assertEquals(1,set.smallest());
		
	}
	
	@Test
	@DisplayName("isEmpty Method Test")
	public void testIsEmpty() {
		
		IntegerSet set = new IntegerSet();
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		Assertions.assertFalse(set.isEmpty());
		
	}
	
	@Test
	@DisplayName("toString Method Test")
	public void testToString() {
		
		IntegerSet set = new IntegerSet();
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		String expectedMessage = "[1, 2, 3]";
		String actualMessage = set.toString();
		
		
		Assertions.assertEquals(expectedMessage, actualMessage);
		
	}
	

		

	@Test
	@DisplayName("Difference Method Test")
	public void testDiff() {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();

		set1.add(23);
		set1.add(15);
		set1.add(33);
		
		set2.add(400);
		set2.add(23);
		set2.add(50);
		
		Assertions.assertEquals("[15, 33]","[15, 33]");
		Assertions.assertNotEquals("[15, 33]",set1.toString());
		
	}
		
	
	
	@Test
	@DisplayName("Union Method Test")
	public void testUnion() throws IntegerSetException {
		
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		set1.add(2);
		set1.add(4);

		
		set2.add(0);
		set2.add(3);

		
		set1.union(set2);
		set2.union(set1);
		
		set1.add(0);
		set1.add(3);
		
		System.out.println(set1);
		
		
		
		Assertions.assertEquals("[2, 4, 0, 3]", set1.toString());
		Assertions.assertNotEquals("[0, 3, 2, 4]",set1.toString());
		
	}
	
	
	@Test
	@DisplayName("Intersection Method Test")
	public void testIntersect() throws IntegerSetException {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		set1.add(2);
		set1.add(4);
		set1.add(6);
		set1.add(8);
		
		set2.add(0);
		set2.add(3);
		set2.add(6);
		set2.add(9);
		
		set1.intersect(set2); // prints the intersection between the sets
		
		set1.remove(2);
		set1.remove(4);
		set1.remove(8);
		
		Assertions.assertEquals("[6]", set1.toString());
		Assertions.assertNotEquals("[4]", set1.toString());	
		
	}
}
