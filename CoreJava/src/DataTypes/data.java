package DataTypes;

public class data {

	private byte A=56;
	private short b=456;
	private int c=96;
	private long d=789546123L;
	private float e=789.23f;
	private double f=45678.235d;
	private char g='k';
	private String h="Sanam";
	private  int[] arr= {78,23,53,45,68};
	
	public static void main(String[] args) {
	
		data d=new data();
		System.out.println(d.A);
		System.out.println(d.b);
		System.out.println(d.c);
		System.out.println(d.d);
		System.out.println(d.e);
		System.out.println(d.f);
		System.out.println(d.g);
		System.out.println(d.h);
		System.out.println(d.arr[3]);
	}
}
