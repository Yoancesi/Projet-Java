package motionless;

import entity.*;

public class FilledDirt extends Motionless {

	public FilledDirt(int x, int y) {
		this.sprite = new Sprite(x, y, "Sprite/exitportal.png", true);
		this.permeability = true;
	}

}