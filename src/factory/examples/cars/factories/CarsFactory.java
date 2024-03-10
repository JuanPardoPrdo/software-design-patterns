package factory.examples.cars.factories;

import factory.examples.cars.products.Car;


public abstract class CarsFactory {
    public abstract Car createProduct(String productName);
}
