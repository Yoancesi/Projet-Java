package contract;

import contract.UserOrder;
/**
 * The Interface IController.
 */

public interface IController {

	/**
	 * Control.
	 */
	public void control();

	/**
	 * Order perform.
	 *
	 * @param controllerOrder
	 *          the controller order
	 */
	public void orderPerform(UserOrder userorder);
	
	/**
	 * @throws InterruptedException
	 */
	public void directionControl() throws InterruptedException;
	
	/**
	 * @param userOrder
	 */
	public void setStackOrder(final UserOrder userOrder);
}