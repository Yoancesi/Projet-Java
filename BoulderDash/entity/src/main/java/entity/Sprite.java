package entity;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Sprite {

	protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected boolean permeability;
	protected boolean visible;
    protected Image image;
    
    public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	protected String imageName;

    public Sprite(int x, int y, String imageName, boolean permeability)
    {
    	this.x = x;
    	this.y = y;
        visible = true;
        this.permeability = permeability;
        ImageIcon ii = new ImageIcon(imageName);
        image = ii.getImage();
    }
 
    public boolean isPermeability() {
		return permeability;
	}

	public boolean isVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }
    
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
	
}