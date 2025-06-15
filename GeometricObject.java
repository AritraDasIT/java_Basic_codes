/* Develop an abstract class "GeometricObject" which has two variables "colour" and
"weight"; it would have a constructor function for setting the "colour" as "white"" and the
"weight" as 1.0 as default values. The class should have functions getColour) and
 getWeight(0 to return the colour and weight values to the caller. The class should have two
abstract methods, findArea) and findCircumference().  Write subclasses of "GeometricObject" called "Triangle", "Circle". Write the methods for
calculating area and circumference of a Triangle'" or a "Circle". */



abstract class GeometricObject
{
    String color ;
    double weight;
    
    GeometricObject()
    {
        this.color="white";
        this.weight= 1.0;
    }
    
    public String getColor()
    {
        return color;
    }
    public double getWeight()
    {
        return weight;
    }
    public abstract double findArea();
    public abstract double findCircumference();
}

class circle extends GeometricObject
{
    double radius;
    
    circle(double radius)
    {
        super();
        this.radius=radius;
    }
     public double findArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double findCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class Main{
    
    public static void main(String args[])
    {
        circle c= new circle(5.0);
         System.out.println("Colour: " + c.getColor());           // white
        System.out.println("Weight: " + c.getWeight());           // 1.0
        System.out.println("Area: " + c.findArea());              // ~78.54
        System.out.println("Circumference: " + c.findCircumference());
    }
}








