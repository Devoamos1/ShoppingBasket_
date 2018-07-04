
public class Item {
	
	//Item attributes
	private static int itemNum = 0;
	private String itemNumber;
	private String itemName;
	private String itemInfo;
	private double price;
	
	
	
	
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

	public double getItemPrice() {//Create item price
		return price;
	}

	public void setPrice(double price) {
		//Set price error
		this.price = price;
	}
	
	
	public String Print()
	{
		
//		System.out.println(getItemName() + " "+ getItemInfo());
//		System.out.print("Price:" + "£"+ getItemPrice());
//		System.out.println("");
		
		String details = getItemName() + "\n"+ getItemInfo() +  "\nPrice:"+ "£"+ getItemPrice();
		
		return details;
	}



	
}
	
