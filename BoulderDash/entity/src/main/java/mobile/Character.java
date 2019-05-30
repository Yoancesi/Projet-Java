package mobile;

import entity.Sprite;

public class Character extends Mobile
{
	public Character(int x, int y)
	{
		Sprite sprite = new Sprite(x, y, "Sprite/character.png", false);
	}
	
}
