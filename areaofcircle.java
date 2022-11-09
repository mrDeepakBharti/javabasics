package day1;
import java.util.*;
public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of Radius: ");
        double r=sc.nextDouble();
        double area=3.14*r*r;
        System.out.println("Area of circle is: "+area);
    }
}
