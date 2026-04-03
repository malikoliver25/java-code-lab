package chapter10;

public class Zoo {

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); // Output: Animal makes a sound
        feedAnimal(myAnimal); // Output: Feeding the animal, Animal makes a sound

        Dog myDog = new Dog();
        myDog.makeSound(); // Output: Dog barks
        myDog.fetch(); // Output: Dog is fetching the ball
        feedAnimal(myDog); // Output: Feeding the animal, Dog barks

        Cat myCat = new Cat();
        myCat.makeSound(); // Output: Cat meows
        myCat.scratch(); // Output: Cat is scratching the furniture
        feedAnimal(myCat); // Output: Feeding the animal, Cat meows
    }

    public static void feedAnimal(Animal animal) {

        if(animal instanceof Dog) {
            System.out.println("Feeding the dog");
        } else if(animal instanceof Cat) {
            System.out.println("Feeding the cat");
        } else {
            System.out.println("Feeding the animal");
        }
        animal.makeSound(); // Polymorphic behavior
    }

}
