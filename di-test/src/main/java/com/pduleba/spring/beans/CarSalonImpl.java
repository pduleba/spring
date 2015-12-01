package com.pduleba.spring.beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.pduleba.spring.beans.impl1.Fiat;
import com.pduleba.spring.interfaces.Car;

import lombok.Data;

@Component
public @Data class CarSalonImpl {

//	@Autowired		 	// ERROR - throw exception
//	@Resource 			// ERROR - throw exception
//	@Inject 			// ERROR - throw exception
//	@Qualifier 			// OK	 - null
//	private Car car;
	
//	@Autowired 			// OK - Audi - injected type by field name
//	@Resource 			// OK - Audi - injected type by field name
//	@Inject				// OK - Audi - injected type by field name
//	@Qualifier 			// OK - null
//	private Car audi;
	
//	@Autowired 			// OK - Audi - by qualifier name
//	@Resource 			// OK - Fiat - by resource and field name
//	@Inject				// OK - Audi - by qualifier name
//	@Qualifier(value=Audi.BEAN_NAME)
//	private Car fiat;

//	@Autowired 			// OK - Audi - by qualifier name
//	@Resource 			// OK - Audi - by qualifier name
//	@Inject				// OK - Audi - by qualifier name
//	@Qualifier(value=Audi.BEAN_NAME)
//	private Car someCar;

//	@Resource(name=Fiat.BEAN_NAME) 			// OK - Fiat - by resource (qualifier is ignored)
//	@Qualifier(value=Audi.BEAN_NAME)		// ignored
//	private Car someCar;
	
//	@Autowired 			// ERROR - throw exception
//	@Resource 			// ERROR - throw exception
//	@Inject				// ERROR - throw exception
//	@Qualifier(value="bad")
//	private Car fiat;
	
	@Resource(name=Fiat.BEAN_NAME) 			// OK - Fiat - by resource (qualifier is ignored)
	@Qualifier(value="bad")					// ignored
	private Car fiat;

	public Car getCar() {
		return fiat;
	}
}
