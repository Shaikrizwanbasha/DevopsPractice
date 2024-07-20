package Inheritance;

public class Test2 {
	public static void main(String[] args) {
		Parent chi=new children();
			chi.House();
			chi.Gold();
		
			
			Parent grand=new Grandparent();
			grand.Gold();
			grand.House();
			
			children child=new children();
			child.Bike();
			child.Gold();
			child.House();
			
			
	}
}
