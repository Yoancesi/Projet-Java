package controller;

import contract.UserOrder;
import entity.*;
import mobile.Character;
import contract.IController;
import contract.ILauncher;
import contract.IView;
import view.*;

/**
 * The Class Controller.
 */
public final class Controller implements IController {

	private IView	iview;
	
	protected ViewPanel viewPanel;

	private ILauncher launcher;

	private UserOrder stackOrder;
	
	private Character character;
	
	private Entity sprite;


	/**
	 * Instantiates a new controller.
	 *
	 * @param view
	 *          the view
	 * @param model
	 *          the model
	 */
	public Controller(final IView view, final ILauncher launcher) {
		this.setView(view);
		this.setLauncher(launcher);
	}

	public UserOrder getStackOrder() {
		return getStackOrder();
	}
	
	public void setStackOrder(UserOrder stackOrder) {
		this.stackOrder = stackOrder;
	}
	
	public void setLauncher(ILauncher launcher) {
		this.launcher = launcher;
	}

	public ILauncher getLauncher() {
		return launcher;
	}

	private void setView(final IView pview) {
		this.iview = pview;
	}
	
	public IView getView() {
		return iview;
	}

	@Override
	public void orderPerform(UserOrder userorder) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void directionControl() throws InterruptedException {
		// TODO Auto-generated method stub	
	}
	
	  @Override
	  public void control() throws InterruptedException {

	    while (this.character.isAlive()) {	      
	 //     if (this.character().ableToMove(this.getStackOrder())) {
	        switch (this.getStackOrder()) {
	        case Right:
	          this.character.move(mobile.Direction.RIGHT);
	          break;
	        case Left:
	        	this.character.move(mobile.Direction.LEFT);
	          break;
	        case Down:
	        	this.character.move(mobile.Direction.DOWN);
	          break;
	        case Up:
	        	this.character.move(mobile.Direction.UP);
	          break;
	        case Noop:
	        default:
	        	this.character.move(mobile.Direction.NOTHING);
	          break;
	        }  
	      }
	    
	     if (viewPanel.getFinalDiamonds() == 0) {
	        this.getView().printMessage("WIN");
	        System.exit(0);
	      }
	    this.getView().printMessage("GAME OVER");
	    System.exit(0);
	  }
}