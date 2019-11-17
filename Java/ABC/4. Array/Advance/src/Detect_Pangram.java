/*
*
*
* A pangram is a sentence that contains every single letter of the alphabet at least once.
* For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).

Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
*
*
* */

public class Detect_Pangram {
    public static void main(String[] args) {
        String s1 = "The quick brown fox jumps over the lazy dog";
        String s2 = s1.toLowerCase();
        System.out.println(s2);
        boolean b = false;
        char[] c= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

//        for(int i = 0; i <c.length;i++) {
//            for (int j = 0; j < s2.length(); j++) {
//                if (c[i] == s2.charAt(j)) {
//                    b = true;
//                } else {
//                    b = false;
//                    break;
//                }
//            }
//
//        }
//        System.out.println(b);

    }
}
