import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class CreateBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String item1name, item2name, item1info, item2info, item3name, item3info;
		double item1price, item2price, item3price;
		
		item1name = "Mac Book Pro";
		item1info = "256GB, 4GB RAM, 2.6hz CPU";
	    item1price = 799; 
	    
	    item2name = "Dell GMC";
		item2info = "500GB, 8GB RAM, 3.6hz CPU";
	    item2price = 220.50; 
		
		
		//Add ArrayList
		ArrayList<Item> myItems = new ArrayList<Item>();
		
		//Create new item
		Item newitem1 = new Item(item1name, item1info, item1price); 	
		Item newitem2 = new Item(item2name, item2info, item2price);
		

//		newitem1.setItemName("MacBook Pro");
//		newitem1.setItemInfo("256GB, 4GB RAM, 2.6hz CPU");
//		newitem1.setPrice(3.82);
		
//		newitem2.setItemName("Dell GMC");
//		newitem2.setItemInfo("500GB, 8GB RAM, 3.6hz CPU");
//		newitem2.setPrice(220.50);

		myItems.add(newitem1);
		myItems.add(newitem2);
		myItems.add(newitem2);
		
		//Create new Basket
		Basket newBasket = new Basket();
		
		newBasket.addItem(myItems);
		
		//System.out.println(newBasket.getTotalNumberOfItems());
	    newBasket.getBasket(myItems);
		newBasket.getTotalItems(myItems);
		newBasket.getTotalCost();
		
		//newBasket.showBasket();
	
	}
	

}
