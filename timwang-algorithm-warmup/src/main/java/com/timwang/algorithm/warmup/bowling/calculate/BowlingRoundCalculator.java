package com.timwang.algorithm.warmup.bowling.calculate;

import com.timwang.algorithm.warmup.bowling.round.BowlingRound;
import com.timwang.algorithm.warmup.bowling.rule.BaseAddScoreRule;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangjun
 * @date 2020-10-30
 */
public class BowlingRoundCalculator {
    private List<BaseAddScoreRule> ruleList = new ArrayList<>();

    public void addRule(BaseAddScoreRule rule) {
        ruleList.add(rule);
    }

    public int calculate(BowlingRound bowlingRound) {
        int baseSum = calculatePureScore(bowlingRound);
        int addSum = calculateAddScore(bowlingRound);
        return baseSum + addSum;
    }

    private int calculateAddScore(BowlingRound bowlingRound) {
        int sum = 0;
        for (BaseAddScoreRule baseAddScoreRule : ruleList) {
            sum += baseAddScoreRule.getScore(bowlingRound);
        }
        return sum;
    }

    private int calculatePureScore(BowlingRound bowlingRound) {
        int sum = 0;
        if (bowlingRound == null) {
            return sum;
        }
        while (bowlingRound.getNextRound() != null) {
            sum += bowlingRound.getScore();
            bowlingRound = bowlingRound.getNextRound();
        }
        return sum;
    }
}
