package com.timwang.algorithm.warmup.bowling.rule;

import com.timwang.algorithm.warmup.bowling.round.BowlingRound;

/**
 * @author wangjun
 * @date 2020-10-30
 */
public class StrikeAddScoreRule extends BaseAddScoreRule {

    @Override
    public int getScore(BowlingRound bowlingRound) {
        if (bowlingRound == null) {
            return 0;
        }
        return calculateAllRound(bowlingRound, BowlingScore.STRIKE);
    }
}
