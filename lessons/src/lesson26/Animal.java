package lesson26;

public class Animal implements Info {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public void showInfo() {
        System.out.println("my id " + id);
    }
}
