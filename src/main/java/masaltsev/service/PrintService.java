package masaltsev.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.IntStream;
import masaltsev.util.ConsoleReader;

public class PrintService {
    public boolean askBegin() {
        System.out.print("\nHello! Are you ready to create your computer?"
                + System.lineSeparator()
                + "Enter \"1\" to continue: ");
        return ConsoleReader.readConsole().equals("1");
    }

    public String askName() {
        System.out.println("\nWhat is your name? (not empty)");
        return ConsoleReader.readConsole();
    }

    public String askComponentId(String componentType, List<String> componentList) {
        displayComponents(componentList);
        System.out.print("\nChoose id between 1 and " + componentList.size() + " of your "
                + componentType.toUpperCase() + " or 0 to ignore a component: ");
        return ConsoleReader.readConsole();
    }

    public void displayCart(List<String> componentList) {
        if (componentList.isEmpty()) {
            System.out.println("\nYour cart is empty.");
        } else {
            System.out.print("\nThe contents of your cart:");
            displayComponents(componentList);
        }
    }

    public void askRepeat() {
        System.out.println("\nWrong input. Please, try again.");
    }

    public void displayPrice(BigDecimal price) {
        System.out.println("\nTotal price of your computer is: " + price);
    }

    public boolean askContinue() {
        System.out.println("\nDo you want to add more components?"
                + System.lineSeparator()
                + "Enter \"1\" to continue: ");
        return ConsoleReader.readConsole().equals("1");
    }

    public void displayEmpty() {
        System.out.println("\nThe shop storage is empty.");
    }

    public void sayGoodbye() {
        System.out.println("\nGoodbye!");
    }

    public void sayHello(String name) {
        System.out.println("\nHello, " + name + "!");
    }

    private void displayComponents(List<String> componentList) {
        System.out.println();
        IntStream.range(0, componentList.size())
                .peek(i -> System.out.print(i + 1 + ": "))
                .mapToObj(componentList::get)
                .forEach(System.out::println);
    }
}
