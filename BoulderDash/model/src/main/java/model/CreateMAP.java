package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import contract.*;

public class CreateMAP extends Launcher implements ICreateMAP {
	

	public CreateMAP(int level) {
		super(level);
	}

	/**
	 * Execute a static SQL request
	 * 
	 */
	public ResultSet executeMapQuery(ResultSet result, Statement statement) {
		try {
			switch (level) {
			case 1:
				result = statement.executeQuery("call `Contentlevel1`");
				break;
			case 2:
				result = statement.executeQuery("call `Contentlevel2`");
				break;
			case 3:
				result = statement.executeQuery("call `Contentlevel3`");
				break;
			case 4:
				result = statement.executeQuery("call `Contentlevel4`");
				break;
			case 5:
				result = statement.executeQuery("call `Contentlevel5`");
				break;
			default:
				System.out.print("System error");
				break;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	/* (non-Javadoc)
	 * @see model.IDAOTest#setQueryIntoTable()
	 */
	public void setMapQueryIntoTable(ResultSet result, char[][] tab) {
		try {
			int ligne = 0;
			while (result.next()) {
				for (int colonne = 0; colonne < result.getObject(2).toString().length(); colonne++) {
					tab[ligne][colonne] = result.getObject(2).toString().charAt(colonne);
				}
				ligne++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}