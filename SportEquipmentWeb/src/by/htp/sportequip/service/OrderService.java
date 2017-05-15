package by.htp.sportequip.service;

import java.sql.Date;

import by.htp.sportequip.entity.equipment.Equipment;
import by.htp.sportequip.entity.Order;
import by.htp.sportequip.entity.User;

public interface OrderService {
	
	public Order makeOrder(User user, Equipment equipment,Date start,Date end);
	

}
