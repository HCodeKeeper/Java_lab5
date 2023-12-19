package textComponents.impls;

import textComponents.SentenceComponent;

import java.util.List;

/**
 * Represents a sentence in a text, composed of sentence components.
 */
public class Sentence {
    private List<SentenceComponent> elements;

    /**
     * Constructs a Sentence object with the specified list of sentence components.
     *
     * @param elements The list of sentence components that form the sentence.
     */
    public Sentence(List<SentenceComponent> elements) {
        this.elements = elements;
    }

    /**
     * Gets the list of sentence components that form the sentence.
     *
     * @return The list of sentence components.
     */
    public List<SentenceComponent> getElements() {
        return elements;
    }
}
