package contract;

import contract.UserOrder;

public interface IBDKeyListener {
	/**
	 * @param keyCode
	 * @return
	 */
	public UserOrder keyCodeToUserOrder(final int keyCode);
	
	/**
	 * @return
	 */
	public IController getController();

	/**
	 * @param controller
	 */
	public void setController(IController controller);
}