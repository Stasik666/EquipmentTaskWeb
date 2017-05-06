package by.htp.sportequip.file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import by.htp.sportequip.entity.Product;
import by.htp.sportequip.entity.Tenant;
import by.htp.sportequip.list.RentStation;
import by.htp.sportequip.list.TenantList;

public abstract class SAXReaderXML {
		
	public static void initTenant(TenantList list) {
		
		XMLReader reader;
		try {
			reader = XMLReaderFactory.createXMLReader();
			TenantHandler handler = new TenantHandler();
			reader.setContentHandler(handler);
			reader.parse(new InputSource("resourse/dataxml/TenantXML.xml"));
			List<Tenant> tenantList = handler.getTenantList();
			for (Tenant tenant : tenantList) {
				list.add(tenant);
			}
			
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initProduct(RentStation list) {
		
		XMLReader reader;
		try {
			reader = XMLReaderFactory.createXMLReader();
			ProductHandler handler = new ProductHandler();
			reader.setContentHandler(handler);
			reader.parse(new InputSource("resourse/dataxml/AvailableEquipmentXML.xml"));
			List<Product> productList = handler.getProductList();
			for (Product product : productList) {
				list.add(product);
			}
			
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
	public static List<Product> getListProduct() {
		
		List<Product> productList = new ArrayList<Product>();
		XMLReader reader;
		
		try {
			reader = XMLReaderFactory.createXMLReader();
			ProductHandler handler = new ProductHandler();
			reader.setContentHandler(handler);
			
			reader.parse(new InputSource(new FileInputStream("resourse/dataxml/AvailableEquipmentXML.xml")));
			productList = handler.getProductList();
			
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return productList;
	}
}
