public class Circle
{
    private static final double PI = 3.14159265359;
    
    private double radius;
    
    public Circle(double theRadius)
    {
        radius = theRadius;
    }
    
    public void setRadius(double rad){
      radius = rad;
    }
    
    public double getArea()
    {
        return PI * Math.pow(radius,2);
    }
    
}
