public class Account 
{
 long acno;
 String name;
 float bal;
 
 /*constructor*/
 public Account(long acno, String name, float bal) {	
	this.acno = acno;
	this.name = name;
	this.bal = bal;
 }

 /*deposit method*/
 void deposit(float amt) {
	 this.bal = this.bal+amt;
	 System.out.println("Rs."+amt+" deposited || Balance: Rs."+this.bal);
 }
 
 /*withdraw method*/
 void withdraw(float amt) {
	 if(this.bal >= amt) {
		 this.bal = this.bal -amt;
		 System.out.println("Rs"+amt+" debitted || Balance: Rs"+this.bal);
	 }
	 else {
	  System.out.println("Error: Insufficient Balance!");	 
	 }
 }
 
 void getBalance() {
	 System.out.println("A/C NO: "+this.acno+" | NAME: "+this.name+" | BALANCE: "+this.bal);
 }
}
