import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Basket {
	
	//Item objects
//    private int totalNumberOfItems = 0;
//    private String ItemsList;
//    private double totalCost;
//	
    
    //Item info
    //Array of items
   	//Remove items 
     //Construct objects

    private ArrayList<Item> myItems = new ArrayList<Item>();
    
    private String listString = myItems.stream().map(Object::toString)
            .collect(Collectors.joining(", "));
    
//    public int getTotalNumberOfItems() {
//		return totalNumberOfItems;
//	}
//
//
//	public void setTotalNumberOfItems(int totalNumberOfItems) {
//		this.totalNumberOfItems = totalNumberOfItems;
//	}

    //Get values and set values
	

	public double getTotalCost(ArrayList<Item> list) {
		
		double sum = 0;
		for (int x = 0; x < list.size(); x++) {
		      sum += (list.get(x)).getItemPrice();
		}
		System.out.print("Total cost of Items = " + "£"+ sum);
		return sum;
	}


//	public void setTotalCost(double totalCost) {
//		this.totalCost = totalCost;
//	}
//	
	
	
	public void getTotalItems (ArrayList<Item> list) {
		
		System.out.println("Total Items = " + list.size());
	}

	
//	public double getItemPrice(ArrayList<Item> list) {
//		
//	}
//	
//	public void addItem(ArrayList newItem) {
//		
//		this.myItems = newItem;
//	}


//	public static ArrayList<Item> getMyItems() {
//		return myItems;
//	}
//
//
//	public static void setMyItems(ArrayList<Item> myItems) {
//		Basket.myItems = myItems;
//	}


	public void addItem(ArrayList<Item> newItem) {
		// TODO Auto-generated method stub
		
		this.myItems = newItem;
		
		
		
	}

	public void getBasket(ArrayList<Item> itemList) 
    {
    	for(int i=0;i<itemList.size();++i)
    	{
    		itemList.get(i).Print();
    	}
    }
	
	
	
//	public void totalItems(ArrayList<Item> item){
//	    itemlist.add(item);
//	    totalcost += item.getCost();
//	}
//	
//	public String getBasketSummary() {
//		
//		for (int i = 0; i < myItems.size(); i++) {
//			myItems.get(i);
//			System.out.print(I);
//		}
//		return listString;
//		
//		
//		
//	}
//	
//	public void showBasket () {
//		
//		PrintItems();
//		
//	}
//	
//	public void PrintItems() {
//		Arrays.toString(myItems.toArray());
//
//	}
//	
	
	
	
	
    
    
    
}