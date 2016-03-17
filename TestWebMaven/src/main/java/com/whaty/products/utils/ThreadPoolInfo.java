package com.whaty.products.utils;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

public class ThreadPoolInfo {
	
	public ThreadPoolTaskExecutor getThreadPool() {
		ThreadPoolTaskExecutor poolTaskExecutor = (ThreadPoolTaskExecutor) SpringUtil.getBean("taskExecutor");
		return poolTaskExecutor;
	}
	
	/**
	 * 返回线程池最大线程数量
	 * @return
	 */
	public static int  getThreadMaxNum() {
		return Runtime.getRuntime().availableProcessors()*2;
	}
	
}
