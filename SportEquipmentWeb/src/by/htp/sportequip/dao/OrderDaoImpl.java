package by.htp.sportequip.dao;

import static by.htp.sportequip.util.ConstantValue.SQL_STATEMENT_SELECT_USER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

import by.htp.sportequip.entity.Order;
import by.htp.sportequip.entity.User;

import static by.htp.sportequip.util.ConstantValue.*;

public class OrderDaoImpl implements OrderDao{

	@Override
	public boolean createOrder(Order order) {
		
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String dbUrl = rb.getString("db.url");
		String dbUser = rb.getString("db.login");
		String dbPass = rb.getString("db.pass");
		String driverName = rb.getString("db.driver.name");
		
		try {	
			Class.forName(driverName);
			
			Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
			/*Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(SQL_STATEMENT_SELECT_USER);*/
			
			PreparedStatement ps = conn.prepareStatement(SQL_STATEMENT_ORDER_CREATE, PreparedStatement.RETURN_GENERATED_KEYS);			
			/*ps.setString(1, login);
			ps.setString(2, password);*/
			ps.setLong(1, order.getUser().getUserId());
			ps.setLong(2, order.getEquipment().getId());
			ps.setDate(3, order.getDateStart());
			ps.setDate(4, order.getDateEnd());
			
			int id = ps.RETURN_GENERATED_KEYS;
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 catch (ClassNotFoundException e) {
			e.printStackTrace();
		}		
		return false;
	}

	@Override
	public List<Order> fetchAll() {
		
		return null;
	}
	
	

}
