package masaltsev.model;

import java.util.List;
import masaltsev.model.component.Component;

public class Customer {
    private final List<Component> cart;
    private String name;

    public Customer(List<Component> cart) {
        this.cart = cart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Component> getCart() {
        return cart;
    }
}
