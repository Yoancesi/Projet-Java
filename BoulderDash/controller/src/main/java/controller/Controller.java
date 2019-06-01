package controller;

import contract.UserOrder;
import entity.*;
import mobile.*;
import mobile.Character;
import mobile.Direction;
import motionless.*;
import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The Class Controller.
 */
public final class Controller implements IController {

	private IView		view;

	private IModel	model;

	private UserOrder stackOrder;
	
	private Character character;
	
	private Entity sprite;
	
	
	//testmap
	
	private int map[][] = { 
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2 }, 
			{ 2, 2, 2, 2, 2, 1, 5, 2, 1, 2, 4, 1, 2, 2, 3, 4, 1, 3, 4, 3, 0, 3, 0, 6, 1, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 1, 3, 2, 1, 3, 3, 1, 2, 2, 3, 3, 1, 2, 3, 0, 3, 2, 3, 0, 1, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 1, 3, 2, 1, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 1, 4, 2, 2, 2, 2, 1, 2, 3, 2, 2, 0, 7, 0, 1, 3, 3, 3, 3, 1, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 1, 1, 3, 1, 1, 1, 1, 2, 4, 2, 2, 2, 2, 2, 1, 3, 3, 3, 4, 1, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 1, 3, 3, 4, 2, 1, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 1, 3, 4, 2, 2, 1, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 1, 1, 3, 3, 1, 2, 2, 3, 1, 4, 2, 2, 2, 1, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 3, 2, 1, 2, 2, 3, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 2, 2, 3, 3, 3, 3, 2, 2, 1, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 1, 1, 1, 1, 3, 3, 1, 1, 1, 1, 1, 2, 2, 2, 4, 3, 3, 2, 2, 1, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 1, 1, 2, 2, 1, 4, 3, 2, 2, 2, 1, 2, 2, 2, 2, 3, 2, 2, 2, 1, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 1, 4, 3, 2, 1, 3, 2, 2, 2, 2, 1, 2, 2, 3, 3, 3, 2, 2, 2, 1, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 1, 1, 3, 2, 1, 2, 2, 2, 0, 0, 3, 3, 2, 2, 2, 2, 1, 3, 3, 1, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2, 4, 1, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 1, 2, 1, 2, 2, 2, 2, 2, 2, 4, 1, 1, 2, 2, 2, 2, 1, 2, 2, 1, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 },
			{ 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 }
	};
	
	public void init()
	{		
		for(int y=0; y < 30; y++)
		{
			int x;
			for( x=0; x < 30; x++)
			{
				
				switch(map[y][x])
				{
					case 1: sprite = new Wall(x, y); break;
					case 2: sprite = new FilledDirt(x, y); break;
					case 3: sprite = new Boulder(x, y); break;
					case 4: sprite = new Diamond(x, y); break;
					case 6: sprite = new ExitPortal(x, y); break;
					case 7: sprite = new KillerButterfly(); break;
					default:sprite = new DugDirt(x, y); 
							if(map[y][x] == 5) 
							{
								character = new Character(x, y);
								//pan.add(hero);
							}
							break;
				}
				sprite.setX(x);
				sprite.setY(y);
				//pan.add(sprite);
		}
		}
	}


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

	public UserOrder getStackOrder() {
		return getStackOrder();
	}
	
	/*
	 * 
	 * @see controller.IController#setStackOrder(model.UserOrder)
	 */
	public void setStackOrder(UserOrder stackOrder) {
		this.stackOrder = stackOrder;
	}
	
	
	public IModel getModel() {
		return model;
	}

	private void setView(final IView pview) {
		this.view = pview;
	}
	
	public IView getView() {
		return view;
	}

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
	
	
	
	public int[][] getMap() {
		return map;
	}

	public void setMap(int[][] map) {
		this.map = map;
	}

	/**
     * Control.
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#control()
	 */
	/* Start.
	   * 
	   * @throws InterruptedException
	   */
	  @Override
	  public void control() throws InterruptedException {
	  //
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

	      
// not yet implemented : countDiamonds
//	     if (countDiamonds == 0) {
	        this.getView().printMessage("WIN");
	        System.exit(0);
//	      }
	    this.getView().printMessage("GAME OVER");
	    System.exit(0);
	  }	  
}
