/**
 * 
 */
package mobile;

import java.awt.Image;
import java.awt.Point;

import showboard.IPawn;

/**
 * @author saja
 *
 */
public interface IMobile extends IPawn {
	int getX();

    int getY();

    Point getPosition();
}
