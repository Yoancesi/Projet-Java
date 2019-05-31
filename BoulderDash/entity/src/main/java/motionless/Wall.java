package motionless;


import entity.*;

public class Wall extends Motionless{

	public Wall(int x, int y)
	{	
		this.sprite = new Sprite(x, y, "Sprite/wall.png", false);
		this.permeability = false;
	}
}	

