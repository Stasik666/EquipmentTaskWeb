package by.htp.sportequip.service;

import java.util.List;

import by.htp.sportequip.entity.Product;
import by.htp.sportequip.file.SAXReaderXML;;

public class EquipmentServiceImpl implements EquipmentService {

	@Override
	public List<Product> list() {
		List<Product> list = SAXReaderXML.getListProduct();
		return list;
		
	}

}
