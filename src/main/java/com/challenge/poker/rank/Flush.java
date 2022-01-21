package com.challenge.poker.rank;

import java.util.Objects;

import com.challenge.poker.Card;
import com.challenge.poker.RankDisplay;

public class Flush extends Rank {

    private final Card highestCard;

    public Flush(int priority, Card highestCard) {
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
        if (o == null || getClass() != o.getClass()) return false;
        com.challenge.poker.rank.Flush flush = (com.challenge.poker.rank.Flush) o;
        return Objects.equals(highestCard, flush.highestCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(highestCard);
    }
}
