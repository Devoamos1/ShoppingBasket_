import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
		
	    
	    item3name = "Microsoft Surface Pro";
		item3info = "500GB, 8GB RAM, 3.6hz CPU";
	    item3price = 220.50; 
		//Create new item
		Item newitem1 = new Item(item1name, item1info, item1price); 	
		Item newitem2 = new Item(item2name, item2info, item2price);
		Item newitem3 = new Item(item3name, item3info, item3price);
		

		
		myItems.add(newitem1);
		myItems.add(newitem2);
		myItems.add(newitem3);
		
		//Create new Basket
		Basket newBasket = new Basket();
		
		Iterator<Item> i = myItems.iterator();
        String []choices = new String[myItems.size()];
        while(i.hasNext())
        {
            for(int j = 0; j < myItems.size(); j++)
            {
                Item p = i.next();
                choices[j] = p.getItemName() + " " + p.getItemInfo() + " " + p.getItemPrice();
            }
        }
        JOptionPane.showInputDialog(null, "Choose supplier of the product !!", "Select Supplier", JOptionPane.QUESTION_MESSAGE,null, choices, "----");
		
		newBasket.addItem(myItems);
		
		//System.out.println(newBasket.getTotalNumberOfItems());
	    newBasket.getBasket(myItems);
		newBasket.getTotalItems(myItems);
		newBasket.getTotalCost(myItems);
		//newBasket.showBasket();
	
	}
	

}
