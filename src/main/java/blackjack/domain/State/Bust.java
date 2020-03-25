package blackjack.domain.State;

import blackjack.domain.PlayingCard.Cards;

public class Bust extends Finished {
    public Bust(Cards cards) {
        super(cards);
    }

    @Override
    protected double ratio() {
        return -1.0;
    }
}
