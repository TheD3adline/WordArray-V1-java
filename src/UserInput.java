/*
    Author: Michael Fessler
    Date: 2022/12/7
    Version: 0.1
    Description:
            Class to process the user input for the word to be searched.
 */
import java.util.Scanner;
public class UserInput {

    private static final Scanner sc = new Scanner(System.in);
    private static final String validCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String getUserInput() {
        int lengthOfWord;
        int checkChar;
        String input;
        do {
            System.out.print("Enter word for search (Between 2 and 5 characters in length and All CAPS): ");
            input = sc.next() + "\n";
            boolean flag = false;
            lengthOfWord = 0;
            checkChar = 0;
            for(int i = 0; i < 6; i++) {
                if(input.charAt(i) != '\n') {
                    lengthOfWord++;
                } else {
                    break;
                }
            }
            for(int i = 0; i < lengthOfWord; i++) {
                if(!Character.isUpperCase(input.charAt(i))) {
                    flag = true;
                    break;
                }
                for(int j = 0; j < 26; j++) {
                    if(input.charAt(i) == validCharacters.charAt(j)) {
                        checkChar++;
                    }
                }
            }
            if(lengthOfWord != checkChar) {
                flag = true;
            }
            while(flag) {
                System.out.println("Invalid input!");
                System.out.print("Enter word for search (Between 2 and 5 characters in length and All CAPS): ");
                input = sc.next() + "\n";
                flag = false;
                lengthOfWord = 0;
                checkChar = 0;
                for(int i = 0; i < 6; i++) {
                    if(input.charAt(i) != '\n') {
                        lengthOfWord++;
                    } else {
                        break;
                    }
                }
                for(int i = 0; i < lengthOfWord; i++) {
                    if(!Character.isUpperCase(input.charAt(i))) {
                        flag = true;
                        break;
                    }
                    for(int j = 0; j < 26; j++) {
                        if(input.charAt(i) == validCharacters.charAt(j)) {
                            checkChar++;
                        }
                    }
                }
                if(lengthOfWord != checkChar) {
                    flag = true;
                }
            }
            if((lengthOfWord < 2) || (lengthOfWord > 5)) {
                System.out.println("Invalid input!");
            }
        } while((lengthOfWord < 2) || (lengthOfWord > 5));
        return input + "\n";
    }
}
