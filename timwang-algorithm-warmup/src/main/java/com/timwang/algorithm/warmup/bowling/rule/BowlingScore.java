package com.timwang.algorithm.warmup.bowling.rule;

/**
 * @author wangjun
 * @date 2020-10-30
 */
public enum BowlingScore {
    /**
     * 击瓶分数
     */
    STRIKE(1,10, 2),
    SPARE(2, 9, 1)
    ;

    private int scoreType;
    private int score;
    private int nextAddRoundBowling;

    BowlingScore(int scoreType, int score, int nextAddRoundBowling) {
        this.scoreType = scoreType;
        this.score = score;
        this.nextAddRoundBowling = nextAddRoundBowling;
    }

    public int getScoreType() {
        return scoreType;
    }

    public int getScore() {
        return score;
    }

    public int getNextAddRoundBowling() {
        return nextAddRoundBowling;
    }
}
