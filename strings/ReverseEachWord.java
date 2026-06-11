package logicprep.strings;

public class ReverseEachWord {
    public static void main(String[] args) {

        String str = "Java is Easy";

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {

            String rev = "";

            for (int j = words[i].length() - 1; j >= 0; j--) {
                rev += words[i].charAt(j);
            }

            System.out.print(rev + " ");
        }
    }
}