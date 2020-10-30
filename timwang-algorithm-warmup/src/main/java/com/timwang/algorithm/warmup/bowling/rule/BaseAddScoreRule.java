package com.timwang.algorithm.warmup.bowling.rule;

import com.timwang.algorithm.warmup.bowling.round.BowlingRound;

/**
 * @author wangjun
 * @date 2020-10-30
 */
public abstract class BaseAddScoreRule {
    /**
     * 计算这一轮的得分
     * @param bowlingRound BowlingRound
     * @return 分数
     */
    public abstract int getScore(BowlingRound bowlingRound);

    public int calculateAllRound(BowlingRound bowlingRound, BowlingScore bowlingScore) {
        BowlingRound head = bowlingRound;
        int sum = 0;
        while (head != null) {
            if (head.getScore() == bowlingScore.getScore()) {
                sum += calculateRewardScore(head);
            }
            head = head.getNextRound();
        }
        return sum;
    }

    private int calculateRewardScore(BowlingRound bowlingRound) {
        for (BowlingScore item : BowlingScore.values()) {
            if (item.getScore() == bowlingRound.getScore()) {
                return nextNRoundScore(bowlingRound, item.getNextAddRoundBowling(), 0);
            }
        }
        return 0;
    }

    private int nextNRoundScore(BowlingRound bowlingRound, int nextAddRoundBowling, int sum) {
        if (nextAddRoundBowling == 0) {
            return sum;
        }
        if (bowlingRound.getNextRound() == null) {
            return sum;
        }
        sum += bowlingRound.getNextRound().getScore();
        return nextNRoundScore(bowlingRound.getNextRound(), --nextAddRoundBowling, sum);
    }
}
