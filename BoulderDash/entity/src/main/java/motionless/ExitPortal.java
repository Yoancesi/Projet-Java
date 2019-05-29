package motionless;

import entity.*;

public class ExitPortal extends Motionless{

	public ExitPortal(int x, int y, Sprite sprite, boolean permeability) {
		super(x, y);
		this.sprite = sprite;
		this.permeability = permeability;
	}
	

}
