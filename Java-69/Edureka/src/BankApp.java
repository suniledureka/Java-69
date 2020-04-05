import java.util.Scanner;

public class BankApp 
{
	public static void main(String[] args) 
	{
	  Account acc = null;
	  Scanner sc = new Scanner(System.in);
	  while(true)
	  {
		System.out.println("1. Create A/C");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Balance");
		System.out.println("5. Exit");
		
		System.out.print("enter an option: ");
		int opt = sc.nextInt();
		
		switch(opt) {
		 case 1:
			/*check wheether a/c is not yet created*/
			if(acc == null) {
				System.out.print("enter a/c no: ");
				long acno = sc.nextLong();
				sc.nextLine();
				
				System.out.print("enter name: ");
				String name = sc.nextLine();
				
				System.out.print("enter initial deposit: ");
				float bal = sc.nextFloat();
				/*create a/c object*/
				acc = new Account(acno,name,bal);
				System.out.println("A/C CREATED!!");
			}
			else {
				System.out.println("FYI: A/C is already created!");
			}
			break;
		 case 2: //deposit
			if(acc != null) {
				System.out.print("enter amount to deposit: ");
				float amt = sc.nextFloat();
				acc.deposit(amt); //method call to deposit amt
			}
			else {
				System.out.println("FYI: Create a/c first!");
			}
   		    break;
		 case 3: //withdraw
			if(acc != null) {
				System.out.print("enter amount to withdraw: ");
				float amt = sc.nextFloat();
				acc.withdraw(amt); //method call to withdraw amt				
			}
			else {
				System.out.println("FYI: Create a/c first!");
			}
   		    break;   		
		 case 4: //Balance
			if(acc != null) {
				acc.getBalance(); //method call for account balance
			}
			else {
				System.out.println("FYI: Create a/c first!");
			}
   		    break;   		
		 case 5: //terminate application
			System.out.println("** BYE BYE **");
			sc.close();
			System.exit(0);//to terminate the application 0- exit handler
   		    break;   		    
   		 default:
   			 System.out.println("Invalid Option.. Try Again!");
		}//switch
		System.out.println("==========================");
	  }//while
	}
}
