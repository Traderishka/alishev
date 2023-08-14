package lesson23;

public class StringBuilderMy {
    public static void main(String[] args) {
//        String uper = "hello";
//        uper = uper.toUpperCase();
//        System.out.println(uper);
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my ").append(10);// єтот метод ізменяет обьект string builder і возвращвет новий результат
        System.out.println(sb.toString());
    }
}
