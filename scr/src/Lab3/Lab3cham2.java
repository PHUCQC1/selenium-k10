package Lab3;

public class Lab3cham2 {
    public static void main(String[] args) {
        int[] intArr = {2, 3, 5, 7, 9, 10};
        int Max = intArr[0];
        int Min = intArr[0];
        for (int i = 0; i < intArr.length; i++) {
            if(intArr[i] > Max){
                Max = intArr[i];
        } else if (intArr[i]<Min) {
                Min = intArr[i];
            }
        }
        System.out.println("Số max trong chuỗi là: " + Max);
        System.out.println("Số min trong chuỗi là: " + Min);
    }
}