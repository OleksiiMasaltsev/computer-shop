package masaltsev;

import masaltsev.db.ComponentStorage;
import masaltsev.model.Component;
import masaltsev.util.ConsoleReader;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Component, Integer> storage = ComponentStorage.INSTANCE.getStorage();
        ConsoleReader.readConsole();
    }
}
