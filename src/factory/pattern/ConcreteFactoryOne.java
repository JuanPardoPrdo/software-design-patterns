package factory.pattern;


public class ConcreteFactoryOne extends Factory{

    @Override
    public Product createProduct(String productType) {
        return new ConcreteProductOne();
    }
}
