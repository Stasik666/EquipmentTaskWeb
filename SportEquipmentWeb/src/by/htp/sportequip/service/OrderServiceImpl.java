package by.htp.sportequip.service;

import java.sql.Date;

import by.htp.sportequip.dao.OrderDao;
import by.htp.sportequip.dao.OrderDaoImpl;
import by.htp.sportequip.entity.equipment.Equipment;
import by.htp.sportequip.entity.Order;
import by.htp.sportequip.entity.User;

public class OrderServiceImpl implements OrderService {
	
	private OrderDao dao;
	
	public OrderServiceImpl() {
		dao= new OrderDaoImpl();
	}

	@Override
	public Order makeOrder(User user, Equipment equipment, Date start, Date end) {
		
		Order order = new Order();
		order.setEquipment(equipment);
		order.setUser(user);
		order.setDateStart(start);
		order.setDateEnd(end);
		
		dao.createOrder(order);
		
		return null;
	}
	
	

}
