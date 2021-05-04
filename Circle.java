import java.util.*; // for Scanner 
public class Circle {
  private double radius = 0;
  private final double PI = 3.14;
    //setRadius();
    //getRadius();
  //}
   public Circle (double radius) {
     radius = 0;
   }
   public double setRadius (double r ) { 
  Scanner console = new Scanner (System.in);
    radius = console.nextDouble();
   //double r = radius;
    r = radius;
    return r;
  }
     double getRadius() {  // returns the radius input
      return radius;
    }
    public void getArea() {  //get the area
     double area = PI * radius * radius;
     return area;
     
      
    }
    
public static void main (String[]args) {
 Circle circle = new Circle();
// Scanner console = new Scanner (System.in);
 System.out.println("Enter a radius here");
  //double radius = console.nextDouble();
  //setRadius(console.nextDouble());
 // circle.setRadius();
  circle.getRadius();  // call
  circle.getArea(); // call 
 
}
}
