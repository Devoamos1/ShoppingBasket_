import java.util.ArrayList;

public class Item {
	
	//Item attributes
	private int id;
	private String itemName;
	private String itemInfo;
	private double price;
	
	//Items
	String item1name = "MacBook Pro";
	String item1info = "256GB, 4GB RAM, 2.6hz CPU";
	double item1price = 1300; 
	
	String item2name = "Dell GMC";
	String item2info = "500GB, 8GB RAM, 3.6hz CPU";
	double item2price = 899; 

	String item3name = "HP Pavillion";
	String item3info = "1TB, 16GB RAM 2.6hz CPU";
	double item3price = 450; 
	
	//Initialise fields 
	public Item(String itemName, String itemInfo, double price) { //Item instance
		this.itemName = itemName; 
		this.itemInfo = itemInfo; 
		this.price = price;
	}
	
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	} 
	
	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {//Create Item Name
		this.itemName = itemName;
	}

	public String getItemInfo() {
		return itemInfo;
	}

	public void setItemInfo(String itemInfo) {//Create Item Info
		this.itemInfo = itemInfo;
	}

	public double getItemPrice() {
		return price;
	}

	public void setPrice(double price) {
		//Set price error
		this.price = price;
	}
	
	
	public void Print()
	{
		System.out.println(getItemName() + " "+ getItemInfo());
		System.out.print("Price:" + "£"+ getItemPrice());
		System.out.println("");
	}



	
}
	