package com.timwang.algorithm.warmup.bowling;

import com.timwang.algorithm.warmup.bowling.calculate.BowlingRoundCalculator;
import com.timwang.algorithm.warmup.bowling.roll.BowlingRoll;
import com.timwang.algorithm.warmup.bowling.round.BowlingRound;
import com.timwang.algorithm.warmup.bowling.rule.SpareAddScoreRule;
import com.timwang.algorithm.warmup.bowling.rule.StrikeAddScoreRule;

// Please don't modify the class name.
public class Bowling {
    private BowlingRound bowlingRound = BowlingRoll.init();

    // Please don't modify the signature of this method.
    public void roll(int n) {
        BowlingRoll.rollN(bowlingRound, n);
    }

    // Please don't modify the signature of this method.
    public int getScore() {
        BowlingRoundCalculator calculator = new BowlingRoundCalculator();
        calculator.addRule(new SpareAddScoreRule());
        calculator.addRule(new StrikeAddScoreRule());

        return calculator.calculate(bowlingRound);
    }

    public void toLinkedString() {
        bowlingRound.toLinkedString();
    }
}
