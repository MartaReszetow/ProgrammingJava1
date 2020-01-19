package pl.sda.MR.lesson1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextAnalyser {
    public static void main(String[] args) {

        Map<Character, List<String>> mapOfWords = groupWordsByFirstCharacter("ALA HAS TWO CATS");
        System.out.println(mapOfWords);
    }

  /*  public static List wordSplitter(String stringToAnalise){
        
        
    }*/


    private static String[] textSplitter(String texttosplit) {
        return texttosplit.split(" ");
    }


    public static Map<Character, List<String>> groupWordsByFirstCharacter(String textToAnalyse) {
        Map<Character, List<String>> characterStringMap = new HashMap<>();
        char[] alphabet = "abcdefghijklmnoqprstuvwxyz".toCharArray();  // tworzy nam tablicą czarów
        for (char letter : alphabet
        ) {
            characterStringMap.put(letter, new ArrayList<>());
        }

        for (String singleString : textSplitter(textToAnalyse)
        ) {
            characterStringMap.get(singleString.toLowerCase().charAt(0)).add(singleString);  // dodaje słowo

        }
        return characterStringMap;
    }
}
