import java.util.Date;

class Order {
    private int orderId;
    private Date orderDate;
    public Order(int orderId, Date orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    public int getOrderId() { return orderId; }
    public Date getOrderDate() { return orderDate; }
    public String getOrderStatus() { return "Order Placed"; }
}

class ShippedOrder extends Order {
    private String trackingNumber;
    public ShippedOrder(int orderId, Date orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    @Override
    public String getOrderStatus() { return "Shipped"; }
}

class DeliveredOrder extends ShippedOrder {
    private Date deliveryDate;
    public DeliveredOrder(int orderId, Date orderDate, String trackingNumber, Date deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    @Override
    public String getOrderStatus() { return "Delivered"; }
}

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        Order o = new Order(1, new Date());
        ShippedOrder so = new ShippedOrder(2, new Date(), "TRK123");
        DeliveredOrder d = new DeliveredOrder(3, new Date(), "TRK456", new Date());
        System.out.println(o.getOrderStatus());
        System.out.println(so.getOrderStatus());
        System.out.println(d.getOrderStatus());
    }
}
