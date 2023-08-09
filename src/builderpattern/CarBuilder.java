
package builderpattern;
public class CarBuilder implements Builder {
    Car car;

    public CarBuilder() {
        this.car = new Car();
    }
    
    @Override
    public Builder SetEngine(String engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public Builder SetSeats(String Seats) {
        car.setSeats(Seats);
        return this;
    }

    @Override
    public Builder SetGPS(String GPS) {
        car.setGPS(GPS);
        return this;
    }

    @Override
    public Builder TripComputer() {
        car.setTripComputer(true);
        return this;
    }

    @Override
    public void reset() {
        this.car=new Car();
    }
    
    public  Car getProduct(){
    return this.car;
    }
}
