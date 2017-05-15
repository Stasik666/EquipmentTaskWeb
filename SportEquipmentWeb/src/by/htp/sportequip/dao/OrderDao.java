package by.htp.sportequip.dao;

import java.sql.Date;
import java.util.List;

import by.htp.sportequip.entity.equipment.Equipment;
import by.htp.sportequip.entity.Order;
import by.htp.sportequip.entity.User;

public interface OrderDao {
	
	//boolean createOrder(User user,Equipment equipment, Date star, Date end);
	boolean createOrder(Order order);
	List<Order> fetchAll();

}
