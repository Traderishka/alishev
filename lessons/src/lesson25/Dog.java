package lesson25;

public class Dog extends Animal {
    private String name;

    @Override
    public void eat() {
        super.eat();
    }

    public void barking() {
        System.out.println(name + " - dog, he is barking");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
