package blackjack.domain.PlayingCard;

import blackjack.exception.CardDeckDuplicatedException;
import blackjack.exception.CardDeckEmptyException;

import java.util.*;

public class CardDeck {
    private static final String CARD_DECK_NULL_EXCEPTION_MESSAGE = "생성할 수 있는 카드가 없습니다.";
    private static final String CARD_DECK_DUPLICATED_EXCEPTION_MESSAGE = "카드 덱 안에 중복된 카드가 있습니다.";
    private static final String CARD_DECK_EMPTY_EXCEPTION_MESSAGE = "카드 덱이 비었습니다.";

    private final Queue<Card> cardDeck;

    public CardDeck(List<Card> cards) {
        checkCardDeckNull(cards);
        checkCardDeckDuplicated(cards);
        cardDeck = new LinkedList<>(cards);
    }

    private void checkCardDeckNull(List<Card> cards) {
        if (cards == null) {
            throw new NullPointerException(CARD_DECK_NULL_EXCEPTION_MESSAGE);
        }
    }

    private void checkCardDeckDuplicated(List<Card> cards) {
        Set<Card> deDuplicatedCards = new HashSet<>(cards);
        if (deDuplicatedCards.size() != cards.size()) {
            throw new CardDeckDuplicatedException(CARD_DECK_DUPLICATED_EXCEPTION_MESSAGE);
        }
    }

    private void checkCardDeckEmpty() {
        if (cardDeck.isEmpty()) {
            throw new CardDeckEmptyException(CARD_DECK_EMPTY_EXCEPTION_MESSAGE);
        }
    }

    public Card getOneCard() {
        checkCardDeckEmpty();
        return cardDeck.poll();
    }
}
