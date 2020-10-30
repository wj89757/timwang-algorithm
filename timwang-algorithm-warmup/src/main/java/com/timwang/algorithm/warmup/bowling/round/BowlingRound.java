package com.timwang.algorithm.warmup.bowling.round;

import java.util.List;

/**
 * @author wangjun
 * @date 2020-10-30
 */
public class BowlingRound {
    private int score;
    private int round;
    private BowlingRound nextRound;

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public BowlingRound getNextRound() {
        return nextRound;
    }

    public void setNextRound(BowlingRound nextRound) {
        this.nextRound = nextRound;
    }

    public void toLinkedString() {
        StringBuilder stringBuilder = new StringBuilder();
        BowlingRound head = this;
        while (head != null) {
            stringBuilder.append(head.getScore() + "+");
            head = head.nextRound;
        }
        System.out.println(stringBuilder.toString());
    }
}
