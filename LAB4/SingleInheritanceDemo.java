// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class that inherits from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class
public class SingleInheritanceDemo {
    public static void main(String[] args) {
        // Create object of Dog
        Dog myDog = new Dog();

        // Call methods from both parent and child class
        myDog.eat();   // Inherited method
        myDog.bark();  // Child's own method
    }
}
