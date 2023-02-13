package sk.train;


import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.ConsoleAppender;
import ch.qos.logback.core.FileAppender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SampleSL4JWithLogBack {

    //todo: Umstellung des JUL-Beispiels auf SLFJ mit LogBack
    //finer -> debug
    //finest -> trace
    //Konfig für FileAppender kann via XML-Konfig erfolgen


    public static void main(String argv[]) {
        for (int i=0; i <=15 ; ++i) {
            callWithLogging(i);
        }
    }

    private static void callWithLogging(final int i) {
        try {
               Fakultaet.fak(i);
        } catch (Exception ex) {
            // Log the exception


        }
    }





}
