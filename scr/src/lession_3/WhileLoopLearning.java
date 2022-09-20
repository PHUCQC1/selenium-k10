package lession_3;

import java.security.SecureRandom;
import java.util.Scanner;

public class WhileLoopLearning {
    public static void main(String[] args) {
        boolean con_muon_choi = true;
        while (con_muon_choi){
            System.out.println("===GANE MENU===");
            System.out.println("1. Generate a random number");
            System.out.println("0. Exit!!");

            System.out.println("Please input option: ");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            if(option == 0){
                System.out.println("Chim cút");
                con_muon_choi = false;
            } else if (option ==1) {
                int randomNumber = new SecureRandom().nextInt(1000);
                System.out.printf("Your number is: %d\n", randomNumber);
            }else {
                System.out.println("Nhap lui roi m oi");

                }
            }
        }
    }

