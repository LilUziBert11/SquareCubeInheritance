/*
* Square
*  Programmer: Albert Duenas
   Date: 10-18-22
   Version: 1.1
   Description: A java class that calculates the surface area of a square./
 */
public class Square {

    protected Double length;
    protected Double width;
    protected Double surfaceArea;
    //constructors
    public Square(){}
    public Square(double l, double w){
        length = l;
        width = w;
    }
    //getters and setters
    public void setLength(double length){
        this.length = length;
    }
    public double getLength(){return length;}

    public void setWidth(double width){this.width = width;}
    public double getWidth(){return width;}
    //method to calculate surface area of a cube
    public Double computeSurfaceArea(){
        surfaceArea=length*width;
        return surfaceArea;
    }
}
