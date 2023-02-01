/*WELCOME TO CUSTOM END POINT
 * http://localhost:7070/actuator/say-hello
*Annotations for creating custom endpoints
*This can be achieved by adding the 
*@Endpoint and @Component annotation to your class. 
*After that, you can create methods and annotate them with 
*@ReadOperation, @WriteOperation, or @DeleteOperation accordingly.
* You can, of course, have multiple methods with different operations.
*
*@ReadOperation maps to HTTP GET
@WriteOperation maps to HTTP POST
@DeleteOperation maps to HTTP DELETE
*/

package org.sfw.boot.actuator;

import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;

import org.springframework.stereotype.Component;

@Component
@org.springframework.boot.actuate.endpoint.annotation.Endpoint(id = "say-hello")
public class MyEndpoint {
	@ReadOperation
	public String sayHello() {
		return "Hello World Welcome to my  custom end point";
	}

}
