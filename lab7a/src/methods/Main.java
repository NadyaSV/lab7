package methods;

import java.util.HashSet;

public class Main {
    public static void main(String[] arg0) {
        String text = "Madam, I'm Adam. At noon I did the deed. Abracadabra!";
        for(int i = 0; i < WordsWithSameFirstAndLastLetter(text).length; i++)
            System.out.println(WordsWithSameFirstAndLastLetter(text)[i]);
    }
    public static String[] WordsWithSameFirstAndLastLetter(String text) {
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
        text = text.trim();
        String[] words = text.split(" ");
        HashSet<String> buffer = new HashSet<String>();
        for(int i = 0; i < words.length; i++) {
            if(words[i].toCharArray()[0] == words[i].toCharArray()[words[i].toCharArray().length - 1]) {
                buffer.add(words[i]);
            }
        }
        String[] wordskost = new String[buffer.size()];
        wordskost = buffer.toArray(wordskost);
        return wordskost;

    }
}
