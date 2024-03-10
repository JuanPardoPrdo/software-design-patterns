package factory.examples.cars.products;


public abstract class Car {

    private String agency;
    private String name;
    private double price;

    public Car(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return String.format( "$%.2f", price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getInformation(){
        return "Agency: " + getAgency() + ", Name: " + getName() + ", Price: " + getPrice();
    }
}
