package blackjack.domain.State;

import blackjack.domain.PlayingCard.Cards;

public class Stay extends Finished {
    public Stay(Cards cards) {
        super(cards);
    }
}
