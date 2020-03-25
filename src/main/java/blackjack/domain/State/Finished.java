package blackjack.domain.State;

import blackjack.domain.PlayingCard.Card;
import blackjack.domain.PlayingCard.Cards;

public abstract class Finished extends Started {
    public Finished(Cards cards) {
        super(cards);
    }

    @Override
    public State draw(Card card) {
        throw new UnsupportedOperationException();
    }

    @Override
    public State stay() {
        throw new UnsupportedOperationException();
    }
}
