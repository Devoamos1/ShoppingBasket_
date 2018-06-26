import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Basket {
	
	//Item objects
//    private int totalNumberOfItems = 0;
//    private String ItemsList;
    private double totalCost = 0;
//	
    
    //Item info
    //Array of items
   	//Remove items 
     //Construct objects

    private ArrayList<Item> myItems = new ArrayList<Item>();
    
    private String listString = myItems.stream().map(Object::toString)
            .collect(Collectors.joining(", "));
    

	public double getTotalCost() {
		
		double sum = 0;
		for (int x = 0; x < myItems.size(); x++) {
		      sum += (myItems.get(x)).getItemPrice();
		}
		System.out.print("Total cost of Items = " + "£"+ sum);
		return sum;
	}

	public void getTotalItems (ArrayList<Item> list) {
		
		System.out.println("Total Items = " + list.size());
	}

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
  
}
