package com.matsta25.dfa.types;

public class DfaTwo {

    static int state = 0;

    static void state0(char x) {
        if (x == 'a') {
            state = 1;
        } else if (x == 'b') {
            state = 1;
        } else {
            state = -1;
        }
    }

    static void state1(char x) {
        if (x == 'a') {
            state = 2;
        } else if (x == 'b') {
            state = 2;
        } else {
            state = -1;
        }
    }

    static void state2(char x) {
        if (x == 'a') {
            state = 3;
        } else if (x == 'b') {
            state = 4;
        } else {
            state = -1;
        }
    }

    static void state3(char x) {
        if (x == 'a') {
            state = 5;
        } else if (x == 'b') {
            state = 5;
        } else {
            state = -1;
        }
    }

    static void state4(char x) {
        if (x == 'a') {
            state = 5;
        } else if (x == 'b') {
            state = 4;
        } else {
            state = -1;
        }
    }

    static void state5(char x) {
        if (x == 'a') {
            state = 6;
        } else if (x == 'b') {
            state = 7;
        } else {
            state = -1;
        }
    }

    static void state6(char x) {
        if (x == 'a') {
            state = 6;
        } else if (x == 'b') {
            state = 7;
        } else {
            state = -1;
        }
    }

    static void state7(char x) {
        if (x == 'a') {
            state = 6;
        } else if (x == 'b') {
            state = 7;
        } else {
            state = -1;
        }
    }

    public static void start(String inputText) {
        for (int i = 0; i < inputText.length(); i++) {
            char x = inputText.charAt(i);
            switch (state) {
                case 0:
                    state0(x);
                    break;
                case 1:
                    state1(x);
                    break;
                case 2:
                    state2(x);
                    break;
                case 3:
                    state3(x);
                    break;
                case 4:
                    state4(x);
                    break;
                case 5:
                    state5(x);
                    break;
                case 6:
                    state6(x);
                case 7:
                    state7(x);
                    break;
            }
            System.out.println(x + " - " + state);
        }

        if (state == 7) {
            System.out.println("Word \"" + inputText + "\" has been ACCEPTED!");
        } else {
            System.out.println("Word \"" + inputText + "\" has been NOT ACCEPTED!");
        }
    }
}
