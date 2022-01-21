package com.challenge.poker.rank;

import java.util.Objects;

import com.challenge.poker.Card;
import com.challenge.poker.RankDisplay;

public class StraightFlush extends Rank {

    private final Card highestCard;

    public StraightFlush(int priority, Card highestCard) {
        super(priority, highestCard);
        this.highestCard = highestCard;
    }

    public Card.Value highestCardValue() {
        return highestCard.value;
    }

    @Override
    public <T> T displayUsing(RankDisplay<T> rankDisplay) {
        return rankDisplay.display(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof com.challenge.poker.rank.StraightFlush)) return false;
        com.challenge.poker.rank.StraightFlush that = (com.challenge.poker.rank.StraightFlush) o;
        return Objects.equals(highestCard, that.highestCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(highestCard);
    }
}
