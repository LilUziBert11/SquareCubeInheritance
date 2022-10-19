/*
* Cube
*  Programmer: Albert Duenas
   Date: 10-18-22
   Version: 1.1
   Description: A java class that calculates the surface area and volume of a cube./
 */
public class Cube extends Square {
    protected double depth;
    protected double volume;

    //constructors
    public Cube(){super();}
    public Cube(double length, double width, double depth){
        super(length, width);
        this.depth = depth;
    }
    //getters and setters
    public void setDepth(double depth){this.depth = depth;}

    public double getDepth(){return depth;}

    //method to calculate surface area and volume
    public Double computeSurfaceArea(){
        surfaceArea=length*width*6;
        return surfaceArea;
    }
    public Double computeVolume(){
        volume=length*width*depth;
        return volume;
    }
}
