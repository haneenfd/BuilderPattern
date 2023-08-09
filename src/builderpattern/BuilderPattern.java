
package builderpattern;
public class BuilderPattern {
    public static void main(String[] args) {
        CarBuilder carBuilder =new CarBuilder();
        CarManualBuilder manualBuilder= new CarManualBuilder();
        Director director= new Director();
        
        // associate a builder with a director and launch the construction with the director, and .
        director.BuildSportCar(carBuilder);
        //get the result from the builder
        Car sport=carBuilder.getProduct();
        
        director.BuildModernCarManual(manualBuilder);
        CarManual manual=manualBuilder.getProduct();
        
        System.out.println(manual.toString());
        System.out.println("");
        System.out.println(sport.toString());
    }  
}
