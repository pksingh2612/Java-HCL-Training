package com.Week_4_Day5;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class MySessionAttributeListerner
 *
 */
@WebListener
public class MySessionAttributeListerner implements HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public MySessionAttributeListerner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent se)  { 
         HttpSession hs=se.getSession();
         System.out.println("Attribute Added");
         System.out.println(se.getName()+" "+se.getValue());
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent se)  { 
    	HttpSession hs=se.getSession();
        System.out.println("Attribute removed");
        System.out.println(se.getName()+" "+se.getValue());
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent se)  { 
    	 HttpSession hs=se.getSession();
         System.out.println("Attribute replaced");
         System.out.println(se.getName()+" "+se.getValue());
    }
	
}
