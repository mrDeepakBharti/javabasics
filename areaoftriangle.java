package day1;
import java.util.*;
public class areaoftriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Height: ");
        Double Height=sc.nextDouble();
        System.out.println("Enter the Breadth: ");
        Double base=sc.nextDouble();
        double area_of_triangle=(base*Height)/2;
        System.out.println("Area of triangle is: "+area_of_triangle);
    }
}
