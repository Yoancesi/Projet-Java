package model;

import java.sql.ResultSet;
import java.sql.Statement;
import contract.*;


public class Launcher implements ILauncher{
	protected static int level = 1;
	protected static char tab[][] = new char[13][13];
	protected static DBConnection connector;
	protected static CreateMAP mapQuery;
	protected static Statement statement = null;
	protected static ResultSet result;
	
	public Launcher(int level){
		Launcher.level = level;
	}
	
	
	public void launcher(){
		connector = new DBConnection(level);
		connector.connection();
		
		CreateMAP CreateMAP = new CreateMAP(level);
		result = CreateMAP.executeMapQuery(result, statement);
		mapQuery.setMapQueryIntoTable(result, tab);
	}
	
	public char[][] getTable() {
		return tab;	
	}
}