
public class StringMethods {

	public static void main(String[] args) {
	  String name = "edureka";
	  System.out.println("Size = "+ name.length());
	  System.out.println("Character @ index 0 = "+name.charAt(0));
	  System.out.println("Index of e = "+ name.indexOf("e"));
	  System.out.println("Last Index of e = "+ name.lastIndexOf("e"));
	  System.out.println(name.toLowerCase());
	  System.out.println(name.toUpperCase());
	  System.out.println(name.replace('e', '*'));
	  System.out.println(name);
	  
	  System.out.println(name.substring(0,4));
	}
}
