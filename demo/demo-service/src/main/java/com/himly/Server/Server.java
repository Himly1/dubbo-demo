package com.himly.Server;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * create_at:MaZheng
 * create_by:${date} ${time}
 */
public class Server {

    private static final Logger log = Logger.getLogger(Server.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"applicationContext-server.xml"}
        );

        log.info("server start====");
        context.start();
        log.info("server started");

        try{
            System.in.read();
        }catch (Exception e) {
            log.error("has an error,see=="+e.getMessage(),e);
        }

    }
}
