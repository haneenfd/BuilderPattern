
package builderpattern;
public class CarManual {
    
    String SeatsDesc;
    String EngineDesc;
    String GPSDesc;
    Boolean TripComputerDesc=false;

    public String getSeatsDesc() {
        return SeatsDesc;
    }

    public void setSeatsDesc(String SeatsDesc) {
        this.SeatsDesc = SeatsDesc;
    }

    public String getEngineDesc() {
        return EngineDesc;
    }

    public void setEngineDesc(String EngineDesc) {
        this.EngineDesc = EngineDesc;
    }

    public String getGPSDesc() {
        return GPSDesc;
    }

    public void setGPSDesc(String GPSDesc) {
        this.GPSDesc = GPSDesc;
    }

    public Boolean getTripComputerDesc() {
        return TripComputerDesc;
    }

    public void setTripComputerDesc(Boolean TripComputerDesc) {
        this.TripComputerDesc = TripComputerDesc;
    }
    
     @Override
    public String toString() {
        String carManual="Car Manual: ";
        if(SeatsDesc!=null){
        carManual=carManual+"\n"+SeatsDesc;
        }
        if(EngineDesc!=null){
        carManual=carManual+"\n"+EngineDesc;
        }
        if(GPSDesc!=null){
        carManual=carManual+"\n"+GPSDesc;
        }
        if(TripComputerDesc){
        carManual=carManual+"\n"+ "car has Trip Computer ";
        }
        return carManual;
    }  
}
