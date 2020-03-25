package blackjack.domain.users;

import blackjack.domain.PlayingCard.Card;

import java.util.List;

public class Dealer extends User {
    private static final int DEALER_INITIAL_CARDS_SIZE = 1;
    private static final String KOREAN_NAME = "딜러";

    private static Dealer dealerInstance;

    private Dealer() {
        this.name = KOREAN_NAME;
    }

    public static Dealer getDealer() {
        if (dealerInstance == null) {
            dealerInstance = new Dealer();
        }
        return dealerInstance;
    }

    @Override
    public List<Card> getInitialCards() {
        return state.cards().getInitialCards(DEALER_INITIAL_CARDS_SIZE);
    }

    @Override
    public boolean isReceivableOneMoreCard() {
        return state.cards().isDealerHit();
    }
}