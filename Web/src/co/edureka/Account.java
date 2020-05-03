package co.edureka;

public class Account 
{
 private long acno;
 private String name;
 private float bal;
 
 public Account() {
	 System.out.println("Account Constructor!");
 }
 
public long getAcno() {
	return acno;
}
public void setAcno(long acno) {
	System.out.println("setAcNo method");
	this.acno = acno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	System.out.println("setName method");
	this.name = name;
}
public float getBal() {
	return bal;
}
public void setBal(float bal) {
	System.out.println("setBal method");
	this.bal = bal;
}
 
}
