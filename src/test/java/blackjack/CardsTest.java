package blackjack;

import blackjack.domain.PlayingCard.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CardsTest {
    private Cards cards;

    @BeforeEach
    void setUp() {
        cards = new Cards(new Card(Symbol.CLOVER, Type.EIGHT), new Card(Symbol.CLOVER, Type.ACE));
    }

    @DisplayName("현재 보유 중인 카드의 총 점수 확인")
    @Test
    void currentScoreTest() {
        int score = cards.getScore();
        assertThat(score).isEqualTo(19);
    }
}
