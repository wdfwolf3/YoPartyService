package com.yoparty;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by wdf on 17-8-22.
 */
public class Main {
    public static void main(String[] args) {
                ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                                new String[] { "/spring/spring-context.xml" });
               context.start();
             try {
                        System.in.read();
                  } catch (IOException e) {
                        e.printStackTrace();
                    }
            }
}
