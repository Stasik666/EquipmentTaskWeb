package by.htp.sportequip.service;

import java.util.List;
import by.htp.sportequip.dao.ProductDao;
import by.htp.sportequip.dao.ProductDaoImpl;
import by.htp.sportequip.entity.Product;

public class ProductServiceImpl implements ProductService {
	
	private ProductDao dao;
	
	public ProductServiceImpl() {
		dao = new ProductDaoImpl();
	}

	@Override
	public List<Product> list() {
		List<Product> list = dao.getList();
		return list;
	}
	
	

}
