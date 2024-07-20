package Inheritance;

public class Teachers  extends Student{
private int Tid;
private String Maths;
private String Hindi;
private String Telugu;
private String English;

public Teachers(int sid, String sname, int sage, String qualif, double marks, int tid, String maths, String hindi,
		String telugu, String english) {
	super(sid, sname, sage, qualif, marks);
	Tid = tid;
	Maths = maths;
	Hindi = hindi;
	Telugu = telugu;
	English = english;
}
public int getTid() {
	return Tid;
}
public void setTid(int tid) {
	Tid = tid;
}
public String getMaths() {
	return Maths;
}
public void setMaths(String maths) {
	Maths = maths;
}
public String getHindi() {
	return Hindi;
}
public void setHindi(String hindi) {
	Hindi = hindi;
}
public String getTelugu() {
	return Telugu;
}
public void setTelugu(String telugu) {
	Telugu = telugu;
}
public String getEnglish() {
	return English;
}
public void setEnglish(String english) {
	English = english;
}
@Override
public String toString() {
	return "Teachers [Tid=" + Tid + ", Maths=" + Maths + ", Hindi=" + Hindi + ", Telugu=" + Telugu + ", English="
			+ English + "]";
}

}
