package pocket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        String text = "Madam, I'm Adam. At noon I did the deed. Abracadabra!";
        for(int i = 0; i < strangeSortMethod(text, 'a').length; i++)
            System.out.println(strangeSortMethod(text, 'a')[i]);
    }
    public static String[] strangeSortMethod(String text, char symbol) {
        text = text.toLowerCase();
        text = text.replace(", ", " ");
        text = text.replace(". ", " ");
        text = text.replace("? ", " ");
        text = text.replace("! ", " ");
        text = text.replace("- ", " ");
        text = text.replace(": ", " ");
        text = text.replace("; ", " ");
        text = text.replace(",", " ");
        text = text.replace(".", " ");
        text = text.replace("?", " ");
        text = text.replace("!", " ");
        text = text.replace("-", " ");
        text = text.replace(":", " ");
        text = text.replace(";", " ");
// Everything goes
        text = text.trim();
        String[] words = text.split(" ");
        HashSet<String> buffer = new HashSet<String>(); //не будет повторений
        for(int i = 0; i < words.length; i++) {
            buffer.add(words[i]);
        }
        String[] wordskost = new String[buffer.size()];
        wordskost = buffer.toArray(wordskost);
//
        String strBuffer = null;
        for(int i = 0; i < wordskost.length; i++)
            for(int j = i; j < wordskost.length; j++) {
                if(strangeCompareBigger(wordskost[j],wordskost[i],symbol)) {
                    strBuffer = wordskost[i];
                    wordskost[i] = wordskost[j];
                    wordskost[j] = strBuffer;
                }

            }
        return wordskost;
    }
    public static boolean strangeCompareBigger (String word1, String word2, char symbol) {
        int sumSymbols1 = 0;
        int sumSymbols2 = 0;
        for(int i = 0; i < word1.length(); i++) {
            if(word1.toCharArray()[i] == symbol)
                sumSymbols1++;
        }
        for(int i = 0; i < word2.length(); i++) {
            if(word2.toCharArray()[i] == symbol)
                sumSymbols2++;
        }
        if(sumSymbols1 > sumSymbols2)
            return true;
        if(sumSymbols1 < sumSymbols2)
            return false;
        for(int i = 0; i < min(word1.length(), word2.length()); i++) {
            if(word1.toCharArray()[i] < word2.toCharArray()[i])
                return true;
            if(word1.toCharArray()[i] > word2.toCharArray()[i])
                return false;
        }
        if(word1.length() == min(word1.length(), word2.length()))
            return true;
        else
            return false;
    }
    static int min(int a, int b) {
        if(a < b)
            return a;
        return b;
    }
/*	static void swap(String a, String b) {
		String buffer = a;
		a = b;
		b = buffer;;
	}*/
}
