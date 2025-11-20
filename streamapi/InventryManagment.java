package streamapi;

import java.util.*;
import java.util.stream.Collectors;

/*
Inventory Management – Low Stock Alerts

A list of items with itemName, quantity, and category.
Filter items where quantity < 10, group them by category, and return only categories where more than 3 items are low in stock.

 */

public class InventryManagment {

	public static void main(String[] args) {
		 List<Item> items = Arrays.asList(
	                new Item("Dell Laptop", 5, "Electronics"),
	                new Item("HP Laptop", 8, "Electronics"),
	                new Item("Lenovo Mouse", 3, "Electronics"),
	                new Item("Samsung Keyboard", 7, "Electronics"),
	                new Item("Sony Headset", 9, "Electronics"),

	                new Item("Office Chair", 12, "Furniture"),
	                new Item("Study Table", 6, "Furniture"),
	                new Item("Bookshelf", 4, "Furniture"),
	                new Item("Wooden Stool", 9, "Furniture"),
	                new Item("Cupboard", 15, "Furniture"),

	                new Item("Whiteboard Marker", 2, "Stationery"),
	                new Item("A4 Sheets Pack", 5, "Stationery"),
	                new Item("Pens Box", 8, "Stationery"),
	                new Item("Stapler", 3, "Stationery"),
	                new Item("Tape Roll", 6, "Stationery")
	        );
		 
		 List<Item> lessThanTenItem=items.stream().filter(i->i.getQuantity()<10).collect(Collectors.toList());
		 Map<String, Long> groupingByCate=lessThanTenItem.stream().collect(Collectors.groupingBy(i->i.getCategory(),Collectors.counting()));
		groupingByCate.entrySet().stream().filter(i->i.getValue()>3).forEach(System.out::println);
	}
}


class Item {
    private String itemName;
    private int quantity;
    private String category;

    public Item(String itemName, int quantity, String category) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.category = category;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return itemName + " | Qty: " + quantity + " | Category: " + category;
    }
}
