package org.example;

// Animal class
class Animal {
    public void sound() {
        System.out.println("The animal makes a sound.");
    }
}

// Cat class, inherits from Animal
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow!");
    }
}

// Dog class, inherits from Animal
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Woof!");
    }
}

// Example usage
class AnimalInheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();  // The animal makes a sound.

        Cat cat = new Cat();
        cat.sound();  // Meow!

        Dog dog = new Dog();
        dog.sound();  // Woof!
    }
}
