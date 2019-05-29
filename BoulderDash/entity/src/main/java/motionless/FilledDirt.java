package motionless;

import entity.*;

public class FilledDirt extends Motionless {

	public FilledDirt(int x, int y, Sprite sprite, boolean permeability) {
		super(x, y);
		this.sprite = sprite;
		this.permeability = permeability;
	}

}
