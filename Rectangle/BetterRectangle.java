import java.awt.Rectangle;

public class BetterRectangle extends Rectangle
{
    public BetterRectangle(int x, int y, int width, int height)
    {
        super.setLocation(x,y);
        super.setSize(width,height);
    }
    
    public double getPerimeter()
    {
        double perimeter = 2*width + 2*height;
        return perimeter;
    }
    
    public double getArea()
    {
        double area = width*height;
        return area;    
    }
}