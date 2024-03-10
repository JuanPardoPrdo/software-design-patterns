package facade.pattern;


public class Client {

    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.doSomethingInOne();
        facade.doSomethingInOTwo();
        facade.doSomethingInOneAndTwo();

    }
}
