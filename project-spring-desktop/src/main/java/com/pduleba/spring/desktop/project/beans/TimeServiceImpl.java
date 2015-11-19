package com.pduleba.spring.desktop.project.beans;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class TimeServiceImpl implements TimeServiceApi {

	@Override
	public String getCurrentDate() {
		return LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME);
	}

}
