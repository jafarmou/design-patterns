package structural.decorator;

public class Test {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        System.out.println(pizza.getDescription());
        System.out.println("$" + pizza.getCost());
        System.out.println("---------");

        Pizza pepperoni = new Pepperoni(new PlainPizza());
        System.out.println(pepperoni.getDescription());
        System.out.println("$" + pepperoni.getCost());
        System.out.println("---------");

        Pizza hotPepperoni = new Sauce(new Pepperoni(new PlainPizza()));
        System.out.println(hotPepperoni.getDescription());
        System.out.println("$" + hotPepperoni.getCost());
    }
}
