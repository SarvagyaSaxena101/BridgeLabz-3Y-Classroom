package ObjectRelationAndModelling;
import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    public Product(String name) { this.name = name; }
    public String getName() { return name; }
}

class Order {
    private List<Product> products = new ArrayList<>();
    public void addProduct(Product p) { products.add(p); }
    public List<Product> getProducts() { return products; }
}

class Customer {
    private String name;
    public Customer(String name) { this.name = name; }
    public Order placeOrder(Product... products) {
        Order order = new Order();
        for (Product p : products) {
            order.addProduct(p);
        }
        return order;
    }
    public String getName() { return name; }
}

public class ECommerceOrdersCustomersProducts {
    public static void main(String[] args) {
        Customer c = new Customer("Alice");
        Product p1 = new Product("Laptop");
        Product p2 = new Product("Phone");
        Order o = c.placeOrder(p1, p2);
        for (Product p : o.getProducts()) {
            System.out.println(c.getName() + " ordered: " + p.getName());
        }
    }
}
