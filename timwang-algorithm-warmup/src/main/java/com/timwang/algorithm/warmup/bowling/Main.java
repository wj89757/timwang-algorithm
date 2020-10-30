package com.timwang.algorithm.warmup.bowling;

import com.timwang.algorithm.warmup.bowling.calculate.BowlingRoundCalculator;
import com.timwang.algorithm.warmup.bowling.round.BowlingRound;

import java.util.Random;

/**
 * @author wangjun
 * @date 2020-10-30
 */
public class Main {

    private static Bowling init() {
        Bowling bowling = new Bowling();
        for (int i = 0; i < 21; i++) {
            bowling.roll(new Random().nextInt(11));
        }
        return bowling;
    }

    public static void main(String[] args) {
        Bowling init = init();
        init.toLinkedString();
        int score = init.getScore();
        System.out.println(score);
    }
}
