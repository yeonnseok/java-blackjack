package blackjack.domain.State;

import blackjack.domain.PlayingCard.Cards;

public class Bust extends Finished {
    public Bust(Cards cards) {
        super(cards);
    }
}
