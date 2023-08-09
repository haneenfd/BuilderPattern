
package builderpattern;
public class CarManualBuilder implements Builder {

   CarManual carManual;

    public CarManualBuilder() {
        this.carManual = new CarManual();
    }
    
    @Override
    public Builder SetEngine(String engine) {
        carManual.setEngineDesc("this car has engine of type "+engine);
        return this;
    }

    @Override
    public Builder SetSeats(String Seats) {
        carManual.setSeatsDesc("this car has "+Seats+" Seats");
        return this;
    }

    @Override
    public Builder SetGPS(String GPS) {
        carManual.setGPSDesc("this car has "+GPS);
        return this;
    }

    @Override
    public Builder TripComputer() {
        carManual.setTripComputerDesc(true);
        return this;
    }

    @Override
    public void reset() {
        this.carManual=new CarManual();
    }
    
    public CarManual getProduct(){
    return this.carManual;
    }
}
