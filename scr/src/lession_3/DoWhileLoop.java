package lession_3;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int guess = 0;
        int random = new SecureRandom().nextInt(10);

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập số mong muốn: ");
            int Num = scanner.nextInt();
            if(Num== random){
                System.out.println("Đúng rồi");
                break;
            }
            guess++;
        }while (guess < 3);
        if(guess == 3){
            System.out.println("Chúc bạn may mắn lần sau");
        }
    }
}
