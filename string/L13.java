package string;

/*
 * Company : Facebook, Yahoo, Microsoft, Bloomberg, Uber
 * LeetCode Difficulty: easy
 * My Judgement: easy
 */
public class L13 {

    public int romanToInt(String s) {
        int i, output = 0;
        char c;
        for (i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            switch(c) {
                case 'I':
                    output += 1;
                    break;
                case 'V':
                    output += 5;
                    if (i > 0 && s.charAt(i - 1) == 'I') {
                        output -= 2;
                    }
                    break;
                case 'X':
                    output += 10;
                    if (i > 0 && s.charAt(i - 1) == 'I') {
                        output -= 2;
                    }
                    break;
                case 'L':
                    output += 50;
                    if (i > 0 && s.charAt(i - 1) == 'X') {
                        output -= 20;
                    }
                    break;
                case 'C':
                    output += 100;
                    if (i > 0 && s.charAt(i - 1) == 'X') {
                        output -= 20;
                    }
                    break;
                case 'D':
                    output += 500;
                    if (i > 0 && s.charAt(i - 1) == 'C') {
                        output -= 200;
                    }
                    break;
                case 'M':
                    output += 1000;
                    if (i > 0 && s.charAt(i - 1) == 'C') {
                        output -= 200;
                    }
                    break;
            }

        }
        return output;
    }
}
