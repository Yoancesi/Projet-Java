package contract;

import java.sql.ResultSet;
import java.sql.Statement;

public interface IDBConnection {
	
	public void connection();
	
	public int getChoice();
	
	public Statement getStatement();

	public ResultSet getResult();
}