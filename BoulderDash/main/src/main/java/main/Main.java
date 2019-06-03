/**

 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
package main;

import contract.*;
import controller.Controller;
import view.Menu;
import view.View;
import model.*;

/**
 * The Class Main.
 *
 * @author Jean-Aymeric Diet
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     * @throws InterruptedException 
     */
	
    public static void main(final String[] args) throws InterruptedException {

    	Launcher launcher = new Launcher(1);
    	View view = new View(launcher);
    	
   			try {
   				
   					Controller controller = new Controller(view, launcher);
   				
  				} catch (Exception e1) {
 					e1.printStackTrace();
   					}
   				}
      }

