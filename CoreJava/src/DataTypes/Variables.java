package DataTypes;

public class Variables {
//Instance Method
	private int a=24;
//Local variable method
	public Integer getdata() {
		int b=23;
		return b;
	}
//Static variable method	
	public static Integer getall() {
		int c=1234;
		return c;
	}
	
	public static void main(String[] args) {
	
		Variables v=new Variables();
		int data= 50;
		System.out.println(v.a);
	System.out.println(v.getdata());
	
		System.out.println(v.getall());
	}
}
