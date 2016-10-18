package com.haiyue.sbm.util;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @author liuhaiming
 */
public class Log {
    public static Logger logger = Logger.getLogger("com.raventech");

    public static void info(String message) {
        logger.info(message);
    }

    public static void debug(String message) {
        logger.debug(message);
    }

    public static void error(Exception e) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        e.printStackTrace(printWriter);
        printWriter.close();    //surprise no IO exception here
        try {
            stringWriter.close();
            String stackTrace = stringWriter.toString();
            logger.error(stackTrace);
        } catch (IOException ie) {
            ie.printStackTrace();
            logger.error(ie.getMessage());
        }
    }

    public static void warn(String message) {
        logger.warn(message);
    }

}
