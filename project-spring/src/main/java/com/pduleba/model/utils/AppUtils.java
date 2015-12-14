package com.pduleba.model.utils;

import org.slf4j.Logger;

public final class AppUtils {

	private AppUtils() {}
	
	public static void logValidationStatus(final Logger LOG, String apiName, boolean isValid, int errorCount) {
		LOG.info("{} :: {} :: error count :: {}", apiName, isValid ? "valid" : "invalid", errorCount);
	} 
	
}
