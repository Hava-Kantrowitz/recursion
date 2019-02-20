
public class HeapChecker {
	
	boolean addEltTester(IHeap hOrig, int elt, IBinTree hAdded) {
		if (isHeap(hAdded) == false) {
			return false;
		}
		
		else if (hAdded.hasElt(elt) == false) {
			return false;
		}
		
		else if (hasAllEltsAdd(hOrig, elt, hAdded) == false) {
			return false;
		}
		
		else {
			return true;
		}
	}
	
	boolean remMinEltTester(IHeap hOrig, IBinTree hRemoved) {
		if (isHeap(hRemoved) == false) {
			return false;
		}
		
		if (hasAllEltsOldTree(hOrig.root(), hRemoved) == true) {
			return false;
		}
		
		hOrig = hOrig.leftData().merge(hOrig.rightData());
		
		if(hasAllEltsRemove(hOrig, hRemoved) == false) {
			return false;
		}
		
		else {
			return true;
		}
	}
	
	boolean isHeap(IBinTree hAdded) {
		int rootElt = hAdded.root();
		
		if (hAdded.leftData().root() != null) {
			
			if (hAdded.leftData().root() <= rootElt) {
				return false;
			}
			
			
		}
		
		else if (hAdded.rightData().root() != null) {
			
			if (hAdded.rightData().root() <= rootElt) {
				return false;
			}
			
		}
		
		if (hAdded.leftData().root() != null) {
		hAdded = hAdded.leftData();
		isHeap(hAdded);
		}
		
		if (hAdded.rightData().root() != null) {
		hAdded = hAdded.rightData();
		isHeap(hAdded);
		}
		
		return true;
	}
	
	
	boolean hasAllEltsOldTree(int testElt, IBinTree hAdded) {
			
			if (testElt == hAdded.root()) {
				return true;
			}
		
		if (hAdded.leftData().root() != null) {
			hasAllEltsOldTree(testElt, hAdded.leftData());
		}
		
		if (hAdded.rightData().root() != null) {
		hasAllEltsOldTree(testElt, hAdded.rightData());
		}
		
		return false; 
	}
	
	boolean hasAllEltsAdd(IHeap hOrig, int elt, IBinTree hAdded) {
		int testElt = hOrig.root();
		if (hasAllEltsOldTree(testElt, hAdded) == false) {
			return false;
		}
		
		if (hOrig.leftData().root() != null) {
		if (hasAllEltsAdd(hOrig.leftData(), elt, hAdded) == false) {
			return false;
		}
		}
		
		if (hOrig.rightData().root() != null) {
		if (hasAllEltsAdd(hOrig.rightData(), elt, hAdded) == false) {
			return false;
		}
		}
		
		if (hasAllEltsOldTree(elt, hAdded) == false) {
			return false;
		}
		
		
		return true;
		
		
	}
	
	
	boolean hasAllEltsRemove(IHeap hOrig, IBinTree hRemoved) {
			int testElt = hOrig.root();
			
			if (hasAllEltsOldTree(testElt, hRemoved) == false) {
				return false;
			}
			
			if (hOrig.leftData().root() != null) {
			if (hasAllEltsRemove(hOrig.leftData(), hRemoved) == false) {
				return false;
			}
			}
			
			if (hOrig.rightData().root() != null) {
			if (hasAllEltsRemove(hOrig.rightData(), hRemoved) == false) {
				return false;
			}
			}
			
			
			return true;
			
			
	}

}
