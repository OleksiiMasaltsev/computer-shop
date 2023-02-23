package masaltsev;

import masaltsev.db.ComponentStorage;
import masaltsev.model.Customer;
import masaltsev.model.Shop;
import masaltsev.util.ConsoleReader;

public class Main {
    public static void main(String[] args) {
        Shop shop;
        Customer customer;

        if (getFirstAnswer().equals("1")) {
            ComponentStorage storage = new ComponentStorage();
            shop = new Shop(storage);
            customer = new Customer();
        }
    }

    private static String getFirstAnswer() {
        System.out.println("Hello! Are you ready to create your computer?"
                + System.lineSeparator()
                + "Write 1 - Yes, anything else - No (exit)");
        return ConsoleReader.readConsole();
    }
}
