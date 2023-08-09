
package builderpattern;
public class Car  {
 String Seats;
 String Engine;
 String GPS;
 Boolean TripComputer=false;

    public String getSeats() {
        return Seats;
    }

    public void setSeats(String Seats) {
        this.Seats = Seats;
    }

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String Engine) {
        this.Engine = Engine;
    }

    public String getGPS() {
        return GPS;
    }

    public void setGPS(String GPS) {
        this.GPS = GPS;
    }

    public Boolean getTripComputer() {
        return TripComputer;
    }

    public void setTripComputer(Boolean TripComputer) {
        this.TripComputer = TripComputer;
    }

    @Override
    public String toString() {
        String car="Car Product: ";
        if(Seats!=null){
        car=car+"\n"+"  has "+Seats+" Seats";
        }
        if(Engine!=null){
        car=car+"\n"+"  has Engine of type "+Engine;
        }
        if(GPS!=null){
        car=car+"\n"+"  has GPS of type "+GPS;
        }
        if(TripComputer){
        car=car+"\n"+"  has Trip Computer ";
        }
        return car;
    }    
}
