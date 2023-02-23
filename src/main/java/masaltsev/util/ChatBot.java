package masaltsev.util;

public class ChatBot {
    public static void beginConversation() {
        System.out.println("Hello! Are you ready to create your computer?"
                + System.lineSeparator()
                + " 1 - Yes, 2 - No (exit)");
        String answer = ConsoleReader.readConsole();
        if (answer.equals("1")) {

        }
    }
}
