package com.threeq.dubbo.tracing.utils;

import java.util.Random;

/**
 * 随机 id 生成器
 * @Date 2017/2/12
 * @User three
 */
public class RandomIdGenerator implements IdGenerator {

    private static Random random = new Random();

    @Override
    public long nextId() {
        return random.nextLong();
    }
}
