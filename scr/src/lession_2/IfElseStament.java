package lession_2;

import java.util.Scanner;

public class IfElseStament {
    public static void main(String[] args) {
        final int GIO_PHAI_DEN = 8;

        Scanner scanner = new Scanner(System.in);
        System.out.println("May nhap vao gio may den: ");
        int GIO_DEN = scanner.nextInt();

        // comparison operators: == (co bang hay khong), != (co khac hay khong)
        // >, <, >=, <=
        //boolean DUNG_GIO = GIO_DEN <= GIO_PHAI_DEN;

        //Toán tử 3 ngôi
        boolean DUNG_GIO = GIO_DEN <= GIO_PHAI_DEN ? true : false;

        System.out.println("1. Dat xe ra");
        System.out.println("2. Chay toi quan");

        if (DUNG_GIO){
            System.out.println("\t--->Hay noi chuyen");
        }else {
            System.out.println("\t--->Chim cut");
        }
        System.out.println("3. Dat xe ra");
        System.out.println("4. Chay ve nha");

    }
}
