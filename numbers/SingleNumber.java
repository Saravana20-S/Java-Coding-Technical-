package logicprep.numbers;

import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = 0;

        for(int num : arr) {
            result ^= num;
        }

        System.out.println(result);
    }
}