package motionless;

import entity.Sprite;

public class DugDirt extends Motionless{
	
	public DugDirt(int x, int y)
	{		
		this.sprite = new Sprite(x, y, "C:/Users/yopyo/Documents/GitHub/Projet-Java/BoulderDash/entity/src/main/java/motionless/Sprites/dugdirt.png", true);
		this.permeability = true;
	}
}
