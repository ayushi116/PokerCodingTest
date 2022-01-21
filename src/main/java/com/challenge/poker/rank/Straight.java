package com.challenge.poker.rank;

import java.util.Objects;

import com.challenge.poker.Card;
import com.challenge.poker.RankDisplay;

import static java.lang.String.format;

public class Straight extends Rank {

    private final Card highestCard;

    Straight(int priority, Card highestCard) {
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
        if (!(o instanceof com.challenge.poker.rank.Straight)) return false;
        com.challenge.poker.rank.Straight straight = (com.challenge.poker.rank.Straight) o;
        return Objects.equals(highestCard, straight.highestCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(highestCard);
    }

    @Override
    public String toString() {
        return format("Straight{highestCard=%s}", highestCard);
    }
}
