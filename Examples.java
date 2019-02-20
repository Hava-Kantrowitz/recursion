import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class Examples {
	
	HeapChecker HT = new HeapChecker();
	
	IHeap myHeapA = new DataHeap(4, new DataHeap(5, new MtHeap(), new MtHeap()), new MtHeap());
	IHeap myHeapB = new DataHeap(4, new DataHeap(7, new MtHeap(), new MtHeap()), 
			new DataHeap(9, new MtHeap(), new MtHeap()));
	
	IBinTree myTreeA = new DataBT(8, new DataBT(4, new MtBT(), new MtBT()), new DataBT(5, new MtBT(), new MtBT()));
	IBinTree myTreeB1 = new DataBT(4, new DataBT(7, new MtBT(), new MtBT()),
			new DataBT(8, new MtBT(), new DataBT(9, new MtBT(), new MtBT())));

	// Tests a fail of addElt
	@Test
	void testFailAdd() {
		assertFalse(HT.addEltTester(myHeapA, 8, myTreeA));
	}
	
	
	// Tests possibility 1 addElt
	@Test
	void testPoss1Add() {
		assertFalse(HT.addEltTester(myHeapB, 8, myTreeB1));
	}
	
	// Tests possibility 2 addElt
	
	// Tests possibility 3 addElt
	
	// tests possibility 1 addElt when elt is 1st node
	
	// tests possibility 2 addElt when elt is 1st node
	
	// tests a fail of remMinElt
	
	// tests possibility 1 remMinElt
	
	// tests possibility 2 remMinElt
	
	// tests possibility 3 remMinElt
	
	

	

}
