package blackjack.domain.users;

import blackjack.domain.PlayingCard.Card;
import blackjack.domain.PlayingCard.CardDeck;
import blackjack.domain.State.State;
import blackjack.domain.State.StateFactory;

import java.util.Collections;
import java.util.List;

public abstract class User {
    protected String name;
    protected State state;

    public void receiveDistributedCards(CardDeck cardDeck) {
        state = StateFactory.draw(cardDeck.getOneCard(), cardDeck.getOneCard());
    }

    public void receiveOneMoreCard(CardDeck cardDeck) {
        state = state.draw(cardDeck.getOneCard());
    }

    public int getScore() {
        return state.cards().getScore();
    }

    public String getName() {
        return name;
    }

    public List<Card> getCards() {
        return Collections.unmodifiableList(state.cards().getCards());
    }

    public abstract List<Card> getInitialCards();

    public abstract boolean isReceivableOneMoreCard();
}
