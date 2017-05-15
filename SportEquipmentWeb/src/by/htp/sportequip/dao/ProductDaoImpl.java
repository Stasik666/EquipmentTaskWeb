package by.htp.sportequip.dao;

import static by.htp.sportequip.util.ConstantValue.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import static by.htp.sportequip.file.TagName.*;
import by.htp.sportequip.entity.Category;
import by.htp.sportequip.entity.Product;
import by.htp.sportequip.entity.User;
import by.htp.sportequip.entity.accessories.Glasses;
import by.htp.sportequip.entity.accessories.Gloves;
import by.htp.sportequip.entity.accessories.GlovesWinter;
import by.htp.sportequip.entity.accessories.Helmet;
import by.htp.sportequip.entity.accessories.Protection;
import by.htp.sportequip.entity.accessories.Skipoles;
import by.htp.sportequip.entity.equipment.Bike;
import by.htp.sportequip.entity.equipment.Skate;
import by.htp.sportequip.entity.equipment.Skies;
import by.htp.sportequip.file.TagName;

public class ProductDaoImpl implements ProductDao{

	@Override
	public  List<Product> getList() {
		
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String dbUrl = rb.getString("db.url");
		String dbUser = rb.getString("db.login");
		String dbPass = rb.getString("db.pass");
		String driverName = rb.getString("db.driver.name");
		
		List<Product> list = new ArrayList<Product>();
		
		try {	
			Class.forName(driverName);
			
			Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
			
			PreparedStatement ps = conn.prepareStatement(SQL_STATEMENT_SELECT_PRODUCTS);			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				TagName tagName = TagName.valueOf(rs.getString(3).toUpperCase());
				//1-id,2-category,3-itemName,4-title,5-price,6-year,7-itemType,8-weight,9-color,10-type,11-size,12-length,13-rented
				switch(tagName){
				case BIKE:
					list.add(new Bike(rs.getString(4),rs.getDouble(5),rs.getInt(6),
						rs.getDouble(8),rs.getString(9),rs.getString(10)));
					break;
				case SKATE:
					list.add(new Skate(rs.getString(4),rs.getDouble(5),rs.getInt(6),
							rs.getDouble(8),rs.getString(9),rs.getDouble(12)));
					break;
				case SKIES:
					list.add(new Skies(rs.getString(4),rs.getDouble(5),rs.getInt(6),
							rs.getDouble(8),rs.getString(9),rs.getDouble(12)));
					break;
				case GLASSES:
					list.add(new Glasses(Category.valueOf(rs.getString(2)),rs.getString(4),rs.getDouble(5),rs.getInt(6),rs.getString(10)));
					break;
				case GLOVES:
					list.add(new Gloves(Category.valueOf(rs.getString(2)),rs.getString(4),rs.getDouble(5),rs.getInt(6),rs.getDouble(11)));
					break;
				case GLOVESWINTER:
					list.add(new GlovesWinter(Category.valueOf(rs.getString(2)),rs.getString(4),rs.getDouble(5),rs.getInt(6),rs.getDouble(11)));
					break;
				case HELMET:
					list.add(new Helmet(Category.valueOf(rs.getString(2)),rs.getString(4),rs.getDouble(5),rs.getInt(6),rs.getDouble(11),rs.getString(9)));
					break;
				case PROTECTION:
					list.add(new Protection(Category.valueOf(rs.getString(2)),rs.getString(4),rs.getDouble(5),rs.getInt(6),rs.getDouble(11)));
					break;
				case SKIPOLES:
					list.add(new Skipoles(Category.valueOf(rs.getString(2)),rs.getString(4),rs.getDouble(5),rs.getInt(6),rs.getDouble(12)));
					break;
				default:
					break;
			}	
				for(Product e:list){
					System.out.println(e);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
}
