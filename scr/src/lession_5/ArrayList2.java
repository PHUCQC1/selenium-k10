package lession_5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayList2 {
    public static void main(String[] args) {
        List<Integer> myArrList = new ArrayList<>();
        myArrList.add(1);
        myArrList.add(4);
        myArrList.add(1);
        myArrList.add(2);
        myArrList.add(3);
        myArrList.add(4);
        myArrList.add(4);
        System.out.println("Before add to list" + myArrList);

        // Không trùng và sắp xếp từ nhỏ đến lớn
        Set <Integer> set = new HashSet<>(myArrList);
        System.out.println(set);

        List<Integer> listFromSet = new ArrayList<>(set);

        int batdau =0;
        int ketthuc =3;
        List<Integer> first3MinValues= listFromSet.subList(batdau, ketthuc);
        System.out.println("3 số nhỏ nhất trong Array List" + first3MinValues);

    }
}
