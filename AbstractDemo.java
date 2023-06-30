abstract class Shape
{
   private double height;  // To hold height.
   private double width;  //To hold width 

   // Set height and width
   public void setValues(double height, double width)
   {
      this.height = height;
      this.width = width;
   }

   //Get height
   public double getHeight() 
   {
       return height;
   }
     
   //Get width
   public double getWidth() 
   {
       return width;
   } 
   public abstract double getArea();   // The getArea method is abstract it must be overridden in a subclass. 
}
class Rectangle extends Shape
{
    //Calculate and return area of rectangle
    public double getArea()
    {
        return getHeight() * getWidth();
    }
}
class Triangle extends Shape
{ 
    //Calculate and return area of triangle
    public double getArea() 
    {
        return (getHeight() * getWidth()) / 2;
    }
}
public class AbstractDemo
{
    public static void main(String[] args)
    {
        Shape shape;
        Rectangle rect = new Rectangle();    
        // shape points to the object rect.
        shape = rect;
        // Set data in Rectangle's object 
        shape.setValues(65,4); 
        //Display the area of rectangle
        System.out.println("Area of rectangle : " + shape.getArea());

        Triangle tri = new Triangle();
        // shape points to the object rect.        
        shape = tri;
        // Set data in Triangle's object         
        shape.setValues(24,5);
        //Display the area of triangle        
        System.out.println("Area of triangle : " + shape.getArea());
    }
}
