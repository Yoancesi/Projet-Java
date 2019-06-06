package motionless;


import entity.*;

public class Wall extends Motionless{

	public Wall(int x, int y)
	{	
		this.sprite = new Sprite(x, y, "C:/Users/yopyo/Documents/GitHub/Projet-Java/BoulderDash/entity/src/main/java/motionless/Sprites/wall.JPG", false);
		this.permeability = false;
	}
}	

