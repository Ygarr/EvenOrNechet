package com.company;

public class Main {

    public static void main(String[] args) {
	    int n = 2349;
        int nn = 2350;


        if ( (n%2) == 0 ) {
            System.out.println("Число n: " + n + " - EVEN - Четное");
        } else {
            System.out.println("Число n: " + n + " - ODD - Нечетное");
        }

        /**
         * определение четности по последнему
         * биту - у нечетных чисел в двоичном представлении он всегда 1.
         */
        System.out.println("А число " + nn + ((nn & 1) == 0 ? " четное " : " нечетное "));//Don't know why, no Math op-ns
    }
}
