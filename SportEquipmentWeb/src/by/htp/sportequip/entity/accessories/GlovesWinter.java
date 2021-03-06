package by.htp.sportequip.entity.accessories;

import by.htp.sportequip.entity.Category;

public class GlovesWinter extends Accessories{
	
	private double size;
	
	public GlovesWinter(String[] data){
		super(Category.valueOf(data[2]), data[4], Double.parseDouble(data[5]), Integer.parseInt(data[6]));
		size = Double.parseDouble(data[7]);
		setItemName(data[1]);
	}
	
	public GlovesWinter(Category category,String title, double price, int year,double size) {
		super(category,title, price, year);
		this.size = size;
		this.setItemName("GlovesWinter");
	}

	public GlovesWinter() {
		super();
		this.setItemName("GlovesWinter");
	}

	public double getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(size);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		GlovesWinter other = (GlovesWinter) obj;
		if (Double.doubleToLongBits(size) != Double.doubleToLongBits(other.size))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() +", Size=" + size;
	}
	
	
	
}
