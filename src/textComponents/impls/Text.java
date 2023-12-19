package textComponents.impls;

import java.util.List;

/**
 * Represents a text composed of sentences.
 */
public class Text {
    private List<Sentence> sentences;

    /**
     * Constructs a Text object with the specified list of sentences.
     *
     * @param sentences The list of sentences that form the text.
     */
    public Text(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    /**
     * Gets the list of sentences that form the text.
     *
     * @return The list of sentences.
     */
    public List<Sentence> getSentences() {
        return sentences;
    }
}
