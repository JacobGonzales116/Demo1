package logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class logDemo {
    private static final Logger LOGGER = LogManager.getLogger();
    public static void main(String[] args){
        while(true) {
            System.out.println("Hey a logging message!");
            LOGGER.trace("a trace message");
            LOGGER.debug("a debug message");
            LOGGER.info("a info message");
            LOGGER.warn("a warn message");
            LOGGER.error("a error message");
            LOGGER.fatal("a fatal message");
            try{
                Thread.sleep(5000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
