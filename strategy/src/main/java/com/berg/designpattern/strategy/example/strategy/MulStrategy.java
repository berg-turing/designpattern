package com.berg.designpattern.strategy.example.strategy;

import org.springframework.stereotype.Component;

/**
 * 乘法策略
 *
 * @author bergturing@qq.com
 * @apiNote 2018/11/29
 */
@Component
public class MulStrategy implements Strategy {
    @Override
    public double operate(double numberA, double numberB) {
        return numberA * numberB;
    }
}
