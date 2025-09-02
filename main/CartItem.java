public class CartItem {
    // Fields (Attributes)
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to add an item to the cart
    public void addItem(int quantityToAdd) {
        this.quantity += quantityToAdd;
    }

    // Method to remove an item from the cart
    public void removeItem(int quantityToRemove) {
        if (quantityToRemove <= this.quantity) {
            this.quantity -= quantityToRemove;
        } else {
            System.out.println("Cannot remove more items than present in the cart.");
        }
    }

    // Method to display the total cost
    public double getTotalCost() {
        return price * quantity;
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + getTotalCost());
    }
}