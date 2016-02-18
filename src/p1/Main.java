package p1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence;

        do{
            System.out.print("Enter a sentence: ");
            sentence = input.nextLine();
            System.out.println("You entered: " + sentence);

            String[] tokens = sentence.split(" +");

            //print out tokens
            for (String each: tokens)
                System.out.println(each);
            System.out.println("Number of tokens = " + tokens.length);

            System.out.println(isFirstCharCapitalized(sentence) ?
                    "Starts with a cap" : "Does not start with a Cap");

            System.out.println(isLastCharPunctuation(sentence) ?
            "Ends with correct punctuation" :
            "Ends with incorrect punctuation");

        }while(!sentence.equals(""));
    }
    static boolean isFirstCharCapitalized(String arg){
        return Character.isUpperCase(arg.charAt(0));
    }
    static boolean isLastCharPunctuation(String arg){
        // ".*[]" matching method
        return arg.matches(".*[.?! ]");
    }
}

