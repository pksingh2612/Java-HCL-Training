package com.Week_4_Day5;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyFirstServletContextListerner
 *
 */
@WebListener
public class MyFirstServletContextListerner implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public MyFirstServletContextListerner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         ServletContext sc=sce.getServletContext();
         String mySub=sc.getInitParameter("mySubject");
         sc.setAttribute("subject", mySub);
    }
	
}
