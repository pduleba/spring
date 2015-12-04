package com.pduleba.spring.lifecycle;

import static org.apache.commons.lang3.BooleanUtils.isFalse;
import static org.apache.commons.lang3.BooleanUtils.isTrue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.SmartLifecycle;

public class AppSmartLifecycle implements SmartLifecycle {

	public static final Logger LOG = LoggerFactory.getLogger(AppSmartLifecycle.class);
	
	private boolean isRunning = false;

	private int work;
	
	public AppSmartLifecycle() {
		this.work = 5;
	}
	
	@Override
	public void start() {
		if (isFalse(isRunning)) {
			this.isRunning = true;
		}
		LOG.info("start()");
	}

	@Override
	public void stop() {
		if (isTrue(isRunning) && work-- > 0) {
			this.isRunning = false;
		}
		LOG.info("stop()");
	}

	@Override
	public boolean isRunning() {
		LOG.info("isRunning() :: {}", isRunning);
		return isRunning;
	}

	@Override
	public int getPhase() {
		LOG.info("getPhase()");
		return 0;
	}

	@Override
	public boolean isAutoStartup() {
		LOG.info("isAutoStartup()");
		return false;
	}

	@Override
	public void stop(Runnable callback) {
		new Thread() {
			public void run() {
				while (work-- > 0) {
					try {
						sleep(500);
					} catch (InterruptedException e) {
						LOG.error("sleep() :: {}", e.getMessage());
					}
					LOG.info("stop(Runnable callback) :: {}", work);
				}
				
				callback.run();
			};
		}.start();
		LOG.info("stop(Runnable callback) :: {}", work);
	}

}
