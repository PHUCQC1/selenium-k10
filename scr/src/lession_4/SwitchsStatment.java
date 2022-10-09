package lession_4;

import java.util.Scanner;

public class SwitchsStatment {
    public static void main(String[] args) {
        System.out.println("Hãy điền con số bạn thích");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

      //  if(userInput ==1){
      ///      System.out.println("giải nhất");
      //  } else if (userInput == 2) {
      //      System.out.println("Giải nhì");
      //  } else if (userInput == 3) {
      //      System.out.println("Gỉa ba");
      //  }else {
     //       System.out.println("Nhập lụi rồi tèo ơi");
     //   }
        switch (userInput){
            case 1:
                System.out.println("giải nhất");
                break;
            case 2:
                System.out.println("Giải nhì");
                break;
            case 3:
                System.out.println("Gỉa ba");
                break;
            default:
                System.out.println("Nhập lụi rồi tèo ơi");
        }
    }
}
