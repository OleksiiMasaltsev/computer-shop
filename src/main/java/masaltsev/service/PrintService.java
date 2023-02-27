package masaltsev.service;

import masaltsev.util.ConsoleReader;

public class PrintService {
    public boolean askToStart() {
        System.out.print("\nHello! Are you ready to create your computer?"
                + System.lineSeparator()
                + "Yes - enter \"1\": ");
        return ConsoleReader.readConsole().equals("1");
    }
}
