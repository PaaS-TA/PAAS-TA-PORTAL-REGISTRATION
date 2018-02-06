package org.openpaas.portal.registration;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * All you need to run a Eureka registration server.
 * 
 * @author Paul Chapman
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistrationServer {
	public static void main(String[] args) {
		SpringApplication.run(RegistrationServer.class, args);
	}
}
