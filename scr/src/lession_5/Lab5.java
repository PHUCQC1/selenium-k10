package lession_5;

import java.util.*;
import java.util.ArrayList;

public class Lab5 {
    public static void main(String[] args) {
        boolean isContinuing = true;
        List<Integer> myArrayList = new ArrayList<>();

        while (isContinuing){
            printGameMenu();
           int userOption = getUseroption();
           switch (userOption){
               case 0:
                   isContinuing = false;
                   break;
            case 1:
               addNumberIntoArrayList(myArrayList);
                break;
               case 2:
                   printArrayList(myArrayList);
                   break;
               case 3:
                   int maxValue= getMaxvalue(myArrayList);
                   System.out.println("Max number: " + maxValue);
                   break;
               case 4:
                   int minValue= getMinvalue(myArrayList);
                   System.out.println("Min number: " + minValue);
                   break;
               default:
                   System.out.println("wrong Option");
        }
    }
}

    private static int getMinvalue(List<Integer> myArrayList) {
    int min =0;
        for (int i = 0; i < myArrayList.size(); i++) {
            if(min > myArrayList.get(i)){
                min = myArrayList.get(i);
            }
        }
        return min;
    }

    private static int getMaxvalue(List<Integer> myArrayList) {
      int max = 0;
        for (int i = 0; i < myArrayList.size(); i++) {
            if ( max < myArrayList.get(i)){
                max = myArrayList.get(i);
            }
        }
        return max;
    }

    private static void printArrayList(List<Integer> myArrayList) {
        System.out.println(myArrayList);
    }

    private static void addNumberIntoArrayList(List<Integer> myArrayList) {
        System.out.println("Pleae enter the number you want to add into Array List");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        myArrayList.add(number);
    }

    private static int getUseroption() {
        System.out.println("Please enter your option: ");
        Scanner scanner = new Scanner(System.in);
        return  scanner.nextInt();
    }

    private static void printGameMenu() {
        System.out.println("== Game menu ==");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Choose any number to see its position");
        System.out.println("0. Exit");
    }
}

