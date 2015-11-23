package com.pduleba.spring.xml.configuration.beans;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import lombok.Data;

@Data class TimeServiceImpl implements TimeServiceApi {

	@Override
	public String getCurrentDate() {
		return LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME);
	}

}
