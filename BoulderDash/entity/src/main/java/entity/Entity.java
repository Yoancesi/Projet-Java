package entity;

import java.awt.Component;
import java.awt.Image;

import javax.swing.JComponent;

public abstract class Entity extends JComponent implements IEntity
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4133750133741371948L;
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
	
	public Image getImage() {
		return sprite.image;
	}
	public boolean isPermeability() {
		return permeability;
	}
	public void setPermability(boolean permeability) {
		this.permeability = permeability;
	}

}
