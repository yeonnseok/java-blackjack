package blackjack.domain.PlayingCard;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cards {
    public static final int INITIAL_CARDS_SIZE = 2;
    private final List<Card> values;

    public Cards(final Card... values) {
        this(Arrays.asList(values));
    }

    public Cards(final List<Card> values) {
        this.values = new ArrayList<>(values);
    }

    public void add(final Card card) {
        this.values.add(card);
    }

    public boolean isBlackJack() {
        return values.size() == INITIAL_CARDS_SIZE && score().isBlackJack();
    }

    public boolean isBust() {
        return score().isBust();
    }

    public boolean isDealerHit() {
        return score().isDealerHit();
    }

    public Score score() {
        Score score = sum();
        if (hasAce()) {
            score = score.plusTenIfNotBust();
        }
        return score;
    }

    private boolean hasAce() {
        return values.stream()
                .anyMatch(Card::isAce);
    }

    private Score sum() {
        return new Score(values.stream()
                .mapToInt(Card::getPoint)
                .sum());
    }

    public List<Card> getCards() {
        return values;
    }

    public List<Card> getInitialCards(int initialCardsSize) {
        return values.subList(0, initialCardsSize);
    }

    public int getScore() {
        return score().getScoreValue();
    }
}
