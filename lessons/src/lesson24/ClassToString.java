package lesson24;

public class ClassToString {
    public static void main(String[] args) {
        Human bob = new Human("Bob", 15);
//        bob.toString();
        System.out.println(bob);
    }
}

class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return name + " " + age;
    }
}