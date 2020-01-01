package structural.decorator;

import java.math.BigDecimal;

public class PlainPizza extends Pizza{
    public PlainPizza() {
        super();
        this.description = "Plain Pizza";
    }

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(12.00);
    }
}
