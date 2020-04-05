
public class AbsTest {

	public static void main(String[] args) {
		Shape sh = null;
		
		sh = new Circle("Blue",5.2f);
		System.out.println("Color of Shape = "+ sh.getColor());
		sh.setColor("Red");
		sh.area(); //calls area() of Circle
	
		sh = new Rectangle("Yellow",5,8);
		sh.area(); //calls area() of Rectangle
	}
}
