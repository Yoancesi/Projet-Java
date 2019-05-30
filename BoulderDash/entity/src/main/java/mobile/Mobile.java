package mobile;

import UserOrder;
import mobile.Direction;
import entity.*;

public abstract class Mobile extends Entity{
	
	protected int x;
	protected int y;
	protected boolean alive;
	protected boolean ableToMove;
	

	public boolean isAbleToMove() {
		return ableToMove;
	}

	public void setAbleToMove(boolean ableToMove) {
		this.ableToMove = ableToMove;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}


	public void move (Direction direction)
	{
		switch (direction)
		{
			case RIGHT:
				this.setX(this.getX()+1);
				this.setY(this.getY());
				break;
				
			case LEFT:
				this.setX(this.getX()-1);
				this.setY(this.getY());
				break;
				
			case UP:
				this.setX(this.getX());
				this.setY(this.getY()+1);
				break;
				
			case DOWN:
				this.setX(this.getX());
				this.setY(this.getY()-1);
				break;
				
			case NOTHING:
				this.setX(this.getX());
				this.setY(this.getY());
				break;
		}
	}
	
	public boolean ableToMove(UserOrder userOrder)
	{
		switch(userOrder)
		{
		//if the case's permability = true 
			case Right:
				if (entity.sprite.getPermeability((.this.sprite.getX()+1) == true)
				{
					
				}
				else 
				
				this
			break;
			
			case Left:
			break;
			
			case Up:
			break;
			
			case Down:
			break;
			
			case Noop:
			break;
			
			default:
			
		}
		return ableToMove;
	}
}

