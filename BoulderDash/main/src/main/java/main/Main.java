package main;

import contract.*;
import controller.Controller;
import model.Launcher;
import view.Menu;
import view.View;

/**
 * The Class Main.
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