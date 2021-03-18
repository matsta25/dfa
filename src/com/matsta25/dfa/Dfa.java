package com.matsta25.dfa;

import com.matsta25.dfa.types.DfaTwo;

import java.util.Scanner;

public class Dfa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("DfaOne: Enter word:");
//        String inputTextOne = sc.nextLine();
//        DfaOne.start(inputTextOne);

        System.out.println("DfaTwo: Enter word:");
        String inputTextTwo = sc.nextLine();
        DfaTwo.start(inputTextTwo);
    }
}
