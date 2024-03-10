package abstractfactory.pattern;

public class ProductAOne extends AbstractProductA{

    public ProductAOne(String name, String description){
        super(name, description);
    }

    public ProductAOne(){
        setName("Product A - Part One");
        setDescription("Description of Product A - Part One");
    }

}
