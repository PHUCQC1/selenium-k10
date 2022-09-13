package Lab2;

import java.util.Scanner;

public class Lab2cham1 {
    public static void main(String[] args) {
        //underweaight = <18.5
        //normal weight 18.5 -24.9
        //over weight = 25-29.9
        //obesity = BMI of 30 or greater
        //18.5|
        //BMI = weight/ (height x2)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều cao của bạn vào đây: ");
        float CHIEU_CAO = scanner.nextFloat();

        System.out.println("Nhập cân nặng của bạn vào đây: ");
        float CAN_NANG = scanner.nextFloat();

        Float TOTAL = CAN_NANG/(CHIEU_CAO*2);
        System.out.printf("Kết quả BMI của bạn là: %f", TOTAL);

        if (TOTAL<18.5){
            System.out.println("\n Bạn đang: Thiếu Cân");
        }else if (TOTAL >= 18.5 && TOTAL <= 24.9){
            System.out.println("\n Bạn đang: Cân đối");
        }else if (TOTAL >=25 && TOTAL <= 29.9 ){
            System.out.println("\n Bạn đang: Thừa cân");
        }else {
            System.out.println("\n Bạn đang: Béo Phì");
        }
    }
}
