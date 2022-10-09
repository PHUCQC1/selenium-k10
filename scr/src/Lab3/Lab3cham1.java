package Lab3;

import java.util.Arrays;

public class Lab3cham1 {
    public static void main(String[] args) {
        int[] intArr = {0, 1, 2, 3, 4, 5, 7, 8, 9};
        int i = 0;
        int o =0;
        int CHAN = intArr[0];
        int LE = intArr[0];
        System.out.println("Số lẻ trong chuỗi là: ");
        for (; i < intArr.length; i++) {
            if (intArr[i] % 2 == 1) {
                System.out.printf("%4d", intArr[i]);
                LE++;
            }
        }
        System.out.printf("\n");
        System.out.println("Số chẵn trong chuỗi là: ");
        for (; o< intArr.length; o++) {
            if (intArr[o] %2 == 0) {
                System.out.printf("%4d", intArr[o]);
                CHAN++;
            }
        }
        System.out.printf("\n");
        System.out.println("Tổng số chẫn trong chuỗi là: " + CHAN);
        System.out.println("Tổng số lẻ trong chuỗi là: " + LE);
    }
}
