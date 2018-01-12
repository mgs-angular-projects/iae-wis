/**
 * 
 */
package com.iae.wis.service.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.iae.wis.service.dao.WisJdbcRepository;

/**
 * @author
 *
 */
@Component
public class WisStudentService extends RouteBuilder {

	@Autowired
	private WisJdbcRepository wisJdbcRepository;

	@Value("${wis.service.host}")
	private String host;

	@Value("${wis.service.port}")
	private String port;

	@Override
	public void configure() throws Exception {

		restConfiguration().component("restlet").host(host).port(port).bindingMode(RestBindingMode.auto).enableCORS(true)
				.corsHeaderProperty("Access-Control-Allow-Headers",
						"Origin, Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers")
				.corsHeaderProperty("Access-Control-Allow-Origin", "*");

		rest("/iaewis").get("/students").produces("application/json").route().routeId("getStudent").to("direct:getStudents");

		from("direct:getStudents").routeId("getStudentsRoute").log("Received request to retrive all students").bean("wisJdbcRepository", "getStudents()");

	}

}