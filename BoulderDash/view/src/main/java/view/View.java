package view;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import javax.swing.SwingUtilities;

import contract.UserOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

import entity.*;
import mobile.*;
import model.Launcher;
import model.Model;
import motionless.*;

import showboard.BoardFrame;
/**
 * The Class View.
 *
 * @author saja
 * @version 1.0
 */
public class View implements IView, Runnable {

	/** The frame. */
	private IModel model;
	private ViewFrame viewFrame;
	private ViewPanel viewPanel;

	/**
	 * Instantiates a new view.
	 *
	 * @param model
	 *          the model
	 */
	public View(IModel model) {
		this.model = model;
		this.viewFrame = new ViewFrame(model);
		viewPanel = new ViewPanel(viewFrame);
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
		new Thread().start();
		System.out.println("print visible");
	}

	@Override
	public void counterDiamond(Graphics g) {
		// TODO Auto-generated method stub
		
	}

}
