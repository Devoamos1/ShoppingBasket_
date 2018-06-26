import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class CreateBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Item> shoppingItems = new ArrayList<>();
		shoppingItems.add(new Item("MacBook Pro", "256GB, 4GB RAM, 2.6hz CPU", 255));
		shoppingItems.add(new Item("MacBook Pro", "256GB, 4GB RAM, 2.6hz CPU", 255));
		shoppingItems.add(new Item("MacBook Pro", "256GB, 4GB RAM, 2.6hz CPU", 255));
		 
		// Code sample starts here
		// -----------------------
		Map<String, List<Basket>> addItem = new HashMap<>();
		addItem.put("Computers", shoppingItems);
		 
		cars.add(new Car("Prius"));
		System.out.println(carsByBrand.get("Toyota"));
		
		//Add ArrayList
		ArrayList<Item> myItems = new ArrayList<Item>();
		
		//Create new item
		Item newitem1 = new Item(null, null, 0);
		Item newitem2 = new Item(null, null, 0);
		

		newitem1.setItemName("MacBook Pro");
		newitem1.setItemInfo("256GB, 4GB RAM, 2.6hz CPU");
		newitem1.setPrice(3.82);
		
		newitem2.setItemName("Dell GMC");
		newitem2.setItemInfo("500GB, 8GB RAM, 3.6hz CPU");
		newitem2.setPrice(200.50);
		
		myItems.add(newitem1);
		myItems.add(newitem2);
		
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
