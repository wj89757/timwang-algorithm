package com.timwang.algorithm.warmup.bowling.roll;

import com.timwang.algorithm.warmup.bowling.round.BowlingRound;

/**
 * @author wangjun
 * @date 2020-10-30
 */
public class BowlingRoll {
    public static BowlingRound init() {
        BowlingRound bowlingRound = new BowlingRound();
        bowlingRound.setRound(1);
        bowlingRound.setScore(0);
        return bowlingRound;
    }

    public static BowlingRound rollN(BowlingRound bowlingRound, int n) {
        BowlingRound lastRound = new BowlingRound();
        BowlingRound head = bowlingRound;
        while (head != null) {
            if (head.getNextRound() != null) {
                head = head.getNextRound();
                continue;
            }
            lastRound = head;
            head = null;
        }
        lastRound.setScore(n);

        BowlingRound nextRound = new BowlingRound();
        nextRound.setRound(lastRound.getRound() + 1);
        nextRound.setScore(0);

        lastRound.setNextRound(nextRound);
        return bowlingRound;
    }
}
