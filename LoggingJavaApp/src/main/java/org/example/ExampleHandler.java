package org.example;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class ExampleHandler extends Handler {
    @Override
    public void publish(LogRecord record) {
        System.out.println(String.format("Log levels : %s, message: %s",
                record.getLevel().toString(), record.getMessage()));
    }

    @Override
    public void flush() {

    }

    @Override
    public void close() throws SecurityException {

    }


}
