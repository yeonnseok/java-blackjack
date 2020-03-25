package blackjack.domain.State;

import blackjack.domain.PlayingCard.Cards;

public abstract class Running extends Started {
    public Running(Cards cards) {
        super(cards);
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public int profit(int money) {
        throw new UnsupportedOperationException();
    }
}
