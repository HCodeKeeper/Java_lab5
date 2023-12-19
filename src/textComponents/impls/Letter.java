package textComponents.impls;

import textComponents.SentenceComponent;

import java.util.Objects;

/**
 * Represents a single letter as part of a word in a text.
 */
public class Letter implements SentenceComponent {
    private char value;

    /**
     * Constructs a Letter object with the specified character value.
     *
     * @param value The character value of the letter.
     */
    public Letter(char value) {
        this.value = value;
    }

    /**
     * Gets the character value of the letter.
     *
     * @return The character value.
     */
    public char getValue() {
        return value;
    }

    /**
     * Compares this Letter to another object for equality.
     *
     * @param obj The object to compare to.
     * @return {@code true} if the objects are equal, {@code false} otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Letter otherLetter = (Letter) obj;
        return value == otherLetter.value;
    }

    /**
     * Generates a hash code for this Letter.
     *
     * @return The hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}