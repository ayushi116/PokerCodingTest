package com.challenge.poker;

import com.challenge.poker.rank.Rank;

public class ThreeOfKindRule implements Rule {
    @Override
    public boolean canApply(Hand hand) {
        return hand.hasThreeCardsWithTheSameValue();
    }

    @Override
    public Rank apply(Hand hand) {
        ThreeCards threeCards = hand.selectThreeCardsWithTheSameValue().get();
        return Rank.threeOfKind(threeCards.takeOne().value);
    }

}
