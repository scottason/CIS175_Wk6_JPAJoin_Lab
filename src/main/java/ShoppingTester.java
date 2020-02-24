import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import controller.ListDetailsHelper;
import controller.ShopperHelper;
import model.ListDetails;
import model.ListItem;
import model.Shopper;

public class ShoppingTester {

	public static void main(String[] args) {
		
		//ShopperHelper sh = new ShopperHelper();

		//Shopper bill = new Shopper("Bill");
		//sh.insertShopper(bill);
		
		//Shopper cameron = new Shopper("Cameron");
		//sh.insertShopper(cameron);
		
		//ListDetailsHelper ldh = new ListDetailsHelper();
		//ListDetails cameronList = new ListDetails("Cameron's List", LocalDate.now(), cameron);
		
		//ldh.insertNewListDetails(cameronList);
		
		//List<ListDetails> allLists = ldh.getLists();
		

		//List<Shopper> allShoppers = sh.showAllShoppers();
		
		//for(Shopper a: allShoppers) {
		//	System.out.println(a.toString());
		//}
		
		//for (ListDetails a : allLists) {
		//	System.out.println(a.toString());
		//}
		
		Shopper anthony = new Shopper("Anthony");
		
		ListDetailsHelper ldh = new ListDetailsHelper();
		
		ListItem kimchi = new ListItem("Target", "Kimchi");
		ListItem greenDrink = new ListItem("Target", "Green Drink");
		
		List<ListItem> anthonysItems = new ArrayList<ListItem>();
		anthonysItems.add(kimchi);
		anthonysItems.add(greenDrink);
		
		ListDetails anthonyList = new ListDetails("Anthony's ShoppingList", LocalDate.now(), anthony);
		anthonyList.setListOfItems(anthonysItems);
		
				
		ldh.insertNewListDetails(anthonyList);
				
		List<ListDetails> allLists = ldh.getLists();
				
		for(ListDetails a: allLists) {
			System.out.println(a.toString());
		}
		
		
	}
}
