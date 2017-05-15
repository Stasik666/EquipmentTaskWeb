package by.htp.sportequip.util;

public final class ConstantValue {

	private ConstantValue(){}
	
	public static final String ACTION_AUTHORISE = "login";
	public static final String ACTION_MAKE_ORDER = "create_order";
	public static final String ACTION_ORDER = "make_order";
	
	public static final String PAGE_ADMIN_MAIN = "/admin.jsp";
	public static final String PAGE_USER_MAIN = "/user.jsp";
	public static final String PAGE_ERROR = "/error.jsp";
	public static final String PAGE_DEFAULT = "/index.html";
	public static final String PAGE_ORDER_ALL = "/orders.jsp";
	public static final String PAGE_ORDER_CREATE = "/order.jsp";
	
	public static final String REQUEST_PARAM_ACTION = "";
	public static final String REQUEST_PARAM_AUTHORISE = "";
	public static final String REQUEST_PARAM_LOGIN = "login";
	public static final String REQUEST_PARAM_PASSWORD = "pass";
	public static final String REQUEST_PARAM_LIST_EQ = "list_eq";
	public static final String REQUEST_PARAM_ERROR_MSG = "error_msg";

	public static final String PARAM_USER_ID = "id";
	public static final String PARAM_EQUIPMENT_ID = "id";
	public static final String PARAM_DATE_START = "date_start";
	public static final String PARAM_DATE_END = "date_end";
	
	public static final String SQL_STATEMENT_SELECT_PRODUCTS = "SELECT Product.id,Category.title,itemName.title,"
			+ "Product.title,price,year,itemType.title,weight,color,type,size,length,rented "
			+ "From PRoduct,Category,ItemName,itemType "
			+ "Where Product.category=category.num AND Product.itemName=ItemName.num AND Product.itemType=ItemType.num;";
	public static final String SQL_STATEMENT_SELECT_USERS = "select * from client";
	public static final String SQL_STATEMENT_SELECT_USER = "select * from client where login = ? and password = ?";
	public static final String SQL_STATEMENT_ORDER_CREATE = "INSERT INTO sportequipment.order (client, pre-order, date_start, date_end) VALUES (?, ?, ?, ?);"; 
}
