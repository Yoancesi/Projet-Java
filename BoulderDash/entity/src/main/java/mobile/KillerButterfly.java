package mobile;

import entity.Sprite;

public class KillerButterfly extends Mobile
{
	public KillerButterfly()
	{
	this.sprite = new Sprite(x, y, "Sprite/killerbutterfly.png", false);
	this.permeability = false;
	}
}
