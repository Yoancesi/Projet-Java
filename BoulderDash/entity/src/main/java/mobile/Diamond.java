package mobile;

import java.awt.Point;

import entity.Sprite;

public class Diamond extends Mobile {
	
	public Diamond (int x, int y)
	{		
		this.sprite = new Sprite(x, y, "C:/Users/yopyo/Documents/GitHub/Projet-Java/BoulderDash/entity/src/main/java/mobile/Sprites/diamond.png", true);
		this.permeability = true;
	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}
}
