package lesson11;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 10;
        }
        for (int i = 1; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
