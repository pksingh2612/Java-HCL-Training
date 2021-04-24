package com.Week_4_Day5;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class MySessionListerner
 *
 */
@WebListener
public class MySessionListerner implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public MySessionListerner() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
        HttpSession hs = se.getSession();
        hs.setAttribute("dog","labrado");
        hs.setAttribute("name","Diana");
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
    	HttpSession hs = se.getSession();
        System.out.println(hs.getAttribute("dog"));
        System.out.println(hs.getAttribute("name"));
    }
	
}
