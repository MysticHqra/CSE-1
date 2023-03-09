import java.util.*;

public class Pallindrome_Sectra27 {
    String sentence;
    int maxlength = 0;
    static int p = 0, np = 0;
    static String sorted = null, arranged = null;

    public Pallindrome_Sectra27(String sen) {
        sentence = sen;

        int L = sentence.length();
        if (sentence.charAt(L - 1) == '.' || sentence.charAt(L - 1) == '!' || sentence.charAt(L - 1) == '?')
            sentence = sentence.substring(0, L - 1);

        L = sentence.length();
        if (sentence.charAt(L - 1) != ' ')
            sentence += ' ';

        sentence = sentence.toUpperCase();
    }

    public void extractWord() {
        int a = 0;
        String word = "";
        int l = 0;
        String maxword = null;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                word = sentence.substring(a, i);
                palindrome(word);
                sort(word);
                l = word.length();
                if (l > maxlength)
                    maxlength = l;
            }
            a = i + 1;
        }
    }

    public static void palindrome(String s) {
        String word1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            word1 += s.charAt(i);
        }

        if (word1.equals(s))
            p++;
        else
            np++;
    }

    public static void sort(String s) {
        String word2 = null;
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) {
                    word2 += ch;
                }
            }
        }
        sorted += word2 + " ";
    }

    public void arranged() {
        int a = 0;
        String word3 = "";
        int minlength = 0;
        for (int i = 0; i < maxlength; i++) {
            for (int j = 0; j < sorted.length(); j++) {
                if (sorted.charAt(j) == ' ')
                    word3 = sorted.substring(a, j);
                if (word3.length() == i)
                    arranged += word3 + " ";
            }
        }
    }

    public void display() {
        System.out.println("NO OF PALINDROME WORDS: " + p);
        System.out.println("NO OF NON PALINDROME WORDS: " + np);
        System.out.println("SORTED SENTENCE: " + sorted);
        System.out.println("ARRANGED SENTENCE: " + arranged);
    }


    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence.");
        String sen = sc.nextLine();
        Pallindrome_Sectra27 s1 = new Pallindrome_Sectra27(sen);
        s1.extractWord();
        s1.arranged();
        s1.display();
    }
}