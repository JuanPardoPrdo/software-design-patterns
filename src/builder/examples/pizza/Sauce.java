package builder.examples.pizza;


public enum Sauce {

    HOT, MILD;

    @Override
    public String toString() {
        return name().toLowerCase();
    }

}
