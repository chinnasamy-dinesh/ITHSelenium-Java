package Basic;

import java.util.Scanner;

public class Find_Area_Perimeter_of_Circle
{

    public static void main(String[] args)
    {
     Scanner sc =new Scanner(System.in);
     float pi = 3.14159f;
     System.out.print("Please Enter the radius of the circle: ");
     int r = sc.nextInt();
     float area = pi*r*r;
     float perimeter = 2*pi*r;
     System.out.println("Area of circle with radius as "+r+" is: "+area);
     System.out.println("Perimeter of circle with radius as "+r+" is: "+perimeter);
    }
}
