package motionless;

import entity.*;

public abstract class Motionless extends Entity {
		
	
	protected int x;
	protected int y;
	
	
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

	public Motionless(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}
