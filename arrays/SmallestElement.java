package logicprep.arrays;

public class SmallestElement {
    public static void main(String[] args) {

        int[] arr = {10, 20, 5, 40};

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println(smallest);
    }
}