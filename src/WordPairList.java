import java.util.ArrayList;

public class WordPairList {

    //instance variable
    private ArrayList<WordPair> allPairs = new ArrayList<>();

    //constructor
    public WordPairList(String[] words){
        /* length of allPairs should equal the Combinations of choosing 2 out of n
        with n being the length of the String array: words
        e.g. if words.length is 4, then allPairs.size() is 6
        if words.length is 5, then allPairs.size() is 10, and so on */

        //WordPair objects (words[i], words[j]) for every i and j, where 0 <= i < j < words.length
        for (int i = 0; i < words.length; i++){
            for (int j = i+1; j < words.length; j++){
                WordPair newWordPair = new WordPair(words[i], words[j]);
                allPairs.add(newWordPair);
            }
        }
    }

    //getter method
    public ArrayList<WordPair> getAllPairs() {
        return allPairs;
    }

    //method numMatches
    public int numMatches(){
        int count = 0;
        for (WordPair pair : allPairs){
            //if first word in WordPair Object equals the second word in WordPair Object
            if (pair.getFirst().equals(pair.getSecond())){
                count++;
            }
        }
        return count;
    }
}
