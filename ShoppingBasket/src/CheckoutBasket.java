import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSlider;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import javafx.scene.control.ComboBox;

import java.awt.Component;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class CheckoutBasket {

	private JFrame frame;
	private JTable table;
	//Add ArrayList
	private	ArrayList<Item> myItems ;
	
   


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckoutBasket window = new CheckoutBasket();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CheckoutBasket() {
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 496, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(195, 42, 37, 29);
		frame.getContentPane().add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		
		comboBox.setBounds(20, 43, 163, 27);
		frame.getContentPane().add(comboBox);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(13, 99, 219, 173);
		frame.getContentPane().add(textArea);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBounds(247, 6, 11, 278);
		frame.getContentPane().add(verticalStrut);
		
		JLabel lblNewLabel = new JLabel("Catalogue");
		lblNewLabel.setBounds(82, 15, 91, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblBasket = new JLabel("Basket");
		lblBasket.setBounds(332, 15, 91, 16);
		frame.getContentPane().add(lblBasket);
		
		Object[] columns =  {"Itemname", "Unit cost" , "Quantity", "Price"};
		
		DefaultTableModel model = new DefaultTableModel(new Object[0][0], columns);

	
		table = new JTable(model);
		table.setBounds(249, 231, 143, -192);
		
		frame.getContentPane().add(table);

		
		
		JButton button = new JButton("-");
		button.setBounds(439, 42, 37, 29);
		frame.getContentPane().add(button);
		
		JLabel lblTotalCost = new JLabel("Total cost:");
		lblTotalCost.setBounds(305, 256, 74, 16);
		frame.getContentPane().add(lblTotalCost);
		
		JLabel label = new JLabel("0");
		label.setBounds(391, 256, 61, 16);
		frame.getContentPane().add(label);
		
		createItems(comboBox);
		
		JLabel lblItemDescription = new JLabel("Item Summary");
		lblItemDescription.setBounds(59, 81, 91, 16);
		frame.getContentPane().add(lblItemDescription);
		
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String name = comboBox.getSelectedItem().toString();
				
				for(Item item: myItems) {
					if(item.getItemName().equalsIgnoreCase(name)) {
						textArea.setText(item.Print());
					}
				}
				
			}
		});
	}
	
	private void createItems(JComboBox box) {
		

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
		
		myItems = new ArrayList<Item>();
		
		myItems.add(newitem1);
		myItems.add(newitem2);
		myItems.add(newitem3);
		
		box.addItem(item1name);
		box.addItem(item2name);
		box.addItem(item3name);
		
	}
}
