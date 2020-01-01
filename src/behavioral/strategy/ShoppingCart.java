package behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products = new ArrayList<>();
    private double sum;
    private Payment paymentMethod;

    public void addProduct(Product product){
        this.products.add(product);
    }

    public void removeProduct(Product product) throws ClassNotFoundException {
        if(products.contains(product)){
            products.remove(product);
            return;
        }
        throw new ClassNotFoundException(product.getName() + " not found");
    }

    private double calculateTotal(){
        sum = 0;
        products.forEach(product -> sum += product.getPrice());
        return sum;
    }

    public void pay(Payment paymentMethod) {
        paymentMethod.pay(calculateTotal());
    }
}
