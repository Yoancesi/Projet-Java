package mobile;

import java.awt.Point;

import entity.Sprite;

public class Character extends Mobile
{
	public Character(int x, int y)
	{
		this.sprite = new Sprite(x, y, "file:///C:/Users/yopyo/Documents/GitHub/Projet-Java/BoulderDash/entity/src/main/java/mobile/Sprites/character.png", false);
		this.permeability = false;
	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}
}
