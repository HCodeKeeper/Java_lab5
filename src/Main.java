import textComponents.SentenceComponent;
import textComponents.impls.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Letter> letters1 = new ArrayList<>();
        letters1.add(new Letter('H'));
        letters1.add(new Letter('e'));
        letters1.add(new Letter('l'));
        letters1.add(new Letter('l'));
        letters1.add(new Letter('o'));

        List<Letter> letters2 = new ArrayList<>();
        letters2.add(new Letter('H'));
        letters2.add(new Letter('i'));

        List<Letter> letters3 = new ArrayList<>();
        letters3.add(new Letter('T'));
        letters3.add(new Letter('h'));
        letters3.add(new Letter('e'));
        letters3.add(new Letter('r'));
        letters3.add(new Letter('e'));

        // Creating Word's
        List<Word> words = new ArrayList<>();
        words.add(new Word(letters1));
        words.add(new Word(letters2));
        words.add(new Word(letters3));

        // Adding Word's and punctuation marks in sentences
        List<SentenceComponent> sentence1components = new ArrayList<>();
        sentence1components.add(words.get(0));
        sentence1components.add(new PunctuationMark('.'));
        Sentence sentence1 = new Sentence(sentence1components);

        List<SentenceComponent> sentence2components = new ArrayList<>();
        sentence2components.add(words.get(1));
        sentence2components.add(new PunctuationMark('.'));
        Sentence sentence2 = new Sentence(sentence2components);

        List<SentenceComponent> sentence3components = new ArrayList<>();
        sentence3components.add(words.get(2));
        sentence3components.add(new PunctuationMark('.'));
        Sentence sentence3 = new Sentence(sentence3components);

        List<Sentence> sentences = new ArrayList<>();
        sentences.add(sentence1);
        sentences.add(sentence2);
        sentences.add(sentence3);

        // Adding everything into the text

        Text text = new Text(sentences);

        // Creating words to compare to
        Word[] wordsArray = {
                new Word(List.of(new Letter('H'), new Letter('i'))),
                new Word(List.of(new Letter('H'), new Letter('e'),
                        new Letter('l'), new Letter('l'), new Letter('o'))),
                new Word(List.of(new Letter('T'), new Letter('h'),
                        new Letter('e'), new Letter('r'), new Letter('e'))),
        };

        // Creating HashMap for holding word occurrences count
        Map<Word, Integer> wordCountMap = new HashMap<>();

        for (Sentence sentenceFromText : text.getSentences()) {
            for (SentenceComponent element : sentenceFromText.getElements()) {
                if (element instanceof Word) {
                    // Retrieving words from sentences
                    Word word = (Word) element;
                    for (Word wordFromComparisonSet : wordsArray){
                        // Comparing words against ones in comparison collection
                        if (word.equals(wordFromComparisonSet)) {
                            // count+1 or 1
                            wordCountMap.put(word, wordCountMap.getOrDefault(word, 1));
                        }
                    }
                }
            }
        }
        for (Map.Entry<Word, Integer> entry : wordCountMap.entrySet()) {
            System.out.println("Word '" + entry.getKey() + "' appears in " + entry.getValue() + " occurrences.");
        }
    }
}