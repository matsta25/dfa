package com.matsta25.dfa;

import com.matsta25.dfa.types.DfaOne;
import com.matsta25.dfa.types.DfaTwo;

import java.util.Scanner;

public class Dfa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dfaType = "1";

        while (!dfaType.equals("0")) {
            System.out.println("\nSelect dfa: \n\t1 - DfaOne \n\t2 - DfaTwo\n\n\t0 - Exit\n");
            dfaType = sc.nextLine();
            switch (dfaType) {
                case "1":
                    System.out.println("DfaOne: Enter word:");
                    String inputTextOne = sc.nextLine();
                    DfaOne.start(inputTextOne);
                    break;
                case "2":
                    System.out.println("DfaTwo: Enter word:");
                    String inputTextTwo = sc.nextLine();
                    DfaTwo.start(inputTextTwo);
                    break;
            }
        }
    }
}
