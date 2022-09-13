package lession_2;

import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {
        // <18 | 18-55| >55
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mày nhập tuổi của mày vào đây: ");
        int TUOI_CUA_MAY = scanner.nextInt();

        if (TUOI_CUA_MAY < 18){
            System.out.println("Mày éo được quyền mua đâu cưng");
            if(TUOI_CUA_MAY <= 12){
                System.out.println("Gọi cảnh sát bắt mày đi");
            }
        }else  if (TUOI_CUA_MAY >=18 && TUOI_CUA_MAY <=55){
            System.out.println("Ngon!!! Mày mua thoải mái");
        }else {
            System.out.println("Già rồi...uống ít thôi");
        }

        // && || ( 2 cái phải đều đúng)
        // & |
    }
}
