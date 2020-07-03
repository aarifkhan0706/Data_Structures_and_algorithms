package linkedlist;
// creating a function for generics
public class pair <X,Y>{
	
	X x;
	Y y;
	
	public pair(X x, Y y) {
		this.x=x;
		this.y=y;
	}
	
	public void get_description() {
		System.out.println(x+" and "+y);
	}
}
