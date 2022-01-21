package com.challenge.poker.rank;

import java.util.Objects;

import com.challenge.poker.Card;
import com.challenge.poker.RankDisplay;

import static java.util.Arrays.asList;

public class TwoPair extends Rank {
    private final Card.Value firstPairValue;
    private final Card.Value secondPairValue;

    public TwoPair(int priority, Card.Value firstPairValue, Card.Value secondPairValue) {
        super(priority, new Card(Card.Value.max(firstPairValue, secondPairValue), null));
        this.firstPairValue = firstPairValue;
        this.secondPairValue = secondPairValue;
    }

    public Card.Value lowestRankingPairValue() {
        return Card.Value.min(firstPairValue, secondPairValue);
    }

    public Card.Value highestRankingPairValue() {
        return Card.Value.max(firstPairValue, secondPairValue);
    }

    @Override
    public <T> T displayUsing(RankDisplay<T> rankDisplay) {
        return rankDisplay.display(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com.challenge.poker.rank.TwoPair otherTwoPair = (com.challenge.poker.rank.TwoPair) o;
        return asList(firstPairValue, secondPairValue).containsAll(asList(otherTwoPair.firstPairValue, otherTwoPair.secondPairValue));
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstPairValue, secondPairValue);
    }

    @Override
    public String toString() {
        return String.format("TwoPair{first=%s, second=%s}", firstPairValue, secondPairValue);
    }
}
