package view;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

import javax.swing.SwingUtilities;

import contract.UserOrder;
import contract.IModel;
import contract.IView;
/**
 * The Class View.
 *
 * @author saja
 * @version 1.0
 */
public class View implements IView, Runnable {

	/** The frame. */
	protected IModel model;
	protected ViewFrame viewFrame;
	public ViewPanel viewPanel;
	//protected Menu menu = new Menu();
	
	/**
	 * Instantiates a new view.
	 *
	 * @param model
	 *          the model
	 */
	public View(IModel model) {
		this.model = model;
		this.viewFrame = new ViewFrame(model);
		this.viewPanel = new ViewPanel(viewFrame);
		//viewPanel.setVisible(true);
		SwingUtilities.invokeLater(this); 
	}

	/**
	 * Key code to controller order.
	 *
	 * @param keyCode
	 *          the key code
	 * @return the controller order
	 */
	protected static UserOrder keyCodeToControllerOrder(final int keyCode) {
		UserOrder userOrder;
		switch (keyCode) {
			case KeyEvent.VK_RIGHT:
				userOrder = UserOrder.Right;
				break;
			case KeyEvent.VK_LEFT:
				userOrder = UserOrder.Left;
				break;
			case KeyEvent.VK_UP:
				userOrder = UserOrder.Up;
				break;
			case KeyEvent.VK_DOWN:
				userOrder = UserOrder.Down;
				break;
			default:
				return UserOrder.Noop;
		}
		return userOrder;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IView#printMessage(java.lang.String)
	 */
	public void printMessage(final String message) {
		this.viewFrame.printMessage(message);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		this.viewPanel.makeMap();
		this.viewFrame.setVisible(true);
		//new Thread().start();
		System.out.println("print visible");
	}

	@Override
	public void counterDiamond(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}
