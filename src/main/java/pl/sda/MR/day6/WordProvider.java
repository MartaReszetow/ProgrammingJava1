package pl.sda.MR.day6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Utwórz nową klasę WordProvider. Stwórz w niej statyczną metodę provide() zwracającą listę stringów.
// Lista powinna zawierać słowa pochodzące ze stringa którego wkleiłem wam przed chwilą.
//Wywołaj metodę stream() na tej liście. Następnie użyj metody filter aby otrzymać słowa na literę d.
// Wynik zapisz do nowej listy.
//Następnie ponownie przefiltruj pierwotną listę i zwróc tylko słowa na literę a nie dłuższe niż 4 litery.

public class WordProvider {

    public static List<String> provide( String words) {
        return Arrays.asList(words.split(","));
    }

    public static List<String> finder(String words, String letter) {
        List<String> result = provide(words).stream().filter(word -> word.startsWith(letter)).collect(Collectors.toList());
        return result;
    }


    public static List<String> wordsTrimmer(String words, String letter){
        return finder(words,letter).stream().filter(wordWithFourSigns-> wordWithFourSigns.length()<=4).collect(Collectors.toList());
    }

}
