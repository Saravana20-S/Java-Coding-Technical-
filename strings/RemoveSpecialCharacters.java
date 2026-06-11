package logicprep.strings;

public class RemoveSpecialCharacters {
    public static void main(String[] args) {

        String str = "Ja@va#123";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') ||
                (ch >= 'a' && ch <= 'z') ||
                (ch >= '0' && ch <= '9')) {

                result += ch;
            }
        }

        System.out.println(result);
    }
}
