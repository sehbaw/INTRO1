public class DetermineTheDistance {
  public static void main (String[]args) {
      for (int i = 1; i >= 10; i++){
     System.out.println(fallingDistance(i));
      }
  }
 
  public static double fallingDistance(double t) {
  double g = 9.8;
  double distance = 0;
  distance = 0.5*g*(Math.pow (t,2));
   return distance;
  
  
    
    
    
  }
  
  
  }
  
  
  
  
  
  
  
  
  
  
  
  
