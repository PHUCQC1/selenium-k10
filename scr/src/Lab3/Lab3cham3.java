package Lab3;

import com.sun.jdi.ByteType;

import java.util.Arrays;
import java.util.Collections;

public class Lab3cham3 {
    public static void main(String[] args) {
        Integer [] intArr = new Integer [] {0, 7, 9, 7 , 8, 12, };
        Arrays.sort(intArr);
        System.out.println("Sắp xếp nhỏ đến lớn: " + Arrays.toString(intArr));

        System.out.println("\n");

        Arrays.sort(intArr, Collections.reverseOrder());
        System.out.println("Sắp xếp từ lớn về nhỏ: " + Arrays.toString(intArr));
    }
}
