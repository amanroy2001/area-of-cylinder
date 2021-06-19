/*Write a java program that reads in the radius and length of a cylinder and computes the area  and volume using the following formulas: 
area = radius * radius * π 
volume = area * length */

package codewithaman;
import java.util.Scanner;

public class areaofcylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner (System.in);
System.out.println("enter radious and length of cylinder");
double r=sc.nextDouble();
double l= sc.nextDouble();
		double area=r*r*Math.PI;
		double volume= area*l;
		System.out.println(" area=="+area+ "  volume= "+volume);
		
		
	}

}
