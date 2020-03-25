package blackjack.domain.State;

import blackjack.domain.PlayingCard.Card;
import blackjack.domain.PlayingCard.Cards;

public class StateFactory {
    public static State draw(Card first, Card second) {
        final Cards cards = new Cards(first, second);
        if (cards.isBlackJack()) {
            return new BlackJack(cards);
        }
        return new Hit(cards);
    }
}
