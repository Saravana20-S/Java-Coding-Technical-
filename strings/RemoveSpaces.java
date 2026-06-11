package logicprep.strings;

public class RemoveSpaces {
    public static void main(String[] args) {

        String str = "Java Is Easy";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                result += str.charAt(i);
            }
        }

        System.out.println(result);
    }
}