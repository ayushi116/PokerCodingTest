package com.challenge.poker;

import com.challenge.poker.rank.Rank;

public class StraightRule implements Rule {
    @Override
    public boolean canApply(Hand hand) {
        return hand.hasAllCardsWithConsecutiveValues();
    }

    @Override
    public Rank apply(Hand hand) {
        return Rank.straight(hand.highestCard());
    }
}