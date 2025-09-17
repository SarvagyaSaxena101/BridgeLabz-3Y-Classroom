package PillarsOfOOPS;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public abstract double calculateTotalPrice();
    public String getItemDetails() { return itemName + ", " + price + ", " + quantity; }
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    public double calculateTotalPrice() { return getPrice() * getQuantity(); }
    public double applyDiscount() { return getPrice() * 0.1; }
    public String getDiscountDetails() { return "10% off"; }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    public double calculateTotalPrice() { return getPrice() * getQuantity() + 50; }
    public double applyDiscount() { return getPrice() * 0.05; }
    public String getDiscountDetails() { return "5% off"; }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem[] items = new FoodItem[2];
        items[0] = new VegItem("Paneer", 200, 2);
        items[1] = new NonVegItem("Chicken", 300, 1);
        for (FoodItem item : items) {
            double total = item.calculateTotalPrice();
            double discount = (item instanceof Discountable) ? ((Discountable)item).applyDiscount() : 0;
            System.out.println(item.getItemName() + " Final Price: " + (total - discount));
        }
    }
}
