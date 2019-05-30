package controller;

import contract.UserOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The Class Controller.
 */
public final class Controller implements IController {

	/** The view. */
	private IView		view;

	/** The model. */
	private IModel	model;

	private UserOrder stackOrder;

	/**
	 * Instantiates a new controller.
	 *
	 * @param view
	 *          the view
	 * @param model
	 *          the model
	 */
	public Controller(final IView view, final IModel model) {
		this.setView(view);
		this.setModel(model);
	}

	
	/**
	 * @return stackOrder
	 */
	public UserOrder getStackOrder() {
		return getStackOrder();
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see controller.IController#setStackOrder(model.UserOrder)
	 */
	public void setStackOrder(UserOrder stackOrder) {
		this.stackOrder = stackOrder;
	}
	
	/**
     * Control.
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#control()
	 */
	public void control() {
		this.view.printMessage("Appuyer sur les touches '►', '◄', '▲' ou '▼', pour afficher Hello world dans la langue d votre choix.");
	}

	/**
     * Sets the view.
     *
     * @param pview
     *            the new view
     */
	private void setView(final IView pview) {
		this.view = pview;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *          the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}


	@Override
	public void orderPerform(UserOrder userorder) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void directionControl() throws InterruptedException {
		// TODO Auto-generated method stub
		
	}
}
