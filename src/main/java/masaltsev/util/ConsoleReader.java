package masaltsev.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
    private static final BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

    public static String readConsole() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException("Can't read from the console", e);
        }
    }

    public static void close() {
        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException("Can't close the reader", e);
        }
    }
}
