package contract;

import java.sql.ResultSet;
import java.sql.Statement;

public interface ICreateMAP {

	/**
	 * @param result
	 * @param statement
	 */
	public ResultSet executeMapQuery(ResultSet result, Statement statement);
	  
	/**
	 * @param result
	 * @param tab
	 */
	 
	public void setMapQueryIntoTable(ResultSet result, char[][] tab);
}
