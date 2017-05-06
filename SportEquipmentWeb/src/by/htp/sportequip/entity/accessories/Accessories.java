package by.htp.sportequip.entity.accessories;

import by.htp.sportequip.entity.Category;
import by.htp.sportequip.entity.Product;

public abstract class Accessories extends Product{
	
	public Accessories(Category category,String title, double price, int year) {
		super(category,title,price,year);
		this.setItemType("Accessories");
	}
		
	public Accessories() {
		super();
		this.setItemType("Accessories");
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
