package borrows;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String word = "RASA";
        String result = borrowsWeller(word);
        System.out.println(borrowsWeller(word));
        System.out.println(borrowsWellerBack(result));
    }
    public static String borrowsWellerBack(String word) {
        ArrayList<String> iterations = new ArrayList<String>();
        iterations.add(word);
//		System.out.println(iterations.get(0));
        for(int i = 1; i < word.length(); i++) {
            iterations.add(iterations.get(i - 1).substring(i).concat(iterations.get(i - 1).substring(0 ,i)));
//			System.out.println(iterations.get(i - 1).substring(i).concat(iterations.get(i - 1).substring(i - 1 ,i)));
//			System.out.println(iterations.get(i));
        }
        Collections.sort(iterations);
        char[] letters = new char[word.length()];
        String[] iterationsArray = new String[letters.length];
        iterationsArray = iterations.toArray(iterationsArray);
//		System.out.println(iterationsArray[0]);
        for(int i = 0; i < letters.length; i++) {
//			System.out.println(letters[i]);
//			System.out.println(iterationsArray[i].toCharArray()[letters.length - 1]);
            letters[i] = iterationsArray[i].toCharArray()[letters.length - 1];
        }
        return new String(letters);
    }
    public static String borrowsWeller(String word) {
        ArrayList<String> iterations = new ArrayList<String>();
        iterations.add(word);
//		System.out.println(iterations.get(0));
        for(int i = 1; i < word.length(); i++) {
            iterations.add(iterations.get(i - 1).substring(i).concat(iterations.get(i - 1).substring(0 ,i)));
//			System.out.println(iterations.get(i - 1).substring(i).concat(iterations.get(i - 1).substring(i - 1 ,i)));
//			System.out.println(iterations.get(i));
        }
        Collections.sort(iterations);
        char[] letters = new char[word.length()];
        String[] iterationsArray = new String[letters.length];
        iterationsArray = iterations.toArray(iterationsArray);
//		System.out.println(iterationsArray[0]);
        for(int i = 0; i < letters.length; i++) {
//			System.out.println(letters[i]);
//			System.out.println(iterationsArray[i].toCharArray()[letters.length - 1]);
            letters[i] = iterationsArray[i].toCharArray()[letters.length - 1];
        }
        return new String(letters);
    }
}
