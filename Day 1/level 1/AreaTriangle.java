import java.util.*;
public class AreaTriangle{
  public static void main(String[] args){
/*Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height
I/P => base, height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___*/
Scanner sc = new Scanner(System.in);
System.out.println("Enter base of a triangle");
double base = sc.nextDouble();
System.out.println("Enter height of a triangle");
double height = sc.nextDouble();
double areaCm = 0.5*base*height;
double  areaInches = areaCm*6.1546;
System.out.printf("Area of a triangle: %.2f cm sq or %.2f \n", areaCm, areaInches);
  }
}

