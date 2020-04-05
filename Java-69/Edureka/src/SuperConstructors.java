class A2{
  A2(){
	  System.out.println("Class A2 constructor");
  }
  A2(int n){
	  System.out.println("Class A2 constructor with 1 parameter");
  }
}

class B2 extends A2{
 B2(){
	 //super(3);
	 System.out.println("Class B2 constructor");
 }
}

public class SuperConstructors 
{
	public static void main(String[] args) {
		B2 obj = new B2();
	}
}
