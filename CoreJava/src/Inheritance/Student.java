package Inheritance;

public class Student {

	private int sid;
	private String sname;
	private int sage;
	private String qualif;
	private double marks;
	public Student(int sid,String sname,int sage,String qualif,double marks) {
		this.sid=sid;
		this.sname=sname;
		this.sage=sage;
		this.qualif=qualif;
		this.marks=marks;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public String getQualif() {
		return qualif;
	}
	public void setQualif(String qualif) {
		this.qualif = qualif;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", qualif=" + qualif + ", marks=" + marks
				+ "]";
	}
	
}
