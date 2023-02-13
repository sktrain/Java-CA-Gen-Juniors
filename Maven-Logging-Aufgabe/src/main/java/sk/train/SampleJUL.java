package sk.train;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SampleJUL {

    //todo: Logger beschaffen


    public static void main(String argv[]) {
        //todo: loggerconfGlobal();
        //todo: loggerconfLocal();

        //todo: Applikation-Start und -Ende loggen mit Level fine
        for (int i=0; i <=15 ; ++i) {
            callWithLogging(i);
        }

    }

    private static void callWithLogging(final int i) {
        try {
            //todo: Methodenaudruf loggen mit Level finer
            Fakultaet.fak(i);
        } catch (Exception ex) {
            // todo: Loggen der Exception mit Level Warning

        }
    }

    private static void loggerconfGlobal() {
        //globale Konfig via Root-Logger
        //todo: Loggen in Datei mit Level finest

    }

    private static void loggerconfLocal() {
        //lokale Konfig via eigenen Logger ohne Handler des Parents
        //todo: Loggen in eigene Datei mit Level finest

    }

}
