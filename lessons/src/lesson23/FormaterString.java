package lesson23;

public class FormaterString {
    public static void main(String[] args) {
        String s = "строка";
        System.out.println(s);
        System.out.printf("перемненная равна строке %s %3d\n", s, 10);// %3d -єто целое чісло 3 єто размер єтого чісла то есть колічества сімволов оні могут бить і пустимі
        System.out.printf("перемненная равна строке %s %-3d ф %.2f\n", s, 10);// %-3d -єто целое чісло 3 єто размер єтого чісла то есть колічества сімволов оні могут бить і пустимі

    }
}
