package logicprep.strings;

public class LargestWord {
    public static void main(String[] args) {

        String str = "Java Spring Boot Microservices";

        String[] words = str.split(" ");

        String largest = words[0];

        for (int i = 1; i < words.length; i++) {

            if (words[i].length() > largest.length()) {
                largest = words[i];
            }
        }

        System.out.println(largest);
    }
}