package mobile;

import java.awt.Point;

import entity.Sprite;

public class Boulder extends Mobile
{
	public Boulder (int x, int y)
	{		
		this.sprite = new Sprite(x, y, "Sprite/boulder.png", false);
		this.permeability = false;
	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}
	
}