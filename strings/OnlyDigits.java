package logicprep.strings;

public class OnlyDigits {
    public static void main(String[] args) {

        String str = "12345";

        boolean flag = true;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch < '0' || ch > '9') {
                flag = false;
                break;
            }
        }

        System.out.println(flag);
    }
}