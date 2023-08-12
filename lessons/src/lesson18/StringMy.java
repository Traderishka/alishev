package lesson18;

public class StringMy {
    public static void main(String[] args) {
        Person tom = new Person();
        tom.getName("Tom");
        tom.getAge(13);

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

    public int getAge(int age) {
        if (age < 0) {
          return this.age = 0;
        }
        return this.age = age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.printf("The %s cannot have an age less than to 0 \n", name);
        } else {
            this.age = age;
        }
    }

    public String getName(String name) {
        if (name == null || name == "") {
          return this.name = "Name cannot equals null or empty";
        }
        return this.name=name;
    }

    public void setName(String name) {
        if (name == null || name == "") {
            this.name = "Name cannot equals null or empty";
        } else {
            this.name = name;
        }
    }

    void speaking() {
        System.out.println("my name is " + name + " and my " + age);
    }

}