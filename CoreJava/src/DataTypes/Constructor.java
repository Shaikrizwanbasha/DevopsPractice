package DataTypes;

public class Constructor {
private int a;
private String b;
private double c;
private int d;
public Constructor( int a ,String b, double c,int d) {
	this.a=a;
	this.b=b;
	this.c=c;
	this.d=d;		
}

public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

public String getB() {
	return b;
}

public void setB(String b) {
	this.b = b;
}

public double getC() {
	return c;
}

public void setC(double c) {
	this.c = c;
}

public int getD() {
	return d;
}

public void setD(int d) {
	this.d = d;
}

public static void main(String[] args) {
	

Constructor con=new Constructor(4556, "Muskaan", 456.231, 45687);
System.out.println(con.a+"----"+con.b+"---"+con.c+"----"+con.d);
con.setA(456);
con.setB("yammii");
con.setC(4568.235);
con.setD(8794);
System.out.println(con.getA()+"++++++"+con.getB()+"++++++++"+con.getC()+"+++++++"+con.getD());
}



}
