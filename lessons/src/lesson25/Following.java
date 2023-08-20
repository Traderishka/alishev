package lesson25;

public class Following {
    public static void main(String[] args) {
//        Animal cat = new Animal();
        Dog dog = new Dog();
        dog.setName("Jack");
        System.out.println(dog.getName());
        dog.barking();
    }
}

