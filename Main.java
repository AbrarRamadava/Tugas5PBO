public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();

        Animal animal2 = new Dog();
        animal2.makeSound();

        Animal animal3 = new Cat();
        animal3.makeSound();
    }
}