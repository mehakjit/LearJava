package com.capg.Hello;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger LOG = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        String message = "Hello World!";
        LOG.debug("Local change made");
        LOG.debug("change in github");
        LOG.debug(message + "ON LOG.DEBUG ");
        LOG.info(message + "ON LOG.DEBUG ");
        LOG.warn(message + "ON LOG.DEBUG ");
        LOG.error(message + "ON LOG.DEBUG ");
        LOG.debug("Apppending string: {}.", message);
        LOG.fatal(message + "ON LOG.DEBUG ");
    }
}
