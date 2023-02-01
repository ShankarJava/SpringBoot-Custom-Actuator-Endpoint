/*WELCOME TO ACTUATORS 
* 
* 
* You can enable Actuator into Spring boot project by including below dependency.
*   spring-boot-starter-actuator
*   
*   
*   spring-boot-starter-security
*   url :http://localhost:7070/actuator/health
*   
*
*
*
*
*@Dependencies : Web, DevTools
*@Author callicoder
*@Author Shankar
*/


package org.sfw.boot.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootActuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootActuatorApplication.class, args);
	}

}
