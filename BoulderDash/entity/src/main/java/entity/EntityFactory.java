package entity;

import motionless.*;

public class EntityFactory
{
	protected Wall wall;
	protected FilledDirt filledDirt;
	protected DugDirt dugDirt;
	protected ExitPortal exitPortal;
	
	public Entity makeWall(int x, int y)
	{
		wall = new Wall(x,y);
		return wall;
	}
	
	public Entity makeFilledDirt(int x, int y)
	{
		filledDirt = new FilledDirt(x, y);
		return filledDirt;
	}
	
	public Entity makeDugDirt(int x, int y)
	{
		dugDirt = new DugDirt(x, y);
		return dugDirt;
	}
	
	public Entity makeExitPortal(int x, int y)
	{
		exitPortal = new ExitPortal(x, y);
		return exitPortal;
	}
}