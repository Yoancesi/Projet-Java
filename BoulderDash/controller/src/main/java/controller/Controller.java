package controller;

import contract.UserOrder;
import entity.*;
import mobile.Character;
import model.Launcher;
import contract.IController;
import contract.ILauncher;
import contract.IModel;
import contract.IView;
import view.*;

/**
 * The Class Controller.
 */
public final class Controller implements IController {

	private View iview;
	
	protected ViewPanel viewPanel;

	private IModel model;

	private UserOrder stackOrder;
	
	private Character character;
	
	private Entity sprite;


	/**
	 * Instantiates a new controller.
	 *
	 * @param model
	 *          the view
	 * @param model
	 *          the model
	 */
	public Controller(final IModel model, final View vieww) {
		this.setVieww(vieww);
		this.setModel(model);
		
	}

	public UserOrder getStackOrder() {
		return getStackOrder();
	}
	
	public void setStackOrder(UserOrder stackOrder) {
		this.stackOrder = stackOrder;
	}
	
	

	public IModel getModel() {
		return model;
	}

	public void setModel(IModel model) {
		this.model = model;
	}

	private void setVieww(final View view) {
		this.iview = view;
	}
	
	public View getView() {
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
	    
	   /*  if (viewPanel.getFinalDiamonds() == 0) {
	        this.getView().printMessage("WIN");
	        System.exit(0);
	      }*/
	    ((IView) this.getView()).printMessage("GAME OVER");
	    System.exit(0);
	  }
}