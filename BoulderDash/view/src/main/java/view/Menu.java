package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * @author Son LUONG
 * @version 1.0
 */


public class Menu extends JFrame
{
	
	public void CreateMenu () 
	{
		setSize(new Dimension(400, 400));
		this.setTitle("BoulderDash");
		setLayout(new BorderLayout());
		JLabel background = new JLabel(new ImageIcon("Image Path"));
		add(background);
		background.setLayout(new FlowLayout());
		JPanel boutonPane = new JPanel();
		JButton bouton2 = new JButton ("Choose Level");
		JButton bouton3 = new JButton ("Exit");
		JButton bouton4 = new JButton ("Help");
		
		bouton2.addActionListener(new ActionListener());
		{
			
		}

	}
	
	

}
