package mobile;

import entity.Sprite;

public class Character extends Mobile
{
	public Character(int x, int y)
	{
		this.sprite = new Sprite(x, y, "Sprite/character.png", false);
		this.permeability = false;
	}
}
