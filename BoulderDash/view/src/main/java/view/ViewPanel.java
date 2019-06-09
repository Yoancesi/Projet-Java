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
 * @author saja, marwan
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
	char map[][] = {
			{'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
			{'X', 'P', 'X', 'X', 'O', 'V', 'V', 'C', 'X', 'O', 'V', 'X'},
			{'X', 'V', 'C', 'C', 'D', 'C', 'X', 'V', 'C', 'D', 'C', 'X'},
			{'X', 'C', 'D', 'O', 'C', 'X', 'D', 'O', 'C', 'V', 'C', 'X'},
			{'X', 'V', 'C', 'C', 'V', 'V', 'C', 'X', 'O', 'C', 'X', 'X'},
			{'X', 'V', 'X', 'X', 'O', 'X', 'V', 'V', 'C', 'C', 'V', 'X'},
			{'X', 'C', 'V', 'C', 'V', 'C', 'X', 'C', 'V', 'O', 'X', 'X'},
			{'X', 'C', 'O', 'V', 'C', 'V', 'X', 'V', 'C', 'V', 'C', 'X'},
			{'X', 'V', 'D', 'V', 'V', 'C', 'C', 'C', 'X', 'V', 'V', 'X'},
			{'X', 'C', 'V', 'C', 'X', 'O', 'C', 'V', 'O', 'O', 'S', 'X'},
			{'X', 'X', 'V', 'C', 'V', 'V', 'C', 'C', 'C', 'V', 'C', 'X'},
			{'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
	};
	
	
	
	
	
	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *  
	 */
	public ViewPanel(final ViewFrame viewFrame) {
		viewFrame.add(this);
		viewFrame.getModel().getObservable().addObserver(this);
		 for (int x=0; x < 12; x++) {
	            for (int y=0; y < 12; y++) {
	            	System.out.println(map[x][y]);
	          }
		 }
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
		

		for(int y=0; y < 12; y++)
		{
			System.out.println("entered first for");
			int x;
			for( x=0; x <12; x++)
			{
				setVisible(true);
				switch(map[x][y])
				{
					case 'X': entity = new Wall(x, y); break;
					case 'V': entity = new FilledDirt(x, y); break;
					case 'C': entity = new FilledDirt(x, y); break;
					case 'D': entity = new Diamond(x, y); break;
					case 'S': entity = new ExitPortal(x, y); break;
					case 'K': entity = new KillerButterfly(x, y); break;
					case 'P': entity = new Character(x, y);
					default: entity = new Boulder(x, y);

							break;
				}
				((Entity) entity).setX(x);
				((Entity) entity).setY(y);
				if (((Entity) entity).getImage() == null)
					System.out.println("entity img null");
				add(entity);
				System.out.println("added entity to panel");
				repaint();
			}
		}
		//((JComponent) ((Entity) entity).getImage()).setSize(20, 20);
		System.out.println("after switch");
		setVisible(true);
		//repaint();
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
        for (int x=0; x < 12; x++) {
            for (int y=0; y < 12; y++) {
                entity = getEntity(x,y);
                graphics.drawImage(((Entity)entity).getImage(), entity.getX()+(x*16), entity.getY()+(y*16), this);
            }
        }
        if (((Entity) entity).getImage() == null)
            System.out.println("imgnull");
        System.out.println("paint components");
        setVisible(true);
        }

	
	public JComponent  getEntity(int x, int y) {	
        switch(this.map[x][y])
        {
            case 'X': entity = new Wall(x, y); 
            return entity;
            case 'V': entity = new FilledDirt(x, y); 
            return entity;
            case 'C': entity = new FilledDirt(x, y); 
            return entity;
            case 'D': entity = new Diamond(x, y); 
            return entity;
            case 'S': entity = new ExitPortal(x, y); 
            return entity;
            case 'P': entity = new Character(x, y);
                ((Entity) entity).setX(x);
                ((Entity) entity).setY(y);
                return entity;
            default:entity = new Boulder(x, y);
            return entity;
        }
	}
}