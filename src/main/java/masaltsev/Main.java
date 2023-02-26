package masaltsev;

import masaltsev.model.Customer;
import masaltsev.model.Shop;
import masaltsev.util.ChatBot;

public class Main {
    public static void main(String[] args) {
        String input = ChatBot.askToStart();
        if (input.equals("1")) {
            String name = ChatBot.askNameAndSayHello();
            Customer customer = new Customer(name);
            new Shop().beginShopping(customer);
        }
    }
}
