package main;

import java.io.IOException;

import javax.swing.JFrame;

import contract.*;
import controller.Controller;
import model.Launcher;
import model.Model;
import view.Menu;
import view.View;
import view.ViewFrame;
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
   					System.out.println("kk2");
   					
  				} catch (Exception e1) {
 					e1.printStackTrace();
   					}
   				}
}