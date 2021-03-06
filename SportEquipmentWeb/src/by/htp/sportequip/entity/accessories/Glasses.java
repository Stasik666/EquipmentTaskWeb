package by.htp.sportequip.entity.accessories;

import by.htp.sportequip.entity.Category;

public class Glasses extends Accessories{
	
	private String type;
	
	public Glasses(String[] data){
		super(Category.valueOf(data[2]), data[4], Double.parseDouble(data[5]), Integer.parseInt(data[6]));
		type = data[7];
		setItemName(data[1]);
	}
	
	public Glasses(Category category,String title, double price, int year,String type) {
		super(category,title, price, year);
		this.type = type;
		this.setItemName("Glasses");
	}

	public Glasses() {
		super();
		this.setItemName("Glasses");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Glasses other = (Glasses) obj;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() +", Type=" + type;
	}

	
}
	
	

