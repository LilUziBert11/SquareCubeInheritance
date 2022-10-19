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
        Square s = new Square(3, 4);
        Cube c = new Cube(6, 7, 8);

        System.out.format("The surface area of the square is:  %.2f\r\n", s.computeSurfaceArea());
        System.out.format("The surface area of the cube is:  %.2f\r\n", c.computeSurfaceArea());
        System.out.format("The volume of the cube is:  %.2f\r\n", c.computeVolume());
    }
}
