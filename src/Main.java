// a) Class and Object
class Animal {
    // b) Class constructor
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

// c) Method overloading
class Dog extends Animal {

    Dog(String name, int age) {
        super(name, age);

        System.out.println(name + " is eating dog food.");
    }

    void eat(String food) {
        System.out.println(name + " is eating " + food + ".");
    }

    // d) Method overriding
    @Override
    void eat() {
        System.out.println(name + " is eating dog food.");
    }

    void bark() {
        System.out.println(name + " is barking.");
    }
}

// e) Inheritance
class Puppy extends Dog {

    Puppy(String name, int age) {
        super(name, age);
    }

    void play() {
        System.out.println(name + " is playing.");
    }
}

// f) Interface
interface Pet {
    void beFriendly();
    void play();
}

// g) Abstract class
abstract class WildAnimal {
    abstract void hunt();
    void sleep() {
        System.out.println("Wild animal is sleeping.");
    }
}

class Lion extends WildAnimal implements Pet {

    @Override
    void hunt() {
        System.out.println("Lion is hunting.");
    }

    @Override
    public void beFriendly() {
        System.out.println("Lion is being friendly.");
    }

    @Override
    public void play() {
        System.out.println("Lion is playing.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 5);
        animal.eat();

        Dog dog = new Dog("Buddy", 3);
        dog.eat();
        dog.eat("bones");
        dog.bark();

        Puppy puppy = new Puppy("Charlie", 1);
        puppy.eat();
        puppy.play();

        Lion lion = new Lion();
        lion.hunt();
        lion.sleep();
        lion.beFriendly();
        lion.play();
    }
}
