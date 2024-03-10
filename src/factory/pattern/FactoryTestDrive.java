package factory.pattern;


public class FactoryTestDrive {

    public static void main(String[] args) {

        Factory factory;
        Product productCreated;

        factory = new ConcreteFactoryOne();

        productCreated = factory.createProduct("one");

        if(productCreated != null){
            System.out.println(productCreated.getInformation());
        }else{
            System.out.println("No product created.");
        }

        factory = new ConcreteFactoryTwo();

        productCreated = factory.createProduct("two");

        if(productCreated != null){
            System.out.println(productCreated.getInformation());
        }else{
            System.out.println("No product created.");
        }


    }

}
