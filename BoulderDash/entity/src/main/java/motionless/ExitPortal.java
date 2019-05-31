package motionless;

import entity.*;

public class ExitPortal extends Motionless{
	
	public ExitPortal(int x, int y)
	{
		this.sprite = new Sprite(x, y, "Sprite/exitportal.png", false);
		this.permeability = true;
	}
    
    public void setPermeabilityExitPortal(boolean permeability) {
		this.permeability = permeability;
	}
}
