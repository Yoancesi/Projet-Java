package contract;

import java.sql.ResultSet;
import java.sql.Statement;

public interface IDBConnection {
	
	public Statement connection() throws ClassNotFoundException;
	
	public int getChoice();
	
	public Statement getStatement();

	public ResultSet getResult();
}
