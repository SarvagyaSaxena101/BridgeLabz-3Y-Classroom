package PillarsOfOOPS;

abstract class Product {
    private final int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    private double taxRate;
    public Electronics(int productId, String name, double price, double taxRate) {
        super(productId, name, price);
        this.taxRate = taxRate;
    }
    public double calculateDiscount() {
        return getPrice() * 0.1;
    }
    public double calculateTax() {
        return getPrice() * taxRate;
    }
    public String getTaxDetails() {
        return "Tax Rate: " + taxRate;
    }
}

class Clothing extends Product implements Taxable {
    private double taxRate;
    public Clothing(int productId, String name, double price, double taxRate) {
        super(productId, name, price);
        this.taxRate = taxRate;
    }
    public double calculateDiscount() {
        return getPrice() * 0.2;
    }
    public double calculateTax() {
        return getPrice() * taxRate;
    }
    public String getTaxDetails() {
        return "Tax Rate: " + taxRate;
    }
}

class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }
    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Electronics(1, "Laptop", 50000, 0.18);
        products[1] = new Clothing(2, "Shirt", 2000, 0.12);
        products[2] = new Groceries(3, "Rice", 1000);
        for (Product p : products) {
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - discount;
            System.out.println(p.getName() + " Final Price: " + finalPrice);
        }
    }
}
