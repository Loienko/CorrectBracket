package net.ukr.dreamsicle;

import java.util.Scanner;

/**
 * Created by Yura on 31.05.2017.
 * Search for parentheses in a line of text
 */
public class BracketRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "(2+(3*4)-1)+(12-(5+1)-6)+4";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(' | text.charAt(i) == ')'){
                count++;
                System.out.print(text.charAt(i));
            }

        }
        System.out.println();
        if (count%2 == 0){
            System.out.println("Correct bracket - " + count);
        }else {
            System.out.println("Incorrect bracket - " + count);
        }
    }
}
