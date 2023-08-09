package builderpattern;
public class Director{

 public void BuildModernCar(Builder carBuilder){
        
     carBuilder.reset();
     carBuilder.SetEngine("electric");
     carBuilder.SetSeats("4");
     carBuilder.SetGPS("Assisted GPS");
     carBuilder.TripComputer();

 } 
  public void BuildSportCar(Builder carBuilder){
        
     carBuilder.reset();
     carBuilder.SetEngine("hybrid");
     carBuilder.SetSeats("2");   
 } 
  
  
   public void BuildModernCarManual(Builder carManual){
        
     carManual.reset();
     carManual.SetEngine("electric");
     carManual.SetSeats("4");
     carManual.SetGPS("Assisted GPS");

 } 
  public void BuildSportCarManual(Builder carManual){
        
     carManual.reset();
     carManual.SetEngine("hybrid");
     carManual.SetSeats("2");   
 }
}