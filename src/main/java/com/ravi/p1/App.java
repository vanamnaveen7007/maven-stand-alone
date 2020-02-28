package com.ravi.p1;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
 public ass App  
{
   
    // Implemenet Log4j for debug
    static Logger log = Logger.getLogger(App.class.getName());

    public static void main( String[] args )
    {
        //System.out.println( "COD implemented" );
	log.debug("COD implemented");
    }
}
