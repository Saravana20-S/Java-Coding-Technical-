package logicprep.strings;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "programming";

        for (int i = 0; i < str.length(); i++) {

            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(str.charAt(i));
            }
        }
    }
}