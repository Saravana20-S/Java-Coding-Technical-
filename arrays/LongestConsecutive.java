package logicprep.arrays;

public class LongestConsecutive {
    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {

            int current = arr[i];
            int length = 1;

            while (true) {

                boolean found = false;

                for (int j = 0; j < arr.length; j++) {

                    if (arr[j] == current + 1) {
                        found = true;
                        current++;
                        length++;
                        break;
                    }
                }

                if (!found) {
                    break;
                }
            }

            if (length > maxLength) {
                maxLength = length;
            }
        }

        System.out.println(maxLength);
    }
}