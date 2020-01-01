package structural.decorator;

import java.math.BigDecimal;

public class Sauce extends PizzaIngredient {
    private Pizza pizza;

    public Sauce(Pizza pizza) {
        super();
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + " + tomato sauce";
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(0.50).add(this.pizza.getCost());
    }
}
