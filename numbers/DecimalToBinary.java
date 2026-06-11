package logicprep.numbers;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String binary = "";
        
//        System.out.println(Integer.toBinaryString(num));

        while (num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }

        System.out.println(binary);
    }
}