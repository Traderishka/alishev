package lesson23;

public class StringBuilderMy {
    public static void main(String[] args) {
//        String uper = "hello";
//        uper = uper.toUpperCase();
//        System.out.println(uper);
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my ").append(10);// этот метод изменяет объект string builder і возвращает новый результат
        System.out.println(sb.toString());
    }
}
