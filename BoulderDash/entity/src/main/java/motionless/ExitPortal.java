package motionless;

import entity.*;

public class ExitPortal extends Motionless{
	
	public ExitPortal(int x, int y)
	{
		this.sprite = new Sprite(x, y, "C:/Users/yopyo/Documents/GitHub/Projet-Java/BoulderDash/entity/src/main/java/motionless/Sprites/exitportal.PNG", true);
		this.permeability = true;
	}
    
    public void setPermeabilityExitPortal(boolean permeability) {
		this.permeability = permeability;
	}
}
