package by.htp.sportequip.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static by.htp.sportequip.util.ConstantValue.*;

public class MakeOrderAction implements CommandAction {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		return PAGE_ORDER_CREATE;
	}
	
	

}
