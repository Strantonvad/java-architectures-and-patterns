package observer.listeners;

import java.io.File;

public class EmailNotificationListener implements EventListener {
    private final String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Расслыка на " + email + ": была произведена операция: " + eventType +
            " с файлом: " + file.getName());
    }
}
