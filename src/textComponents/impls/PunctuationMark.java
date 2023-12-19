package textComponents.impls;

import textComponents.SentenceComponent;

/**
 * Represents a punctuation mark in a text.
 */
public class PunctuationMark implements SentenceComponent {
    private char value;

    /**
     * Constructs a PunctuationMark object with the specified character value.
     *
     * @param value The character value of the punctuation mark.
     */
    public PunctuationMark(char value) {
        this.value = value;
    }

    /**
     * Gets the character value of the punctuation mark.
     *
     * @return The character value.
     */
    public char getValue() {
        return value;
    }
}
