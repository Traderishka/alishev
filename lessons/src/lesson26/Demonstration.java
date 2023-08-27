package lesson26;

public class Demonstration {
    public static void main(String[] args) {
        Info bob = new Human("Bob");
        Info dog = new Animal(12);
        dog.showInfo();
        bob.showInfo();
        outputInfo(bob);
        outputInfo(dog);
    }
    public static void outputInfo(Info info){
        info.showInfo();
    }
}
