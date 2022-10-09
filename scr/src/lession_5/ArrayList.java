package lession_5;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        // CRUD | Create Read Update Delete
        List<Integer> myArrList1 = new java.util.ArrayList<>();
        myArrList1.add(2);
        myArrList1.add(3);
        myArrList1.add(5);

        System.out.println("Before insert: " + myArrList1);
        int indextoInsert = 1;
        int valuetoInsert = 10;
        myArrList1.add(indextoInsert, valuetoInsert);
        System.out.println("After insert:" + myArrList1);
        myArrList1.set(3, 4);
        System.out.println("After update:" + myArrList1);

        //for (int index = 0; index < myArrList1.size(); index++) {
          //  System.out.println(myArrList1.get(index));

        myArrList1.remove(new Integer(3));
            System.out.println("After deleting:" + myArrList1);
        }

    }

