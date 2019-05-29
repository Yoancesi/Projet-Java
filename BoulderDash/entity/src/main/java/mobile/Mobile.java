package mobile;

import mobile.Direction;

public abstract class Mobile {
	
	protected int x;
	protected int y;
	protected boolean alive;
	


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
}
