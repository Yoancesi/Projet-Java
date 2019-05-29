package entity;

public abstract class Entity
{
	protected Sprite sprite;
	protected boolean permeability;
	
/*	public Entity(Sprite sprite, boolean permeability)
	{
		this.sprite = sprite;
		this.permeability = permeability;
	}
	*/
	public Sprite getSprite() {
		return sprite;
	}
	public void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}
	public boolean isPermeability() {
		return permeability;
	}
	public void setPermability(boolean permeability) {
		this.permeability = permeability;
	}

}
