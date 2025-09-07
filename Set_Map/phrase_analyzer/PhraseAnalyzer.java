package phrase_analyzer;

import java.util.List;
import java.util.TreeMap;

public class PhraseAnalyzer {
    public static TreeMap<String,Integer> wordCount(String phrase){
        TreeMap<String,Integer> map = new TreeMap<>();
        phrase = phrase.toLowerCase().replaceAll("[?.!,]","");
        List<String> listOfWords= List.of(phrase.split(" "));
        for(String word : listOfWords){
            int count=0;
            for (String listOfWord : listOfWords) {
                if (word.equals(listOfWord)) {
                    count++;
                }
            }
            map.put(word,count);
        }
        return map;
    }
}
