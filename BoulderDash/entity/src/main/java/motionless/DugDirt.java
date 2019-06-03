package motionless;

import entity.Sprite;

public class DugDirt extends Motionless{
	
	public DugDirt(int x, int y)
	{		
		this.sprite = new Sprite(x, y, "Sprite/dugdirt.png", true);
		this.permeability = true;
	}
}
