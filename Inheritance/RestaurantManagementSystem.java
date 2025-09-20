interface Worker {
    void performDuties();
}

class Person {
    private String name;
    private int id;
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() { return name; }
    public int getId() { return id; }
}

class Chef extends Person implements Worker {
    public Chef(String name, int id) { super(name, id); }
    public void performDuties() { System.out.println("Cooking food"); }
}

class Waiter extends Person implements Worker {
    public Waiter(String name, int id) { super(name, id); }
    public void performDuties() { System.out.println("Serving food"); }
}

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Worker[] workers = { new Chef("Alice", 1), new Waiter("Bob", 2) };
        for (Worker w : workers) {
            w.performDuties();
        }
    }
}
