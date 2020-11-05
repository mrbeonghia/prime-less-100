package com.PrimeLess100;

public class Main {

    public static void main(String[] args) {
        System.out.println("Number of prime less than 100: ");
        for (int i = 3; i < 100; i+=2) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
