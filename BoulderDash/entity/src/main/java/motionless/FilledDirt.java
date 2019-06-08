package motionless;

import entity.*;

public class FilledDirt extends Motionless {

	public FilledDirt(int x, int y) {
		this.sprite = new Sprite(x, y, "C:/Users/yopyo/Documents/GitHub/Projet-Java/BoulderDash/entity/src/main/java/motionless/Sprites/filleddirt.png", true);
		this.permeability = true;
	}

}