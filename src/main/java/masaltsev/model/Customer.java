package masaltsev.model;

import masaltsev.model.component.Component;
import java.util.List;

public class Customer {
    private String name;
    private Cart cart;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    static class Cart {
        private List<Component> products;

        public List<Component> getProducts() {
            return products;
        }

        public void setProducts(List<Component> products) {
            this.products = products;
        }
    }
}
