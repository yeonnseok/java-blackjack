package blackjack.domain.State;

import blackjack.domain.PlayingCard.Card;
import blackjack.domain.PlayingCard.Cards;

public interface State {
    State draw(Card card);

    State stay();

    Cards cards();
}
