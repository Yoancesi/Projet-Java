/**

 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
package main;

import contract.*;
import controller.Controller;
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
        final Launcher launcher = new Launcher(1);
        final View view = new View(Launcher);
        final Controller controller = new Controller(view, launcher);
        view.setController(controller);

        controller.control();
        controller.orderPerform(UserOrder.Up);
    }
}
