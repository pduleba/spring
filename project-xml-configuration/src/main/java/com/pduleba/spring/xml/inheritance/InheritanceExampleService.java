package com.pduleba.spring.xml.inheritance;

import lombok.Data;
import lombok.ToString;

public @Data @ToString class InheritanceExampleService implements InheritanceExampleServiceApi {
							 
	private String msg1;
	private String msg2;
	private String msg3;
	private String msg4;

}
