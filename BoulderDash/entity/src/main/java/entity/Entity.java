package entity;

public abstract class Entity
{
	protected Sprite sprite;
	protected boolean permeability;
	protected int x;
	protected int y;

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
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
