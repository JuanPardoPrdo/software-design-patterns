package factory.examples.cars.factories;

import factory.examples.cars.products.*;


public class NissanFactory extends CarsFactory {
    @Override
    public Car createProduct(String productName) {
        Car car = null;

        if(productName.equalsIgnoreCase("TSURU")){
            car = new Tsuru();
        }else if(productName.equalsIgnoreCase("VERSA")){
            car = new Versa();
        }

        return car;
    }
}
