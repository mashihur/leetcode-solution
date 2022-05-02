package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Company : Google, Facebook, Amazon, Uber, Dropbox
 * LeetCode Difficulty: Medium
 * My Judgement: Medium
 */
public class L17 {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<String>();
        if (digits.length() > 0) {
            generateList(digits, "", list);
        }
        return list;
    }

    private void generateList(String digits, String letters, List<String> list) {
        int len = letters.length();
        if (len == digits.length()) {
            list.add(letters);
            return;
        }
        List<Character> letterList = getCorrespondingList(digits.charAt(len));
        for (Character letter : letterList) {
            generateList(digits, letters + letter, list);
        }
    }

    private List<Character> getCorrespondingList(Character ch) {
        List<Character> list = null;
        switch(ch) {
            case '2':
                list = Arrays.asList('a', 'b', 'c');
                break;
            case '3':
                list = Arrays.asList('d', 'e', 'f');
                break;
            case '4':
                list = Arrays.asList('g', 'h', 'i');
                break;
            case '5':
                list = Arrays.asList('j', 'k', 'l');
                break;
            case '6':
                list = Arrays.asList('m', 'n', 'o');
                break;
            case '7':
                list = Arrays.asList('p', 'q', 'r', 's');
                break;
            case '8':
                list = Arrays.asList('t', 'u', 'v');
                break;
            case '9':
                list = Arrays.asList('w', 'x', 'y', 'z');
                break;
        }

        return  list;
    }
}
