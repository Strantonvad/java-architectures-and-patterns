package observer;

import observer.listeners.EmailNotificationListener;
import observer.listeners.LoggerListener;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LoggerListener("pattern/out/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("user@email.com"));

        try {
            editor.openFile("ttt.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
