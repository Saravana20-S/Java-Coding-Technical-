package logicprep.strings;

public class CharacterFrequency {
    public static void main(String[] args) {

        String str = "banana";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;
            boolean visited = false;

            for (int k = 0; k < i; k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    visited = true;
                    break;
                }
            }

            if (visited)
                continue;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            System.out.println(str.charAt(i) + "=" + count);
        }
    }
}
