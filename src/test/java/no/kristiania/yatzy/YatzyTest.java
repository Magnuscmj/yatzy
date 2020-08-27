package no.kristiania.yatzy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class YatzyTest {

    private final YatzyGame yatzyGame = new YatzyGame();

    @Test
    void shouldScoreOnes() {
        assertEquals(4, yatzyGame.score(YatzyCategory.ONES,new int[]{ 1, 1, 2, 1, 1}));
        assertEquals(2, yatzyGame.score(YatzyCategory.ONES,new int[]{ 6, 5, 2, 1, 1}));
    }

    @Test
    void shouldScoreTwos() {
        assertEquals(4, yatzyGame.score(YatzyCategory.TWOS,new int[]{ 1, 1, 2, 2, 1}));
        assertEquals(2, yatzyGame.score(YatzyCategory.TWOS,new int[]{ 6, 5, 2, 1, 1}));
    }

    @Test
    void shouldScoreThree() {
        assertEquals(12, yatzyGame.score(YatzyCategory.THREE,new int[]{ 2, 3, 3, 3, 3}));
        assertEquals(15, yatzyGame.score(YatzyCategory.THREE,new int[]{ 3, 3, 3, 3, 3}));
    }

    @Test
    void shouldScoreFours() {
        assertEquals(12, yatzyGame.score(YatzyCategory.FOUR,new int[]{ 4, 4, 4, 2, 1}));
        assertEquals(16, yatzyGame.score(YatzyCategory.FOUR,new int[]{ 4, 4, 4, 4, 1}));
    }

    @Test
    void shouldScoreFives() {
        assertEquals(15, yatzyGame.score(YatzyCategory.FIVE,new int[]{ 5, 5, 5, 2, 1}));
        assertEquals(20, yatzyGame.score(YatzyCategory.FIVE,new int[]{ 5, 5, 5, 5, 1}));
    }

    @Test
    void shouldScoreSixes() {
        assertEquals(12, yatzyGame.score(YatzyCategory.SIX,new int[]{ 6, 6, 5, 2, 1}));
        assertEquals(18, yatzyGame.score(YatzyCategory.SIX,new int[]{ 6, 6, 6, 2, 1}));
    }

    @Test
    void shouldScorePair() {
        assertEquals(10, yatzyGame.score(YatzyCategory.PAIR,new int[]{ 1, 3, 5, 5, 2}));
        assertEquals(12, yatzyGame.score(YatzyCategory.PAIR,new int[]{ 1, 6, 6, 5, 2}));
    }

    @Test
    void shouldScoreTwoPair() {
        assertEquals(12, yatzyGame.score(YatzyCategory.TWO_PAIR,new int[]{ 5, 5, 1, 1, 2}));
        assertEquals(18, yatzyGame.score(YatzyCategory.TWO_PAIR,new int[]{ 5, 5, 4, 4, 2}));
    }

    @Test
    void shouldScoreTHREOFAKIND() {
        assertEquals(12, yatzyGame.score(YatzyCategory.THREE_OF_A_KIND,new int[]{ 4, 4, 4, 1, 2}));
        assertEquals(18, yatzyGame.score(YatzyCategory.THREE_OF_A_KIND,new int[]{ 6, 6, 6, 4, 2}));
    }

    @Test
    void shouldScoreFOUROFAKIND() {
        assertEquals(8, yatzyGame.score(YatzyCategory.FOUR_OF_A_KIND,new int[]{ 2, 2, 2, 2, 1}));
        assertEquals(4, yatzyGame.score(YatzyCategory.FOUR_OF_A_KIND,new int[]{ 1, 1, 1, 1, 2}));
    }

    @Test
    void shouldScoreLittleStraight() {
        assertEquals(5, yatzyGame.score(YatzyCategory.LITTLE_STRAIGHT,new int[]{ 1, 2, 3, 4, 5}));
    }



}
