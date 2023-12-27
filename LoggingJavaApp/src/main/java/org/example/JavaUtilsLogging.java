package org.example;

//import java.util.logging.Level;
//import java.util.logging.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.slf4j.LoggerFactory;

public class JavaUtilsLogging {

    private static Logger LOGGER = LoggerFactory.getLogger(JavaUtilsLogging.class.getName());
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LOGGER.info("Testing Logging");
        LOGGER.error("This line gives arror");
    }
}