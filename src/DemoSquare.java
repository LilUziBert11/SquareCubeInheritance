/*
* DemoSquare
*  Programmer: Albert Duenas
   Date: 10-18-22
   Version: 1.1
   Description: Driver class that instantiates square and cube and then displays the surface area and volume./
 */
import java.util.Scanner;

public class DemoSquare {
    public static void main(String[] args){
        //Declaring new scanner class
        Scanner sc = new java.util.Scanner(System.in);

        //Asking the user for the length of the square
        System.out.println("What is the length of the square?");
        double length = sc.nextDouble();

        //Asking the user for the width of the square
        System.out.println("What is the width of the square?");
        double width = sc.nextDouble();

        //Asking the user for the length of the cube
        System.out.println("What is the length of the cube?");
        double cLength = sc.nextDouble();

        //Asking the user for the width of the cube
        System.out.println("What is the width of the cube?");
        double cWidth = sc.nextDouble();

        //Asking the user for the depth of the cube
        System.out.println("What is the depth of the cube?");
        double depth = sc.nextDouble();

        Square s = new Square(length, width);
        Cube c = new Cube(cLength, cWidth, depth);

        System.out.format("The surface area of the square is:  %.2f\r\n", s.computeSurfaceArea());
        System.out.format("The surface area of the cube is:  %.2f\r\n", c.computeSurfaceArea());
        System.out.format("The volume of the cube is:  %.2f\r\n", c.computeVolume());
    }
}
