import java.util.*;

public class CalculateDistance {
  public static void main (String[]args){
 Scanner console = new Scanner (System.in);
  double speedInput;
  double timeInput;
  double distance;
 
 System.out.println("Enter a speed");
  speedInput = console.nextDouble();
 System.out.println("Enter a time");
  timeInput = console.nextDouble();
  
  while (speedInput < 1 || timeInput < 1){
   System.out.println("Please enter a positive number");
  }
  
//  distance  = speedInput * timeInput;
  System.out.println("Hours\tDistance");
  for (int hoursTravelled = 1; hoursTravelled <= timeInput; hoursTravelled++) {
    distance = (speedInput * hoursTravelled);
    System.out.println(hoursTravelled + "\t" + distance);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  }
}