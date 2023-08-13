package lesson18;

public class StringMy {
    public static void main(String[] args) {
        Person.setTeamName("BelinWin");
        System.out.println(Person.getTeamName());

        Person tom = new Person();
        tom.setName("");
        tom.setAge(13);

        tom.speaking();

        Person jarry = new Person();
        jarry.setName("Jerry");
        jarry.setAge(-2);

        jarry.speaking();

        jarry.setCountTeam();

    }

    private char[] stringMy;
}

class Person {
    private int age;
    private String name;
    private static String teamName;

    private static int countTeam;

    public Person() {
        countTeam++;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        countTeam++;
    }


    public static int getCountTeam() {
        return countTeam;
    }

    public void setCountTeam() {
        System.out.println(countTeam);
    }

    void speaking() {
        System.out.println("my name is " + name + " and my " + age);
    }

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
        if (name == null || name.isEmpty()) {
            this.name = teamName;
        } else {
            this.name = name;
        }
    }

    public static void setTeamName(String teamName) {
        Person.teamName = teamName;
    }

    public static String getTeamName() {
        return teamName;
    }

}