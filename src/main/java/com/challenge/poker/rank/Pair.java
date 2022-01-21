package com.challenge.poker.rank;

import java.util.Objects;

import com.challenge.poker.Card;
import com.challenge.poker.RankDisplay;

import static java.lang.String.format;

public class Pair extends Rank {
    private final Card first;
    private final Card second;
    private final Card highestRankingKicker;

    public Pair(int priority, Card first, Card second, Card highestRankingKicker) {
        super(priority, first);
        this.first = first;
        this.second = second;
        this.highestRankingKicker = highestRankingKicker;
    }

    public Card.Value value() {
        return first.value;
    }

    @Override
    public boolean higherThan(Rank other) {
        if (super.higherThan(other)) {
            return true;
        }

        return isPair(other) && hasHighestKickerThan(other);
    }

    @Override
    public <T> T displayUsing(RankDisplay<T> rankDisplay) {
        return rankDisplay.display(this);
    }

    private boolean isPair(Rank other) {
        return other instanceof com.challenge.poker.rank.Pair;
    }

    private boolean hasHighestKickerThan(Rank other) {
        com.challenge.poker.rank.Pair otherPair = (com.challenge.poker.rank.Pair) other;
        return highestRankingKicker.higherThan(otherPair.highestRankingKicker);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com.challenge.poker.rank.Pair pair = (com.challenge.poker.rank.Pair) o;
        return Objects.equals(first, pair.first) &&
                Objects.equals(second, pair.second) &&
                Objects.equals(highestRankingKicker, pair.highestRankingKicker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    @Override
    public String toString() {
        return format("Pair'{'first=%s, second=%s, highestRankingKicker=%s'}'", first, second, highestRankingKicker);
    }
}
