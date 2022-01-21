package com.challenge.poker;

import com.challenge.poker.rank.Rank;

public interface Rule {
    boolean canApply(Hand hand);

    Rank apply(Hand hand);
}
