package view;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import javax.swing.SwingUtilities;

import contract.UserOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

import entity.*;
import mobile.*;
import motionless.*;

import showboard.BoardFrame;
/**
 * The Class View.
 *
 * @author Son LUONG
 * @version 1.0
 */
public final class View implements IView, Runnable {

	/** The frame. */
	private ViewFrame viewFrame = new ViewFrame(null);
	
	/** The player's character */
	protected Mobile myCharacter = null;
	
	/** The close view on the player */
	protected Rectangle closeView = null;
	
	/** The order performer */
	protected UserOrder orderPerformer = null;

	/** The BoardFrame */
	protected final BoardFrame boardFrame = new BoardFrame("BoulderDash");
	/**
	 * Instantiates a new view.
	 *
	 * @param model
	 *          the model
	 */
	public View(final IModel model) {
		this.viewFrame = new ViewFrame(model);
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
		this.viewFrame.setVisible(true);
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *          the new controller
	 */
	public void setController(final IController controller) {
		this.viewFrame.setController(controller);
	}
}
