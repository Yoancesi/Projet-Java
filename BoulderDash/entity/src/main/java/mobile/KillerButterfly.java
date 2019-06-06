package mobile;

import java.awt.Point;

import entity.Sprite;

public class KillerButterfly extends Mobile
{
	public KillerButterfly()
	{
	this.sprite = new Sprite(x, y, "Sprite/killerbutterfly.png", false);
	this.permeability = false;
	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}
}
