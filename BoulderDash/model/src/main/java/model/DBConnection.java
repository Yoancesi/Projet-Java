package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import contract.IDBConnection;

public class DBConnection extends Launcher implements IDBConnection {
	private final String URL = "localhost/phpmyadmin/db_structure.php?server=1&db=projet-java";
	private final String LOGIN = "root";
	private final String PASSWORD = "";
	private Connection connection = null;
	private int choice = 0;
	
	/**
	 * Constructor of DAOConnector
	 * 
	 * @param level
	 */
	public DBConnection(int level) {
		super(level);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Connection to the remote database
	 * @return 
	 */
	public Statement connection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
			statement = connection.createStatement();
		} catch (final ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return statement;
	}

	/* (non-Javadoc)
	 * @see model.IDAOTest#getChoice()
	 */
	public int getChoice() {
		return choice;
	}

	/* (non-Javadoc)
	 * @see model.IDAOConnector#getStatement()
	 */
	public Statement getStatement() {
		return statement;
	}

	/* (non-Javadoc)
	 * @see model.IDAOConnector#getResult()
	 */
	public ResultSet getResult() {
		return result;
	}

}