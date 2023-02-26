package masaltsev;

import masaltsev.model.Customer;
import masaltsev.model.Shop;
import masaltsev.util.ChatBot;

public class Main {
    public static void main(String[] args) {
        Shop shop;
        Customer customer;
        if (ChatBot.askToStart().equals("1")) {
            shop = new Shop();
            customer = new Customer(ChatBot.askNameAndSayHello());
            shop.beginShopping(customer);
        }
    }
}
