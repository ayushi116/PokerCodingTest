package com.challenge.poker;

public interface GameResult {
    class Tie implements GameResult {
        private Tie() {
        }
    }

    GameResult tie = new Tie();
}
