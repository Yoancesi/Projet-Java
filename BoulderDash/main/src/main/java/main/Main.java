package main;

import java.io.IOException;

import contract.*;
import controller.Controller;
import model.Model;
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
     * @throws IOException 
     */
	
    public static void main(final String[] args) throws InterruptedException, IOException {
    	
    	IModel model = new Model(1);
    	View view = new View(model);
    		try
   			 {
   					System.out.println("kk");
   					Controller controller = new Controller(model, view);
  				} catch (Exception e1) {
 					e1.printStackTrace();
   					}
   				}
}