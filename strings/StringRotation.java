package logicprep.strings;

public class StringRotation {
    public static void main(String[] args) {

        String str1 = "ABCD";
        String str2 = "CDAB";

        if (str1.length() != str2.length()) {
            System.out.println("False");
            return;
        }

        String temp = str1 + str1;

        if (temp.contains(str2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
