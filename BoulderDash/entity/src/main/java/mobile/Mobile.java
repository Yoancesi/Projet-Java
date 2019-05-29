package mobile;

import java.awt.Point;
import mobile.Direction;

public abstract class Mobile {
	
	protected Point position;
	protected boolean alive;
	
	public Mobile (Point position)
	{
		this.position = position;
		this.alive = true;
		
	}
	
	protected void setPosition(Point point)
	{
		this.position = point;
	}
	
	
	public void move (Direction direction)
	{
		switch (direction)
		{
		case Direction.RIGHT:
			this.setPosition(new Point(this.position.getX()+1,this.position.getY()));
			break;
			
		case Direction.LEFT:
			this.setPosition(new Point(this.position.getX()-1,this.position.getY()+1));
			break;
			
		case Direction.UP:
			this.setPosition(new Point(this.position.getX(),this.position.getY()+1));
			break;
		
		case Direction.DOWN:
			this.setPosition(new Point(this.position.getX(),this.position.getY()-1)));
			break;
		}
	}
}
