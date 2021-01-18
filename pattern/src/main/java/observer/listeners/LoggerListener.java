package observer.listeners;

import java.io.File;

public class LoggerListener implements EventListener {
    private File log;

    public LoggerListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Запись в лог " + log + ":: была произведена операция: " + eventType +
            " с файлом: " + file.getName());
    }
}