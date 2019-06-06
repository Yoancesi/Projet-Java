package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import contract.IModel;

/**
 * The Class ViewFrame.
 *
 * @author saja
 */
public class ViewFrame extends JFrame{

	private IModel						model;
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -697358409737458175L;

	/**
	 * Frame class constructor
	 */
	public ViewFrame(IModel model)
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("BoulderDash");
		this.model = model;
		this.setResizable(false);
		this.setSize(512, 512);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		System.out.println("created frame");
	}
	

	protected IModel getModel() {
		return this.model;
	}

	private void setModel(final IModel model) {
		this.model = model;
	}

	/**
	 * Prints the message.
	 *
	 * @param message
	 *          the message
	 */
	public void printMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	
}
