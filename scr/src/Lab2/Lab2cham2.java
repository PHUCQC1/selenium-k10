package Lab2;

import java.util.Scanner;

public class Lab2cham2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập con số mà bạn thích: ");
        int SO_USER_NHAP = scanner.nextInt();

        if (SO_USER_NHAP %2 == 0){
            System.out.println("Đây là số chẵn");
        }else {
            System.out.println("Đây là số lẻ");
        }
    }
}
