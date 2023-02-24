package masaltsev.util;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.IntStream;

public class ChatBot {
    public static String askToStart() {
        System.out.print("\nHello! Are you ready to create your computer?"
                + System.lineSeparator()
                + "Yes - enter \"1\": ");
        return ConsoleReader.readConsole();
    }

    public static String askNameAndSayHello() {
        System.out.println("\nWhat is your name?");
        String name = ConsoleReader.readConsole();
        System.out.println("\nHello, " + name + "!");
        return name;
    }

    public static String askComponentId(String componentType, List<String> componentList) {
        displayList(componentList);
        System.out.print("\nChoose id between 1 and " + componentList.size() + " of your "
                + componentType.toUpperCase() + " or 0 to ignore a component: ");
        return ConsoleReader.readConsole();
    }

    public static void displayList(List<String> componentList) {
        System.out.println();
        IntStream.range(0, componentList.size())
                .peek(i -> System.out.print(i + 1 + ": "))
                .mapToObj(componentList::get)
                .forEach(System.out::println);
    }

    public static void showPriceAndSayBye(BigDecimal price) {
        System.out.println("\nTotal price of your computer is: " + price + "\nGood bye!");
        ConsoleReader.close();
    }

    public static void askRepeat() {
        System.out.println("\nWrong input. Please try again.\n");
    }
}
