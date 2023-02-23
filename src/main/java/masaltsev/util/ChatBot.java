package masaltsev.util;

import java.util.Map;
import masaltsev.model.Component;

public class ChatBot {
    private static Map<Component, Integer> storage;

    public static void beginConversation() {
        System.out.println("Hello! Are you ready to create your computer?"
                + System.lineSeparator()
                + " 1 - Yes, anything else - No (exit)");
        String answer = ConsoleReader.readConsole();
        if (answer.equals("1")) {
            storage = DataInitUtil.initData();

        }
    }
}
