import java.lang.Math;

interface IBinTree {
	// determines whether element is in the tree
	boolean hasElt(int e);
	// returns number of nodes in the tree; counts duplicate elements as separate items
	int size();
	// returns depth of longest branch in the tree
	int height();
	
	// Gets the root
	Integer root();
		
	// Gets data left
	IBinTree leftData();
		
	// Gets data right
	IBinTree rightData();
}

class MtBT implements IBinTree {
	MtBT(){}

 // returns false since empty tree has no elements
 public boolean hasElt(int e) {
	 return false;
 }

 // returns 0 since enpty tree has no elements
 public int size() {
	 return 0;
 }

 // returns 0 since empty tree has no branches
 public int height() {
	 return 0;
 }
 
 // returns null since no elements
 public Integer root() {
	 return null;
 }
 
 // returns null since no elements
 public IBinTree leftData() {
	 return null;
 }
 
 // returns null since no elements
 public IBinTree rightData() {
	 return null;
 }
}

class DataBT implements IBinTree {
	int data;
	IBinTree left;
	IBinTree right;

 DataBT(int data, IBinTree left, IBinTree right) {
	 this.data = data;
	 this.left = left;
	 this.right = right;
 }
 
 // an alternate constructor for when both subtrees are empty
 DataBT(int data) {
	 this.data = data;
	 this.left = new MtBT();
	 this.right = new MtBT();
 }

 // determines whether this node or node in subtree has given element
 public boolean hasElt(int e) {
	 return this.data == e || this.left.hasElt(e) || this.right.hasElt(e) ;
 }

 // adds 1 to the number of nodes in the left and right subtrees
 public int size() {
	 return 1 + this.left.size() + this.right.size();
 }

 // adds 1 to the height of the taller subtree
 public int height() {
	 return 1 + Math.max(this.left.height(), this.right.height());
 }
 
 // returns the data
 public Integer root() {
	 return data;
 }
 
 // returns the left subtree
 public IBinTree leftData() {
	 return left;
 }
 
 // returns the right subtree
 public IBinTree rightData() {
	 return right;
 }
}