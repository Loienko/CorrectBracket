package net.ukr.dreamsicle;

import java.util.ArrayList;

/**
 * Created by Yura on 31.05.2017.
 * Creating all the correct bracket options
 */
public class BracketRandomCreate {

    public static void addParen(ArrayList list, int leftRem, int rightRem, char[] str, int count) {

        if (leftRem < 0 || rightRem < leftRem) return; // некорректное состояние

        if (leftRem == 0 && rightRem == 0) { /* not more bracket */
            String s = String.copyValueOf(str);
            list.add(s);
        } else {
        /* add new left bracket */
            if (leftRem > 0) {
                str[count] = '(';
                addParen(list, leftRem - 1, rightRem, str, count + 1);
            }

        /* add right bracket */
            if (rightRem > leftRem) {
                str[count] = ')';
                addParen(list, leftRem, rightRem - 1, str, count + 1);
            }
        }
    }

    public static ArrayList generateParens(int count) {
        char[] str = new char[count * 2];
        ArrayList list = new ArrayList();
        addParen(list, count, count, str, 0);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(generateParens(5));
    }
}
