package mobile;

import entity.Sprite;

public class Boulder extends Mobile
{
	public Boulder (int x, int y)
	{		
		this.sprite = new Sprite(x, y, "Sprite/boulder.png", false);
		this.permeability = false;
	}
	
}