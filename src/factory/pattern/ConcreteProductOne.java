package factory.pattern;


public class ConcreteProductOne extends Product{

    public ConcreteProductOne(String name, String description){
        setName(name);
        setDescription(description);
    }

    public ConcreteProductOne(){
        setName("Product One");
        setDescription("Description of product one");
    }

    @Override
    public String getInformation() {
        return "Product name: " + getName() + " , Description: " + getDescription();
    }

}
