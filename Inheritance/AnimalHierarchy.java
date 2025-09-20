class Animal {
    private String name;
    private int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
    public void makeSound() {}
}

class Dog extends Animal {
    public Dog(String name, int age) { super(name, age); }
    @Override
    public void makeSound() { System.out.println("Woof"); }
}

class Cat extends Animal {
    public Cat(String name, int age) { super(name, age); }
    @Override
    public void makeSound() { System.out.println("Meow"); }
}

class Bird extends Animal {
    public Bird(String name, int age) { super(name, age); }
    @Override
    public void makeSound() { System.out.println("Tweet"); }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal[] animals = { new Dog("Doggy", 3), new Cat("Kitty", 2), new Bird("Tweety", 1) };
        for (Animal a : animals) {
            System.out.print(a.getName() + ": ");
            a.makeSound();
        }
    }
}
