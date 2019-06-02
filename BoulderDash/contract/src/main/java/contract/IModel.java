package contract;

import java.util.Observable;



/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
@SuppressWarnings("deprecation")
public interface IModel {

	/**
	 * Gets the hello world.
	 *
	 * @return the helloworld entity
	 */
	//HelloWorld getHelloWorld();

	/**
	 * Load the message.
	 *
	 * @param code
	 *          the code
	 */
	void loadHelloWorld(String code);

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();
}
