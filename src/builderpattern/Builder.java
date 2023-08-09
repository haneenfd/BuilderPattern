
package builderpattern;
public interface Builder {
    
    public Builder  SetEngine(String engine);
    public Builder  SetSeats(String Seats);
    public Builder  SetGPS(String GPS);
    public Builder  TripComputer();
    public void reset();  
}
