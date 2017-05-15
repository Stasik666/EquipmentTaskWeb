package by.htp.sportequip.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.sportequip.entity.Product;
import by.htp.sportequip.entity.User;
import by.htp.sportequip.service.ProductService;
import by.htp.sportequip.service.ProductServiceImpl;
import by.htp.sportequip.service.ServiceNoSuchUserException;
import by.htp.sportequip.service.UserService;
import by.htp.sportequip.service.UserServiceImpl;
import static by.htp.sportequip.util.ConstantValue.*;

public class LoginCommandAction implements CommandAction{
	
	private UserService userService;
	private ProductService equipService;
	
	public LoginCommandAction(){
		userService = new UserServiceImpl();
		equipService = new ProductServiceImpl();
	}
	
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String page = PAGE_DEFAULT;
		
		String login = request.getParameter(REQUEST_PARAM_LOGIN);
		String password = request.getParameter(REQUEST_PARAM_PASSWORD);
		
		User user;
		try {
			user = userService.authorise(login, password);
			
			if(!user.isRole()){
				List<Product> equipment = equipService.list();
				request.setAttribute(REQUEST_PARAM_LIST_EQ, equipment);
				page = PAGE_USER_MAIN;
			}
			else {
				// add report
				page = PAGE_ADMIN_MAIN;
			}
		} catch (ServiceNoSuchUserException e) {
			page = PAGE_ERROR;
			request.setAttribute(REQUEST_PARAM_ERROR_MSG, e.getMessage());
			//e.printStackTrace();
		}
		return page;
	}

}
