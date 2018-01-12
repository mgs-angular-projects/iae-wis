/**
 * Package contains the service provider
 * 
 * */
package com.iae.wis.service.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.iae.wis.service.constant.WisConstant;

/**
 * @author
 *
 */
@Component
public class WisStudentService extends RouteBuilder {

	@Value("${wis.service.host}")
	private String host;

	@Value("${wis.service.port}")
	private String port;

	@Override
	public void configure() throws Exception {

		restConfiguration().component("restlet").host(host).port(port).bindingMode(RestBindingMode.auto).enableCORS(true)
				.corsHeaderProperty(WisConstant.ALLOW_HEADERS, WisConstant.ALLOW_HEADER_VALUE).corsHeaderProperty(WisConstant.ALLOW_ORIGIN, "*");

		rest("/iaewis").get("/students").produces(WisConstant.APPLICATION_JSON).route().routeId("getStudent").to("direct:getStudents");

		from("direct:getStudents").routeId("getStudentsRoute").log("Received request to retrive all students").bean("wisJdbcRepository", "getStudents()");

	}

}