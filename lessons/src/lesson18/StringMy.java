package lesson18;

public class StringMy {
    public static void main(String[] args) {
        Person.defaultName = "Default name";

        Person tom = new Person();
        tom.setName("");
        tom.setAge(13);

        tom.speaking();

        Person jarry = new Person();
        jarry.setName("Jerry");
        jarry.setAge(-2);

        jarry.speaking();

    }

    private char[] stringMy;
}

class Person {
    private int age;
    private String name;
    public static String defaultName;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.printf("The %s cannot have an age less than to 0 \n", name);
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name == "") {
            this.name = defaultName;
        } else {
            this.name = name;
        }
    }

    void speaking() {
        System.out.println("my name is " + name + " and my " + age);
    }

}