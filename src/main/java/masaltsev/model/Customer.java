package masaltsev.model;

import java.util.ArrayList;
import java.util.List;
import masaltsev.model.component.Component;

public class Customer {
    private String name;
    private List<Component> cart;

    public Customer(String name) {
        this.name = name;
        cart = new ArrayList<>();
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

    public void setCart(List<Component> cart) {
        this.cart = cart;
    }
}
