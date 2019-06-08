package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Panel;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JComponent;
import javax.swing.JPanel;
import contract.*;
import model.CreateMAP;
import model.Launcher;
import entity.Entity;
import mobile.Boulder;
import mobile.Character;
import mobile.Diamond;
import mobile.KillerButterfly;
import motionless.DugDirt;
import motionless.ExitPortal;
import motionless.FilledDirt;
import motionless.Wall;
//import model.*;

/**
 * The Class ViewPanel.
 *
 * @author saja
 */
public class ViewPanel extends JPanel implements Observer {

	/** The view frame. */
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;
	Font font = new Font("Sah quel plaisir", Font.BOLD, 15);
	private int diamondsGet = 0;
	private int finalDiamonds;
	protected IModel model;
	protected JComponent entity;
	
	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *  
	 */
	public ViewPanel(final ViewFrame viewFrame) {
		viewFrame.add(this);
		viewFrame.getModel().getObservable().addObserver(this);	
	}
	
	public int counterDiamond(Graphics g)
	{
		g.setFont(font);
		g.setColor(Color.black);
		g.drawString("Diamonds : " + diamondsGet + "/" + finalDiamonds, 10, 365);
		this.finalDiamonds = diamondsGet;
		return finalDiamonds;
	}
	
	
	public IModel getModel() {
		return model;
	}

	public void setModel(IModel model) {
		this.model = model;
	}

	public int getFinalDiamonds() {
		return finalDiamonds;
	}
	
	/**
	 * @param g
	 */
	/*
	public void updateCount(Graphics g)
	{
		g.setColor(Color.white);
		g.fillRect(0, 0, 800, 500);
	}*/
	
	
	public void update()
	{
		this.repaint();
	}
	
	public int getDiamondsGet()
	{
		return diamondsGet;
	}

	public void makeMap()
	{
		
		setVisible(true);
		
		char map[][] = {
				{'D', 'X', 'X'},
				{'X', 'P', 'X'}
		};

		for(int y=0; y < 2; y++)
		{
			System.out.println("entered first for");
			int x;
			for( x=0; x <2; x++)
			{
				setVisible(true);
				switch(map[x][y])
				{
					case 'X': entity = new Wall(x, y); break;
					case 'V': entity = new DugDirt(x, y); break;
					case 'C': entity = new Boulder(x, y); break;
					case 'D': entity = new Diamond(x, y); break;
					case 'S': entity = new ExitPortal(x, y); break;
					case 'K': entity = new KillerButterfly(); break;
					default:entity = new FilledDirt(x, y);
							if(map[y][x] == 'P') 
							{
								entity = new Character(x, y);
								((Entity) entity).setX(x);
								((Entity) entity).setY(y);
								add(entity);
							}
							break;
				}
				((Entity) entity).setX(x);
				((Entity) entity).setY(y);
				if (((Entity) entity).getImage() == null)
					System.out.println("entity img null");
				add(entity);
				System.out.println("added entity to panel");
			}
		}
		//((JComponent) ((Entity) entity).getImage()).setSize(20, 20);
		System.out.println("after switch");
		setVisible(true);
		repaint();
		//validate();
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
	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		setVisible(true);
		graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
		graphics.drawImage(((Entity) entity).getImage(), entity.getX(), entity.getY(), null);
		if (((Entity) entity).getImage() == null)
			System.out.println("imgnull");
		System.out.println("paint components");
		setVisible(true);
		}
}

