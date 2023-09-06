package Lab;
import java.util.*;

interface Shape{
	float getArea();
}
interface Color{
	String getColor();
}
class Circle implements Shape,Color{
	float radius;
	String color;
	Circle(float radius, String color){
		this.radius =radius;
		this.color= color;
	}
	@Override
	public float getArea() {
		return (float) (3.14*radius*radius);
	}
	@Override
	public String getColor() {
		return color;
	}
}
public class MultipleInheritance {
	public static void main(String []args) {
		Circle c= new Circle((float)4.5,"Red");
		System.out.println("Area of circle = "+c.getArea());
		System.out.println("Color of circle is: "+c.getColor());
	}
}
