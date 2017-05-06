package by.htp.sportequip.file;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import by.htp.sportequip.entity.Product;
import by.htp.sportequip.entity.Tenant;
import by.htp.sportequip.entity.accessories.Glasses;
import by.htp.sportequip.entity.accessories.Gloves;
import by.htp.sportequip.entity.accessories.GlovesWinter;
import by.htp.sportequip.entity.accessories.Helmet;
import by.htp.sportequip.entity.accessories.Protection;
import by.htp.sportequip.entity.accessories.Skipoles;
import by.htp.sportequip.entity.equipment.Bike;
import by.htp.sportequip.entity.equipment.Skate;
import by.htp.sportequip.entity.equipment.Skies;
import by.htp.sportequip.list.RentStation;
import by.htp.sportequip.list.TenantList;

public abstract class ReaderFile {
	
	public static void initProduct(RentStation list) {
		BufferedReader readFromFile = null;
		String line;
		try {
			readFromFile = new BufferedReader(new FileReader("resourse/data/AvailableEquipment"));
			while ((line = readFromFile.readLine()) != null) {
				String[] data = line.split(", ");
				list.add((createNewProduct(data)));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (readFromFile != null)
				try {
					readFromFile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
 
	}
	
	public static void initTenant(TenantList list) {
		
		BufferedReader readFromFile = null;
		String line;
		try {
			readFromFile = new BufferedReader(new FileReader("resourse/data/ClientData"));
			while ((line = readFromFile.readLine()) != null) {
				String[] data = line.split(", ");
				list.add(new Tenant(data));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (readFromFile != null)
				try {
					readFromFile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
 
	}
	private static Product createNewProduct(String[] data){
		Product newProduct = null;
		switch (data[1]){
		case "Glasses":
			newProduct =  new Glasses(data);
			break;
		case "Gloves":
			newProduct =  new Gloves(data);
			break;
		case "GlovesWinter":
			newProduct =  new GlovesWinter(data);
			break;
		case "Helmet":
			newProduct =  new Helmet(data);
			break;
		case "Protection":
			newProduct =  new Protection(data);
			break;
		case "Skipoles":
			newProduct =  new Skipoles(data);
			break;
		case "Bike":
			newProduct =  new Bike(data);
			break;
		case "Skies":
			newProduct =  new Skies(data);
			break;
		case "Skate":
			newProduct =  new Skate(data);
			break;
			
		}
		return newProduct;
	}
	
	public static void writeToFile(String fileName, Object[] list) {
	    File file = new File(fileName);
	 
	    try {
	        if(!file.exists()){
	            file.createNewFile();
	        }
	 
	        PrintWriter out = new PrintWriter(file.getAbsoluteFile());
	 
	        try {
	        	for(Object item: list){
	        		 out.print(item);
	        	}
	        } finally {
	            out.close();
	        }
	    } catch(IOException e) {
	        throw new RuntimeException(e);
	    }
	}
			
}
