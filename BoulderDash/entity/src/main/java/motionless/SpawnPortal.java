package motionless;

import entity.*;

public class SpawnPortal extends Motionless {

	public SpawnPortal(int x, int y, Sprite sprite, boolean permeability) {
		super(x, y);
		this.sprite = sprite;
		this.permeability = permeability;
	}
	

}
