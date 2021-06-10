package javabasics;
//Find area of circle given the radius
public class areaofcircle {
	
	public static void main(String[] args) {
		
		//float and double -> for real numbers
		
		double radius, area, volumeOfSphere;
		
		double PI = 3.14152;
		
		radius = 3.5;
		
		area = PI * radius * radius; //DRY - Don't Repeat Yourself
		
		System.out.println("Radius of the circle = " + radius);
		System.out.println("Area of the circle = " + area);
		
		volumeOfSphere = 4/3.0 * PI * radius * radius * radius;
		System.out.println("Volume of the sphere = " + volumeOfSphere);
		
		
	}

}
