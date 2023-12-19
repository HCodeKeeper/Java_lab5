package textComponents.impls;

import textComponents.SentenceComponent;

import java.util.List;

/**
 * Represents a word composed of a list of letters in a text.
 */
public class Word implements SentenceComponent {
    private List<Letter> letters;

    /**
     * Constructs a Word object with the specified list of letters.
     *
     * @param letters The list of letters composing the word.
     */
    public Word(List<Letter> letters) {
        this.letters = letters;
    }

    /**
     * Gets the list of letters composing the word.
     *
     * @return The list of letters.
     */
    public List<Letter> getLetters() {
        return letters;
    }

    /**
     * Compares this Word to another object for equality.
     *
     * @param obj The object to compare to.
     * @return {@code true} if the objects are equal, {@code false} otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Word otherWord = (Word) obj;
        return letters.equals(otherWord.letters);
    }

    /**
     * Generates a hash code for this Word.
     *
     * @return The hash code.
     */
    @Override
    public int hashCode() {
        return letters.hashCode();
    }

    /**
     * Converts the Word to a string representation.
     *
     * @return The string representation of the word.
     */
    @Override
    public String toString() {
        StringBuilder wordBuilder = new StringBuilder();
        for (Letter letter : letters) {
            wordBuilder.append(letter.getValue());
        }
        return wordBuilder.toString();
    }
}
