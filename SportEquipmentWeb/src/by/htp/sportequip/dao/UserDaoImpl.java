package by.htp.sportequip.dao;

import static by.htp.sportequip.util.ConstantValue.SQL_STATEMENT_SELECT_USER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import by.htp.sportequip.entity.User;

public class UserDaoImpl implements UserDao{

	@Override
	public User fetchByCredentials(String login, String password) {
		
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String dbUrl = rb.getString("db.url");
		String dbUser = rb.getString("db.login");
		String dbPass = rb.getString("db.pass");
		String driverName = rb.getString("db.driver.name");
		
		User user = null;
		
		try {	
			Class.forName(driverName);
			
			Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
			/*Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(SQL_STATEMENT_SELECT_USER);*/
			
			PreparedStatement ps = conn.prepareStatement(SQL_STATEMENT_SELECT_USER);			
			ps.setString(1, login);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			
			/*while(rs.next()) {
				String log = rs.getString(2);
				String pass = rs.getString(3);
				
				System.out.println(dbUser);
				System.out.println(dbPass);
			}*/
			if(rs.next()) {
				String log = rs.getString(5);
				String pass = rs.getString(6);
				boolean role = rs.getBoolean(7);
				
				user = new User();
				user.setLogin(log);
				user.setPassword(pass);
				user.setRole(role);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return user;
	}

}
