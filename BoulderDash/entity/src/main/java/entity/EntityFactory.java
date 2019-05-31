package entity;

import motionless.*;

public class EntityFactory
{
	protected static Wall wall;
	protected static FilledDirt filledDirt;
	protected static DugDirt dugDirt;
	protected static ExitPortal exitPortal;
	
	public static Entity makeWall(int x, int y)
	{
		wall = new Wall(x,y);
		return wall;
	}
	
	public static Entity makeFilledDirt(int x, int y)
	{
		filledDirt = new FilledDirt(x, y);
		return filledDirt;
	}
	
	public static Entity makeDugDirt(int x, int y)
	{
		dugDirt = new DugDirt(x, y);
		return dugDirt;
	}
	
	public static Entity makeExitPortal(int x, int y)
	{
		exitPortal = new ExitPortal(x, y);
		return exitPortal;
	}
}