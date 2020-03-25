package blackjack.domain.State;

import blackjack.domain.PlayingCard.Cards;

public class BlackJack extends Finished{
    public BlackJack(Cards cards) {
        super(cards);
    }

    @Override
    protected double ratio() {
        return 1.5;
    }
}
