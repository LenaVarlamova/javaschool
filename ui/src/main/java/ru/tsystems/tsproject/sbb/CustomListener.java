package ru.tsystems.tsproject.sbb;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by german on 10/2/14.
 */
public class CustomListener implements ServletRequestAttributeListener {
    public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        System.out.println("Attribute added!");

    }


    public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent) {

    }


    public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent) {

    }
}
