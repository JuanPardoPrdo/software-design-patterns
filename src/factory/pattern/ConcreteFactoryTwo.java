package factory.pattern;


public class ConcreteFactoryTwo extends Factory{
    @Override
    public Product createProduct(String productType) {
        return new ConcreteProductTwo();
    }
}
