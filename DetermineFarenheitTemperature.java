public class DetermineFarenheitTemperature{
  public static void main (String[]args){
    double farenheitTemp;
    double celsiusTemp;
    System.out.println("Celsius Temperature\t\tFarenheit Temperature\n\t");
    for (celsiusTemp = 0; celsiusTemp <= 20; celsiusTemp++){
     // System.out.println("Celsius Temperature\tFarenheit Temperature\n----------------\t\t\t-------------------");
      farenheitTemp = ( (9/5) *celsiusTemp) + 32;
     // System.out.println("Celsius Temperature\t\t\t\t\t\t\t\t\t\tFarenheit Temperature");
      
      System.out.printf("\t%.1f\t\t%.1f\n", celsiusTemp, farenheitTemp);
      
      
    }
    }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}