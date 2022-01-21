package com.challenge.poker;

import org.junit.Test;

import com.challenge.poker.rank.Rank;

import static com.challenge.poker.Card.Suit.*;
import static com.challenge.poker.Card.Value.*;
import static com.challenge.poker.CardBuilder.*;
import static org.junit.Assert.assertTrue;

public class RankTest {

    @Test
    public void the_pair_with_the_highest_kicker_is_higher_than_another_pair_having_the_same_value() {
        Rank winningPair = Rank.pair(fiveOf(Diamonds), fiveOf(Hearts), kingOf(Clubs));
        Rank anotherPair = Rank.pair(fiveOf(Clubs), fiveOf(Spades), sevenOf(Clubs));

        assertTrue(winningPair.higherThan(anotherPair));
    }

    @Test
    public void two_pair_with_highest_card_is_higher_than_another_one() {
        Rank highest = Rank.twoPair(Two, Four);
        Rank other = Rank.twoPair(Three, Two);

        assertTrue(highest.higherThan(other));
    }
}
