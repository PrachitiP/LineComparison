package pom.linecomparison;
import java.util.*;
public class LineComparison {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome To Line Comparison Computation Program");
		System.out.println("Enter the x-coordinate of 1st point");
		int x1=sc.nextInt(); 
		
		System.out.println("Enter the x-coordinate of 2nd point");
		int x2=sc.nextInt();
		
		System.out.println("Enter the y-coordinate of 1st point");
		int y1=sc.nextInt();
		
		System.out.println("Enter the y-coordinate of 2nd point");
		int y2=sc.nextInt();
	
		double length= Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		
		System.out.println("Length of the line is:"+length);
	}
	

}
