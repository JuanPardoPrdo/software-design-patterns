package factory.pattern;


public class ConcreteProductTwo extends Product {

    public ConcreteProductTwo(String name, String description){
        setName(name);
        setDescription(description);
    }

    public ConcreteProductTwo(){
        setName("Product Two");
        setDescription("Description of product two");
    }

    @Override
    public String getInformation() {
        return "Product name: " + getName() + " , Description: " + getDescription();
    }


}
