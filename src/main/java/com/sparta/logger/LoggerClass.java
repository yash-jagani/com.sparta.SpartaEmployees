package com.sparta.logger;

import com.sparta.view.Starter;
import org.apache.logging.log4j.*;

public class LoggerClass {

    // creates Logger object
    private static final Logger LOGGER = LogManager.getLogger(Starter.class); // creates Logger object

    // logs to annotate steps
    public static void logTrace(String message) { // logs to annotate steps
        LOGGER.trace(message);
    }


    // logs errors that break program functionality
    public static void logError(String message) {
        LOGGER.error(message);
    }

}