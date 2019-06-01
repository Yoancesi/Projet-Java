package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LaunchDBQuery {
	protected static int level = 0;
	protected static char tab[][] = new char[13][13];
	protected static DBConnection connector;
	protected static MapQuery mapQuery;
	protected static Statement statement = null;
	protected static ResultSet result;
	
	public Launcher(int level){
		Launcher.level = level;
	}
	
	/**
	 * Contains all the query we need to execute
	 */
	public void launchQueries(){
		connector = new DBConnection(level);
		connector.connection();
		
		mapQuery = new MapQuery(level);
		result = mapQuery.executeMapQuery(result, statement);
		mapQuery.setMapQueryIntoTable(result, tab);
	}
}