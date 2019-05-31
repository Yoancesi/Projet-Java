package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		
		bouton2.addActionListener(new ActionListener()
		{
		
			private int choice = 0;

			public void actionPerformed(ActionEvent event)
			{
				String[] level = { "Level 1", "Level 2", "Level 3", "Level 4", "Level 5" };
				JOptionPane jop = new JOptionPane();
				String name = (String) JOptionPane.showInputDialog(null, "Choose your level !", "The choice", JOptionPane.QUESTION_MESSAGE, null, level, level[0]);
				switch (name)
				{
				case "Level 1":
					this.choice = 1;
					break;
					
				case "Level 2":
					this.choice = 2;
					break;
					
				case "Level 3":
					this.choice = 3;
					break;
					
				case "Level 4":
					this.choice = 4;
					break;
					
				case "Level 5":
					this.choice = 5;
					break;
				}
			}
		});
		
		bouton3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event) 
			{
				fermer();
			}
			
		});
		
		bouton4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event) 
			{
				javax.swing.JOptionPane.showMessageDialog(null,
						"The goal of the game is to collect the specific number of diamonds."
						+ "\nYou handle Rockford, a miner. It can move horizontally and vertically."
						+ "\nHe can dig the ground and pick up diamonds."
						+ "\nWhile digging, it can make rocks fall. If a rock falls on it, the game is lost."
						+ "\nEnemies can also kill him."
						+ "\nOnce all diamonds are recovered, reach the exit to complete the level.");
						
			}
			
		});
		
		boutonPane.add(bouton2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(boutonPane, BorderLayout.SOUTH);
		this.setVisible(true);
		boutonPane.add(bouton3);
		boutonPane.add(bouton4);				
		
	}

	protected void fermer() {
		// TODO Auto-generated method stub
		
	}
	
	

}
