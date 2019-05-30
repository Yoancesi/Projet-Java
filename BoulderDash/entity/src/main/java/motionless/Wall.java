package motionless;

import java.awt.Image;
import entity.*;

public class Wall extends Motionless{

	public Wall(int x, int y, Sprite sprite, boolean permeability) {
		super(x, y);
		//this.x = x;
		//this.y = y;
		this.sprite = sprite;
		this.permeability = permeability;
	}

}
 