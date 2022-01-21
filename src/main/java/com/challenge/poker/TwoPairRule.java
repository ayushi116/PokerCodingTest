package com.challenge.poker;

import java.util.List;

import com.challenge.poker.rank.Rank;

public class TwoPairRule implements Rule {
    @Override
    public boolean canApply(Hand hand) {
        return hand.selectCoupleOfTwoCardsWithTheSameValue().isPresent();
    }

    @Override
    public Rank apply(Hand hand) {
        List<TwoCards> twoPair = hand.selectCoupleOfTwoCardsWithTheSameValue().get();

        return Rank.twoPair(twoPair.get(0).first().value, twoPair.get(1).first().value);
    }

}
