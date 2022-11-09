package day1;

import java.util.*;

public class area_of_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle: ");
        double length = sc.nextDouble();
        System.out.println("Enter the value of width: ");
        double width = sc.nextDouble();
        double area_of_rectangle = length * width;
        System.out.println("Area of rectangle is: " + area_of_rectangle);
        sc.close();
    }
}
