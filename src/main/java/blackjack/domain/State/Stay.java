package blackjack.domain.State;

import blackjack.domain.PlayingCard.Cards;

public class Stay extends Finished {
    public Stay(Cards cards) {
        super(cards);
    }

    @Override
    protected double ratio() {
        return 1.0;
    }
}
