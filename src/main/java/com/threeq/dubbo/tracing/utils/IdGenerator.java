package com.threeq.dubbo.tracing.utils;

/**
 * span id生成接口
 *
 * @Date 2017/2/12
 * @User three
 */
public interface IdGenerator {
    long nextId();
}
