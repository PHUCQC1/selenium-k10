package Lab6;

import java.util.Scanner;

public class lab6cham2 {
    public static void main(String[] args) {
        String myPassword = "password123";
        Scanner scanner = new Scanner(System.in);
        int isValid = 0;
        while (isValid < 3) {
            System.out.println("Vui lòng nhập mật khẩu: ");

            String input = scanner.nextLine();
            if (input.equals(myPassword)) {
                System.out.println("Bạn nhập đúng rồi");
                break;
            }
            isValid++;
            if (isValid == 3) {
                System.out.println("Bạn nhập sai 3 lần rồi");
                break;
            }
        }
    }
}

