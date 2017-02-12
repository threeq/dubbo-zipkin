package com.threeq.dubbo.tracing;

import com.alibaba.dubbo.rpc.Filter;
import com.alibaba.dubbo.rpc.RpcContext;
import com.threeq.dubbo.tracing.utils.RandomIdGenerator;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.sleuth.SpanExtractor;
import org.springframework.cloud.sleuth.SpanInjector;
import org.springframework.cloud.sleuth.autoconfig.TraceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

/**
 * @Date 2017/2/8
 * @User three
 */
@Configuration
@ConditionalOnProperty(value = "dubbo.trace.enabled", matchIfMissing = true)
@ConditionalOnClass(Filter.class)
@AutoConfigureAfter(TraceAutoConfiguration.class)
public class TraceDubboAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    public ApplicationContextAwareBean applicationContextAwareBean() {
        return new ApplicationContextAwareBean();
    }


    @Bean
    public SpanInjector<RpcContext> dubboSpanInjector() {
        Logger logger = Logger.getLogger(TraceDubboAutoConfiguration.class.getCanonicalName());
        logger.info("生成dubbo span跟踪支持");
        return new DubboSpanInjector();
    }

    @Bean
    public RandomIdGenerator randomIdGenerator() {
        return new RandomIdGenerator();
    }

    @Bean
    public SpanExtractor<RpcContext> dubboSpanExtractor(RandomIdGenerator randomIdGenerator) {
        return new DubboSpanExtractor(randomIdGenerator);
    }
}
