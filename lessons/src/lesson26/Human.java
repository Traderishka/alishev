package lesson26;

public class Human implements Info {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println("My name is " + name);
    }
}
