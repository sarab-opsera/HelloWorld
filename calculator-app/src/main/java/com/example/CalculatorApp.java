package com.example;

public class CalculatorApp{
        public static void main(String[] args) {
            System.out.println("Run method main, call calculateSum");
            System.out.println(calculateSum(5, 10));
        }
    
        // Method with a magic number
        public static int calculateSum(int a, int b) {
            if (a > 5) {
                return a + b;
            } else {
                return a + 10; // Magic number: 10
            }
        }
    
        // Method with duplicate code
        public static int calculateDifference(int x, int y) {
            if (x > 5) {
                return x - y;
            } else {
                return x - y; // Duplicate code
            }
        }
    
        // Unused variable
        public static void unusedVariable() {
            int unusedVar = 42; // Unused variable
        }
}
