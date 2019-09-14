package org.sasanlabs.internal.utility;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.sasanlabs.vulnerability.types.VulnerabilityType;
import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Service;

/**
 * @author KSASAN preetkaran20@gmail.com
 *
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Service
public @interface VulnerableServiceRestEndPoint {

	/**
	 * Unique name (Endpoint Name)
	 * @return
	 */
	@AliasFor(annotation = Service.class, value="value")
	String name();
	
	/**
	 * For Rest Endpoint to know about all the available Scenarios
	 * @return
	 */
	String description();
	
	/**
	 * Type of Vulnerability
	 * @return
	 */
	VulnerabilityType type(); 
}
