package com.atguigu.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;

/**
 * 自定义规则逻辑。就不写了，假设"我的逻辑"和"自带的随机算法"是一样的
 */
@Configuration
public class MySelfRule {
	@Bean
	public IRule myRule() {
		//return new RandomRule();  //Ribbon默认是轮询，我自定义为随机
		return new RandomRule_SZ(); //修改random算法源码，让每个服务执行5次后在换另外一个服务
	}
}
