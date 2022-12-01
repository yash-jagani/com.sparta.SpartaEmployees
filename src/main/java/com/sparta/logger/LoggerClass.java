package com.sparta.logger;

import com.sparta.view.Starter;
import org.apache.logging.log4j.*;

public class LoggerClass {
    private static final Logger LOGGER = LogManager.getLogger(Starter.class); // create Logger object

    public static void logTrace(String message) { // logs to annotate steps
        LOGGER.trace(message);
    }

    public static void logWarn(String message) { // logs unexpected events that do not break the flow
        LOGGER.warn(message);
    }

    public static void logError(String message) { // logs errors that break program functionality
        LOGGER.error(message);
    }

}
