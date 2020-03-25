package blackjack.domain.State;

import blackjack.domain.PlayingCard.Card;
import blackjack.domain.PlayingCard.Cards;

public class Hit extends Running {
    public Hit(Cards cards) {
        super(cards);
    }

    @Override
    public State draw(Card card) {
        cards.add(card);
        if (cards.isBust()) {
            return new Bust(cards);
        }
        return new Hit(cards);
    }

    @Override
    public State stay() {
        return new Stay(cards);
    }
}
