package com.pduleba.spring;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CommandImpl implements CommandApi {

	public int work = 0;
	
	@Override
	public int doWork() {
		return ++work;
	}
}
