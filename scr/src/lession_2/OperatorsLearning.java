package lession_2;

public class OperatorsLearning {
    public static void main(String[] args) {
        int myNum1 = 1;
        int myNum2 = 2;

        // right operand ( cong ben phai gan gia tri ben trai)
        int total = myNum1 + myNum2;
        System.out.println("Total: " + total);

        // Total is %d ( byte, short, int, long)
        // Total is %f ( float, double)
        // Boolean value is %b (boolean)
        // Character is %s (character)
        // Xuong dong them \n (vd: %f\n)
        System.out.printf("Total is %d", total);

        float myFloatNumber = 3/2f;
        System.out.println(myFloatNumber);

        System.out.println(5 / 2);
        System.out.println(5 % 2);

    }
}
