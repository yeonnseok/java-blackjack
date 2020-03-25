package blackjack.domain.PlayingCard;

public class Score {
    private static final int TEN = 10;
    private static final int BLACKJACK = 21;
    public static final int DEALER_CRITICAL_SCORE = 16;
    public static final Score BLACKJACK_SCORE = new Score(BLACKJACK);

    private int value;

    public Score(final int value) {
        this.value = value;
    }

    public Score plusTenIfNotBust() {
        final Score score = new Score(value + TEN);
        if (score.isBust()) {
            return this;
        }
        return score;
    }

    public boolean isBust() {
        return value > BLACKJACK;
    }

    public boolean isBlackJack() {
        return value == BLACKJACK;
    }

    public boolean isDealerHit() {
        return value <= DEALER_CRITICAL_SCORE;
    }

    public int getScoreValue() {
        return value;
    }
}
