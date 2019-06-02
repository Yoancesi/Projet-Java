package view;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import entity.Entity;
import mobile.Boulder;
import mobile.Character;
import mobile.Diamond;
import mobile.KillerButterfly;
import motionless.DugDirt;
import motionless.ExitPortal;
import motionless.FilledDirt;
import motionless.Wall;
import model.*;

/**
 * The Class ViewPanel.
 *
 * @author Son LUONG
 */
class ViewPanel extends JPanel implements Observer {

	/** The view frame. */
	private ViewFrame					viewFrame;
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;
	private Character character;
	
	private Entity sprite;

	
	
	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public Entity getSprite() {
		return sprite;
	}

	public void setSprite(Entity sprite) {
		this.sprite = sprite;
	}

	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	public ViewPanel(final ViewFrame viewFrame) {
		this.setViewFrame(viewFrame);
		viewFrame.getModel().getObservable().addObserver(this);
	}

	/**
	 * Gets the view frame.
	 *
	 * @return the view frame
	 */
	private ViewFrame getViewFrame() {
		return this.viewFrame;
	}

	/**
	 * Sets the view frame.
	 *
	 * @param viewFrame
	 *          the new view frame
	 */
	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(final Observable arg0, final Object arg1) {
		this.repaint();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(final Graphics graphics) {
		graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
		

		
		//testmap
		
		//should be in view

		{	
			char map[][] = launcher.getTable();
			for(int y=0; y < 30; y++)
			{
				int x;
				for( x=0; x < 30; x++)
				{
					switch(map[y][x])
					{
						case 'X' : sprite = new Wall(x, y); break;
						case 'V': sprite = new FilledDirt(x, y); break;
						case 'C': sprite = new Boulder(x, y); break;
						case 'D': sprite = new Diamond(x, y); break;
						case 'S': sprite = new ExitPortal(x, y); break;
						case 'K': sprite = new KillerButterfly(); break;
						default:sprite = new DugDirt(x, y);
								if(map[y][x] == 'P') 
								{
									character = new Character(x, y);
									pan.add(character);
								}
								break;
					}
					sprite.setX(x);
					sprite.setY(y);
					pan.add(sprite);
			}
			}
		}

	}
}
