package mobile;

import entity.Sprite;

public class Diamond extends Mobile {
	
	public Diamond (int x, int y)
	{		
		this.sprite = new Sprite(x, y, "Sprite/diamond.png", true);
		this.permeability = false;
	}
}
